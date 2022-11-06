package day05_ifElseStatements;

import java.util.Scanner;

public class C12_IfElseBora4 {
    public static void main(String[] args) {
        /*Soru: asagıdaki puan durumuna gore, puana asagidaki yorumlar yazdırınız.
            90-100 ==> Süper
            80-89 ==> Cok iyi
            70-79 ==> İyi
            60-69 ==> Gectiniz
            0-59 ==> Kaldınız
         */
        // Once puanı girelim, sonra puan aralıklarını tanımlayalım.
        int puan=-100;
        boolean a= puan>= 90 && puan<=100;
        boolean b= puan>= 80 && puan<=89;
        boolean c= puan>= 70 && puan<=79;
        boolean d= puan>= 60 && puan<=69;
        boolean f= puan>= 0 && puan<=59;

        if (a) System.out.println("Puanınız super");
        else if (b) System.out.println("Puanınız cok iyi");
        else if (c) System.out.println("Puaniniz iyi");
        else if (d) System.out.println("Gectiniz");
        else if (f)System.out.println("Kaldınız Abiii");
        else System.out.println("Gecersiz puan");

        }
    }
