package day06_nestedIfElse_Ternary;

import java.util.Scanner;

public class C05_NestedIfElse {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
         kullaniciya musteri karti olup olmadigini sorun.
         Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
         Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin.
         Toplam indirim miktari ve odenecek tutarı yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen almak istediginiz urunun adedini \nVe fiyatini giriniz");
        int adet = scan.nextInt();
        scan.nextLine();

        double listeFiyati = scan.nextDouble();

        System.out.println("Musteri karti varsa E, yoksa H tusuna basiniz");
        char kart = scan.next().toUpperCase().charAt(0);

        // aldıgı urun sayisina gore ana iskeleti kuralim
        double toplamsatistutari = adet * listeFiyati;
        double yapilanIndirimTL = 0;
        double odenecekPara = 0;

        /*if (adet > 10) {
            if (kart =='E') { //%20
                System.out.println("Liste fiyatından satis tutari :" + toplamsatistutari+" Tl");
                System.out.println("Size yapilan indirim: "+toplamsatistutari*20/100);
                System.out.println("Odeyeceginiz tutar : "+(toplamsatistutari-toplamsatistutari*20/100));
                }}
        */
        if (adet > 10 && kart == 'E') { //%20
            System.out.println("Liste fiyatından satis tutari :" + toplamsatistutari + " Tl" +
                    "\nSize yapilan indirim: " + toplamsatistutari * 20 / 100 + " Tl" +
                    "\nOdeyeceginiz tutar : " + (toplamsatistutari - toplamsatistutari * 20 / 100) + " Tl");
            //System.out.println("Liste fiyatından satis tutari :" + toplamsatistutari+" Tl");
            //System.out.println("Size yapilan indirim: "+toplamsatistutari*20/100+" Tl");
            //System.out.println("Odeyeceginiz tutar : "+(toplamsatistutari-toplamsatistutari*20/100)+" Tl");

        } else if (adet> 10 && kart == 'H') { //%15
            System.out.println("Liste fiyatından satis tutari: " + toplamsatistutari + " Tl" +
                    "\nSize yapilan indirim: " + toplamsatistutari * 15 / 100 +
                    "\nOdeyeceginiz tutar : " + (toplamsatistutari - toplamsatistutari * 15 / 100) + " Tl");
        } else System.out.println("Kart bilgileri gecersiz.");
        //--------------------- urun adedi 10 adetten az ise

        if (adet <= 10 && kart == 'E') { //%15
            System.out.println("Liste fiyatından satis tutari : " + toplamsatistutari + " Tl" +
                    "\nSize yapilan indirim: " + toplamsatistutari * 15 / 100 + " Tl" +
                    "\nOdeyeceginiz tutar : " + (toplamsatistutari - toplamsatistutari * 15 / 100) + " Tl");

        }else if (kart == 'H') { //%10
            System.out.println("Liste fiyatından satis tutari : " + toplamsatistutari + " Tl" +
                    "\nSize yapilan indirim: " + toplamsatistutari * 10 / 100 + " Tl" +
                    "\nOdeyeceginiz tutar : " + (toplamsatistutari - toplamsatistutari * 10 / 100) + " Tl");
        } else System.out.println("Kart bilgileri gecersiz.");
        System.out.println("Bu soruyu Anladıysan, Yolun Açık Olsun!:))");
        }
    }



