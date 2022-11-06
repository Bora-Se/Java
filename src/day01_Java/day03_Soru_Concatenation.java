package day01_Java;

import java.util.Scanner;

public class day03_Soru_Concatenation {
    public static void main(String[] args) {
        //Dataları, değerleriyle yazalım
        String s1= "Java";
        String s2= " ";
        String s3= "kolay";
        String s4= "";

        int a= 3;
        int b= 4;
        /* 12 Java kolay
        7 Java kolay
        34Java kolay
        Java12kolay
        Java34kolay
        Java7kolay
        */
        System.out.println(a*b+s2+s1+s2+s3);
        System.out.println(a+b+s2+s1+s2+s3);
        System.out.println(a+(b+s1)+s2+s3);
        System.out.println(s1+a*b+s3);
        System.out.println(s1+a+b+s3);
        System.out.println(s1+(a+b)+s3);

        //Kullanicidan bir sayi isteyin,
        // sayiyi kontrol edip 5 ile bolunebiliyorsa “Sayi 5’in tam kati” yazdirin.
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayi giriniz.");
        int girilenSayi= scan.nextInt();

        if (girilenSayi % 5==0);
        System.out.println("Girilen sayi 5 in tam katıdır.");

        if (girilenSayi % 5==0){
        System.out.println("Girilen sayi 5 in tam katıdır.");
        }
}
}
