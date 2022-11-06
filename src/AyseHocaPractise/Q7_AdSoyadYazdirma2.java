package AyseHocaPractise;

import java.util.Scanner;

public class Q7_AdSoyadYazdirma2 {
    //Kullanicidan ad soyadini alip ustte ad altta soyad o s ayri ayri yazdirma Nevzat Celik

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen adinizi ve soyadinizi giriniz");

        String adSoyad = scan.nextLine();

        String ad = adSoyad.substring(0,adSoyad.indexOf(" "));
        String soyad = adSoyad.substring(adSoyad.indexOf(" ")+1);
        // String soyad = adSoyad.substring(adSoyad.indexOf(" ")+1,adSoyad.length());



        System.out.println("Adiniz : "+ ad + "\nSoyadiniz : " + soyad);

        scan.close();
    }


}
