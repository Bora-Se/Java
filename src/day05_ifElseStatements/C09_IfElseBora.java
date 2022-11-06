package day05_ifElseStatements;

import java.util.Scanner;

public class C09_IfElseBora {
    public static void main(String[] args) {
        //Kullanıcıdan Matematik dersi için, bir yazılı ve bir sözlü notlarını alınız.
        // Yazılının %70 ini ve sözlününde %30 unu alıp topladığımızda, kullanıcının puanı
        // eğer 50 puan ve üzerinde ise “Dersi geçtiniz”, değilse “Dersten kaldınız” yazdırın.
        // (Ders Geçme Notu=(yazılıNotu*0.7)+(sözlüNotu*0.3)
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yazılı notunuzu girin");
        double yazılıNotu=scan.nextDouble();
        System.out.println("Lutfen sözlu notunuzu girin");
        double sozluNotu=scan.nextDouble();

        double dgn=(yazılıNotu*0.7)+(sozluNotu*0.3);
        System.out.println("Ders geçme notunuz: "+  dgn);
        if (dgn>=50) {
            System.out.println("Dersi geçtiniz");
        } else {
            System.out.println("Dersten kaldınız");
        }

    }
}
