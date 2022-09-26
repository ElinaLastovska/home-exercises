package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

import static io.codelex.classesandobjects.practice.videostore.VideoStore.*;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");

            int n = keyboard.nextInt();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                default:
                    break;
            }

        }

    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String title = scanner.next();
            System.out.println("Enter rating");
            int rating = scanner.nextInt();
            boolean flag = true;

            Video a = new Video(title, rating, flag);
            addNewVideo(a);

            System.out.println(a);

        }
    }


    private static void rentVideo(Scanner scanner) {
        System.out.println("Enter movies title that you want to checkout: ");
        String movieTitle = scanner.next();
        checkOutVideo(movieTitle);
        System.out.println(inventoryOfStore.toString());

        listInventory();
    }

    private static void returnVideo(Scanner scanner) {
        System.out.println("Enter movies title that you want to return: ");
        String movieTitle = scanner.next();
        videoReturn(movieTitle);
        System.out.println("Enter movies rating: ");
        int rating = scanner.nextInt();
        videoRaiting(movieTitle, rating);

        listInventory();
    }
}
