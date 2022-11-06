package AyseHocaPractise;

import java.util.Scanner;

public class Q12_BolmeMethodu {


    static int bolum;

    public static void main(String[] args) {
        //Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
        //kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bolunen bir sayi giriniz");
        int bolunenSayi = scan.nextInt();
        System.out.println("Lutfen bolen bir sayi giriniz");
        int bolenSayi = scan.nextInt();

        System.out.println("Sonuc: "+ bolmeIslemi(bolunenSayi,bolenSayi));;

    }

    public static int bolmeIslemi(int a, int b) {
        while (a >= b) {
            a -=b;
            bolum++;


        }
        return bolum;
    }

}
