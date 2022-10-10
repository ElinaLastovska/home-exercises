package io.codelex.enums.practice.exercise1;

public enum CardinalPoints {
    NORTH("up"),
    SOUTH("down"),
    EAST("right"),
    WEST("left");

    private final String text;

    CardinalPoints(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
