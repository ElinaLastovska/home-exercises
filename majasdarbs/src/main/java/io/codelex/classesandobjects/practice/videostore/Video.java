package io.codelex.classesandobjects.practice.videostore;

public class Video {

    private final String title;
    private int UserRating;
    private Boolean flag;

    public Video(String title, int rating, boolean flag) {
        this.title = title;
        this.UserRating = rating;
        this.flag = flag;
    }

    public String getTitle() {
        return title;
    }

    public void setUserRating(int userRating) {
        UserRating = userRating;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Video: " +
                "title='" + title + '\'' +
                ", UserRating = " + UserRating +
                ", flag = " + flag +
                '}';
    }
}
