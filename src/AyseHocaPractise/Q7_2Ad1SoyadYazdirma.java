package AyseHocaPractise;

import java.util.Scanner;

public class Q7_2Ad1SoyadYazdirma {
    public static void main(String[] args) {
        //Kullanicidan 2 ad ve 1 soyadini alip ustte adlari altta soyadi o s ayri ayri yazdirma
        // Ahmat Nevzat Celik Tefenni

        // Ahmet Nevzat    Ahmet Nevzat Celik Tefenni
        // Celik Tefenni

            Scanner scan = new Scanner(System.in);

            System.out.println("Lutfen 2 adinizi giriniz");

            String adSoyad = scan.nextLine();

            String ad = adSoyad.substring(0,adSoyad.lastIndexOf(" ")+1);
            //String ad = adSoyad.substring(0,adSoyad.indexOf(" "));
            //String ikinciAd= adSoyad.substring(adSoyad.indexOf(" ")+1);
            String soyad = adSoyad.substring(adSoyad.lastIndexOf(" ")+1);
            //String soyad = adSoyad.substring(adSoyad.indexOf(" ")+1);
            // String soyad = adSoyad.substring(adSoyad.indexOf(" ")+1,adSoyad.length());


        System.out.println("Adiniz : "+ ad + "\nSoyadiniz : " + soyad);

        scan.close();

    }

}