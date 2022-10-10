package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static <Item> void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> flights = Files.readAllLines(path, charset);
        Map<String, String> map2 = new HashMap<>();


        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like to do:");
        System.out.println("To display list of the cities press 1");
        System.out.println("To exit program press # > 1");
        int choice = scan.nextInt();

        if (choice == 1) {

            System.out.println("To select a city from which you would like to start press 1");
            int choice2 = scan.nextInt();
            scan.nextLine();

            if (choice2 == 1) {

                displayList(flights);

                boolean doLoop = true;
                while (doLoop) {

                    System.out.println("Where would you like to go?");
                    String choice3 = scan.nextLine();

                    chooseCity(choice3, flights);
                    System.out.println("Your destination? ");

                    String choice4 = scan.nextLine();

                    for (String b : flights) {

                        if (b.startsWith(choice3) && b.endsWith(choice4)) {

                            Map<String, String> map = Pattern.compile("\\\\b([^\\\\s]+)=([^\\\\s]+)\\\\b")
                                    .splitAsStream(b.trim())
                                    .map(s -> s.split("->", 3))
                                    .collect(Collectors.toMap(s -> s[0], s -> s.length > 1 ? s[1] : ""));

                            if (areEqual(map, map2)) {
                                System.out.println("You made full circle!");
                                System.out.println("Your flight plan - ");
                                //   System.out.println(map2);
                                displayMap(map2);
                                doLoop = false;

                            } else {
                                map2.putAll(map);
                                //  System.out.println(map2);
                                System.out.println("Added to your flight List!");
                                chooseCity(choice4, flights);
                            }

                        }
                    }

                }

            } else {
                System.out.println("Bye!");
            }

        } else {
            System.out.println("Bye!");
        }

    }

    public static void displayList(List<String> flights) {
        flights.forEach(System.out::println);
        System.out.println();
    }

    public static void displayMap(Map<String, String> map2) {
        for (String name : map2.keySet()) {
            String key = name;
            String value = map2.get(name);
            System.out.println(key + "->" + value);
        }
    }

    public static void chooseCity(String choice3, List<String> flights) {
        System.out.println("You can choose:");
        for (String b : flights) {

            if (b.startsWith(choice3)) {

                System.out.println(b);

            }
        }
    }


    private static boolean areEqual(Map<String, String> map, Map<String, String> map2) {

        return map.entrySet().stream()
                .allMatch(e -> e.getValue().equals(map2.get(e.getKey())));
    }
}
