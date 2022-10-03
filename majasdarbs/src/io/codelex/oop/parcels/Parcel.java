package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    int xLength;
    int yLength;
    int zLength;
    float weight;
    boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {

        if (xLength + yLength + zLength > 300) {
            System.out.println("Your parcel are too big");
            return false;
        } else if (xLength > 30 || yLength > 30 || zLength > 30) {
            System.out.println("Some sides of your parcel are too long");
            return false;
        } else if (!isExpress && weight >= 30.0) {
            System.out.println("Your parcel are too heavy");
            return false;
        } else if (isExpress && weight >= 15.0) {
            System.out.println("Your parcel are too heavy");
            return false;
        }
        System.out.println("You are good to go!");
        return true;
    }
}