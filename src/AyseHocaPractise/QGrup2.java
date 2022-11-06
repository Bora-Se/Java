package AyseHocaPractise;

import java.util.Scanner;

public class QGrup2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();

        System.out.println("Bir sayı giriniz");
        int tamkare= sayi*sayi;


        for (sayi=1; sayi<100; sayi++) {
            if (false) {
                System.out.println("tamkare değil");

            break;

        }else {
                System.out.println("Girdiğiniz "+sayi + tamkare+ " nin karesidir");
            }
        }

    }
}
