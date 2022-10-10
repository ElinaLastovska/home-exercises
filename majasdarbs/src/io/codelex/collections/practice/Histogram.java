package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();

        List<String> myList = new ArrayList<>(Arrays.asList(scores.split(" ")));

        List<Integer> favList = new ArrayList<>();
        for (String fav : myList) {
            favList.add(Integer.parseInt(fav.trim()));
        }
        
        List<Integer> ones = new ArrayList<>();
        List<Integer> tens = new ArrayList<>();
        List<Integer> twenty = new ArrayList<>();
        List<Integer> thirty = new ArrayList<>();
        List<Integer> forthy = new ArrayList<>();
        List<Integer> fifty = new ArrayList<>();
        List<Integer> sixty = new ArrayList<>();
        List<Integer> seventy = new ArrayList<>();
        List<Integer> eighty = new ArrayList<>();
        List<Integer> ninety = new ArrayList<>();
        List<Integer> hundred = new ArrayList<>();

        for (Integer a : favList) {
            if (a < 9) {
                ones.add(a);
            } else if (a > 9 && a < 20) {
                tens.add(a);
            } else if (a > 19 && a < 30) {
                twenty.add(a);
            } else if (a > 29 && a < 40) {
                thirty.add(a);
            } else if (a > 39 && a < 50) {
                forthy.add(a);
            } else if (a > 49 && a < 60) {
                fifty.add(a);
            } else if (a > 59 && a < 70) {
                sixty.add(a);
            } else if (a > 69 && a < 80) {
                seventy.add(a);
            } else if (a > 79 && a < 90) {
                eighty.add(a);
            } else if (a > 89 && a < 100) {
                ninety.add(a);
            } else if (a == 100) {
                hundred.add(a);
            }
        }
        System.out.print("00-09:");
        getStars(ones);
        System.out.print("10-19:");
        getStars(tens);
        System.out.print("20-29:");
        getStars(twenty);
        System.out.print("30-39:");
        getStars(thirty);
        System.out.print("40-49:");
        getStars(forthy);
        System.out.print("50-59:");
        getStars(fifty);
        System.out.print("60-69:");
        getStars(sixty);
        System.out.print("70-79:");
        getStars(seventy);
        System.out.print("80-89:");
        getStars(eighty);
        System.out.print("90-99:");
        getStars(ninety);
        System.out.print("100:");
        getStars(hundred);
    }


    public static void getStars(List<Integer> a) {
        for (int b : a) {
            System.out.print("*");

        }
        System.out.println();
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
