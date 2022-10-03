package io.codelex.oop.parcels;

public class testParcel {
    public static void main(String[] args) {
        Parcel a = new Parcel(30, 31, 31, 30, false);
        System.out.println(a.validate());
        Parcel b = new Parcel(29, 29, 29, 15, true);
        System.out.println(b.validate());
        Parcel c = new Parcel(29, 29, 29, 15, false);
        System.out.println(c.validate());
    }
}
