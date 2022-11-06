package day05_ifElseStatements;

import java.util.Scanner;

public class C07_XIfElseIfStatements {
    public static void main(String[] args) {
         /*
         Soru 4- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi sorun,
          istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
          “istediginiz birim sisteme kayitli degil” yazdirin.
          */

        Scanner scan = new Scanner(System.in);
        System.out.println("Cevirmek istediğiniz mesafeyi km olarak yazın");
        int mesafeKm= scan.nextInt();
        System.out.println("Cevirmek istediğiniz birimi seçin " +
                "\nM : Metre  \nS : Santimetre");
        char tercih=scan.next().charAt(0);
        if (tercih=='M' || tercih=='m') {
            System.out.println("Girilen mesafenin metre olarak karsılığı : "+ mesafeKm);
        }


    }
}
