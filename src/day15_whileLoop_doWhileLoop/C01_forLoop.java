package day15_whileLoop_doWhileLoop;

public class C01_forLoop {
    public static void main(String[] args) {
        // iki basamaklı sayılardan 7 ile bolunebilenleri yan yana yazınız.

        for (int i = 10; i < 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
