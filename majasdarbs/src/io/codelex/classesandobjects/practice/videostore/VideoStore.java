package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

public class VideoStore {


    static ArrayList<Video> inventoryOfStore = new ArrayList<>();

    public VideoStore() {

    }

    public static void videoRaiting(String movieTitle, int rating) {

        for (Video a : inventoryOfStore) {
            if (a.getTitle().contains(movieTitle)) {
                a.setUserRating(rating);
            }
        }
    }

    public static void addNewVideo(Video a) {
        inventoryOfStore.add(a);
    }

    public static void videoReturn(String movieTitle) {
        for (Video a : inventoryOfStore) {
            if (a.getTitle().contains(movieTitle)) {
                a.setFlag(true);
            }
        }
    }

    public static void listInventory() {
        System.out.println(inventoryOfStore.toString());
    }

    public static void checkOutVideo(String movieTitle) {
        for (Video a : inventoryOfStore) {
            if (a.getTitle().contains(movieTitle)) {
                a.setFlag(false);
            }
        }
    }
}
