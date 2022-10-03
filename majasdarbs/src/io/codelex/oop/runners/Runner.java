package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(90, 100),
    INTERMEDIATE(70, 89),

    ADVANCED(40, 69);

    final int minimumMinutes;
    final int maximumMinutes;

    Runner(int minimumMinutes, int maximumMinutes) {
        this.minimumMinutes = minimumMinutes;
        this.maximumMinutes = maximumMinutes;
    }

    static Runner getFitnessLeve(int minutes) {
        if (minutes >= 90 && minutes <= 100) {
            return BEGINNER;
        } else if (minutes >= 70 && minutes <= 89) {
            return INTERMEDIATE;
        } else if (minutes >= 40 && minutes <= 69) {
            return ADVANCED;
        }
        return null;
    }
}
