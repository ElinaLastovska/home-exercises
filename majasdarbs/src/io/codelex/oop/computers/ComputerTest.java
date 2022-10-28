package io.codelex.oop.computers;

public class ComputerTest {
    public static void main(String[] args) {
        Computer a = new Computer("GSDS", "iabs23", "RX234TRG", "HP", "E85I");
        System.out.println(a);
        System.out.println(a.getProcessor());
        System.out.println(a.getRam());
        System.out.println(a.getGraphicsCard());
        System.out.println(a.getCompany());
        System.out.println(a.getModel());
        Computer b = new Computer("SAD##%2", "BA2314", "RX234TRG", "HP", "E85I");
        System.out.println("Are equals? " + a.equals(b));
        Laptop c = new Laptop("ASDA", "3344555", "ZSXAC", "HP", "FNBA23", "100");
        Laptop d = new Laptop("ASDA", "3344555", "ZSXAB", "HP", "FNBA23", "100");
        System.out.println(c);
        System.out.println(c.getProcessor());
        System.out.println(c.getRam());
        System.out.println(c.getGraphicsCard());
        System.out.println(c.getCompany());
        System.out.println(c.getModel());
        System.out.println(c.getBattery());
        System.out.println("Are equals? " + c.equals(d));
    }


}
