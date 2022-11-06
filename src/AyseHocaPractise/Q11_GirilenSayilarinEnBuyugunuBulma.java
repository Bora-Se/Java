package AyseHocaPractise;

import java.util.Scanner;

public class Q11_GirilenSayilarinEnBuyugunuBulma {
    //Kullanicidan 5 sayi isteyiniz ve bu sayilarin en buyugunu yazdirin

    public static void main(String[] args) {

        System.out.println("Lutfen 5 sayi giriniz : ");
        Scanner scan = new Scanner(System.in);
        int enBuyukSayi = 0;
        int count = 0;

        while (count<5) {
            System.out.println("Lutfen bir tamsayi giriniz : ");
            int sayi = scan.nextInt();
            if (sayi>enBuyukSayi){
                enBuyukSayi = sayi;
            }
            count++;
        }
        System.out.println("Girdiginiz sayilarin en buyugu = "+ enBuyukSayi );

    }
}
