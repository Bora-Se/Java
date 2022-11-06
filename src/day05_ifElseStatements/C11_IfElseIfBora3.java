package day05_ifElseStatements;

import java.util.Scanner;

public class C11_IfElseIfBora3 {
    public static void main(String[] args) {
        //

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yazılı notunuzu girin");
        double yNot=scan.nextDouble();
        System.out.println("Lutfen sozlu notunuzu girin");
        double sNot=scan.nextDouble();

        double matNot=(yNot*0.7)+(sNot*0.3);
        System.out.println("Matematik Notunuz: " +matNot +"'dir");

        if (matNot>=80) {
            System.out.println("Dersi geçtiniz, Tebrikler!");
        }else if (matNot>=60) {
            System.out.println("Dersi geçtiniz");
        } else {
            System.out.println("Dersten kaldınız");
        }

    }
}
