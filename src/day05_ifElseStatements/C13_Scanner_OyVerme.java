package day05_ifElseStatements;

import java.util.Scanner;

public class C13_Scanner_OyVerme {
    public static void main(String[] args) {
        /*
         String isim="Berkay";
        int yas=16;
        String vatandas="Isvec";
                boolean oyVerebilir=(yas>=18 && vatandas=="Isvec");
        if (oyVerebilir) System.out.println("Oy kullanabilirsin Gardas");
        if (!oyVerebilir) System.out.println("Oy veremezsin Birader");
        // else System.out.println("Oy veremezsin Birader");
         */
        // yas>18 ve vatandas ise oy kullanır, yoksa kullanamaz.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen İsminizi yaziniz");
        String isim=scan.next();

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();
        scan.nextLine();

        System.out.println("Lutfen ulkenizin ismini yaziniz");
        String ülke = scan.nextLine();
        ülke = "Isvec";

        if (yas >= 18 && ülke == "Isvec") System.out.println("Oy kullanabilirsiniz");
        else System.out.println("Oy-moy Yok Gardas");
    }}

        //System.out.println("Lutfen vatandas isen 'E', degilsen 'H' yazınız");
        //char vatandas='E'
        //scan yas=


