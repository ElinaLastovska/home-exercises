package io.codelex.classesandobjects.practice.movie;

public class Movie {

    private String title;
    private String studio;
    private String rating;


    Movie() {
    }

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;

    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";

    }


    public static Movie[] getPG(Movie[] all) {

        Movie[] movies = new Movie[all.length];
        int newArr = 0;
        for (int i = 0; i < all.length; i++) {
            if (all[i].rating.equals("PG")) {
                movies[newArr] = movies[i];
            }
            newArr++;
        }
        return movies;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
