package io.codelex.exeptions.practice;

public class Exercise2 {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (ArithmeticException ae) {
            ae.printStackTrace();

            System.out.println(ae);
        }
        try {
            methodB();
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        }
        try {
            methodC();
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
    }


    public static void methodA() {
        methodB();
    }

    public static void methodB() {
        methodC();
    }

    public static void methodC() {
        int a = 3 / 0;
    }


}
