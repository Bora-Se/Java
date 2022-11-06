package AyseHocaPractise;

import java.util.Scanner;

public class QGrp1 {
    public static void main(String[] args) {
        // Kullanicidan toplanmak uzere sayilar isteyin toplam 50 olur veya gecerse toplami yazdirin


        Scanner scan =new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        while (toplam<=50) {
            System.out.println("Lutfen toplamak uzere sayi girin");
            sayi=scan.nextInt();
            toplam +=sayi;
        }
        System.out.println("girilen sayilarin toplami: " +toplam);
        scan.close();
    }
}
