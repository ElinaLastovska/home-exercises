package io.codelex.collections.practice.phonebook;

public class TestPhone {
    public static void main(String[] args) {

        PhoneEntry a = new PhoneEntry("Es", "nr");
        PhoneEntry c = new PhoneEntry("Tu", "nrrr");
        PhoneEntry d = new PhoneEntry("Tu", "nar");
        PhoneDirectory b = new PhoneDirectory();
        b.putNumber(a);
        b.putNumber(c);
        b.printDirectory();
        b.putNumber(d);
        b.printDirectory();
    }
}
