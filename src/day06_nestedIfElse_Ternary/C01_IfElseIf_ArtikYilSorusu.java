package day06_nestedIfElse_Ternary;

import java.util.Scanner;

public class C01_IfElseIf_ArtikYilSorusu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("artık yil kontrolu icin yil giriniz");
        int yil=scan.nextInt();
        if (yil%4 !=0) { // yil 4 e bolunuyor mu ==> Hayir
            System.out.println("Girilen yil artik yil degil");
        }else if (yil%100 !=0) { // yil 100 e bolunuyor mu ==> Hayir
            System.out.println("Girilen yil yil");
        }else if (yil%400 !=0) { // yil 400 e bolunuyor mu ==> Evet
            System.out.println("Girilen yil artık yil");
        }else {
            System.out.println("Girilen yil artik yil degil");

        }
    }
}
