package day05_ifElseStatements;

import java.util.Scanner;

public class C10_IfElseBora2 {
    public static void main(String[] args) {
        //Soru:2 Kullanıcıdan Matematik dersi için, bir yazılı ve bir sözlü notlarını alınız.
        //Yazılı notunun %70 ini ve sözlü notunun da %30 unu alıp topladığımızda,
        // kullanıcının puanı eğer 80 puan ve üzerinde ise “Dersi geçtiniz, Tebrikler!”,
        // 60 puan ve üzerinde ise "Dersi geçtiniz", değilse “Dersten kaldınız” yazdırın.
        //(Ders Geçme Notu=(yazılıNotu*0.7)+(sözlüNotu*0.3)

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yazılı notunuzu girin");
        double yNot=scan.nextDouble();
        System.out.println("Lutfen sozlu notunuzu girin");
        double sNot=scan.nextDouble();

        double matNot=(yNot*0.7)+(sNot*0.3);
        System.out.println("Matematik Notunuz: " +matNot +"'dir");

        if (matNot>=80) System.out.println("Dersi geçtiniz, Tebrikler!");
        else if (matNot>=60) System.out.println("Dersi geçtiniz");
        else System.out.println("Dersten kaldınız");

        }
    }


