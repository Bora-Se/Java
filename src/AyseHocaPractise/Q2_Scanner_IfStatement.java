package AyseHocaPractise;

import java.util.Scanner;

public class Q2_Scanner_IfStatement {
    public static void main(String[] args) {

        /*
        Bir dersten alinan vize, final ve devam puanlarinin girilip ortalama hesaplandiktan sonra
        dersten gecilip gecilmedigini consola yazdiran bir program yazalim.

         */
        // ortalama= vizenin %10 + finalin %80'i + devam notunun %10'u
        Scanner scan = new Scanner(System.in);
        double vizeNot, finalNot, devamNot, ortalama;

        System.out.println("Sirasiyla; \n\t\tVize, \n\t\tDevam, \n\t\tnotlarinizi giriniz");

        System.out.println("Final notunu giriniz");
        finalNot = scan.nextDouble();

        System.out.println("Vize notunu giriniz");
        vizeNot = scan.nextDouble();

        System.out.println("Devam notunu giriniz");
        devamNot = scan.nextDouble();

        // kısayolları yazalim;


        ortalama = ((finalNot/100)*80) + ((vizeNot/100)*10) + ((devamNot/100)*10);
        System.out.println("Not ortalamaniz: "+ ortalama);

        if (ortalama>=70) {
            System.out.println("Tebrikler dersi gectiniz... :)");
        } else if (ortalama>=60) {
            System.out.println("Kosullu gectiniz, \nortalamaniz 1.80'in altinda kaldigi takdirde dersten kalmis olacaksiniz... :(");
        } else if (ortalama>=0) {
            System.out.println("Uzgunuz bu dersi tekrar almaniz gerekmektedir... :\"(");

        }else {
            System.out.println("ortalamaniz hesaplanamiyor, yanlis giris yaptiniz... :/");

        }
        scan.close();

    }
    }

