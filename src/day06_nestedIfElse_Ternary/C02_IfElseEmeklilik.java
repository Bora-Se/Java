package day06_nestedIfElse_Ternary;

import java.util.Scanner;

public class C02_IfElseEmeklilik {
    public static void main(String[] args) {
        /*
        Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        Erkek 65 yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak
        “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen Kadın icin K, Erkek icin E giriniz");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        double yas=scan.nextDouble();

        if (cinsiyet=='K' && yas>=60) {
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet=='K' && yas<60) {
            System.out.println("Emekli olamazsın, daha " + (60 - yas) + " yil calisman lazım");
        } else if (cinsiyet=='E' && yas>=65) {
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet=='E' && yas>=65) {
            System.out.println("Emekli olamazsın, daha " + (65 - yas) + " yil calisman lazım");
        }else {
            System.out.println("Girisleri kontrol edip tekrar deneyin");
        }



    }
    }
