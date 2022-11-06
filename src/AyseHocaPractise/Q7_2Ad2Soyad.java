package AyseHocaPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q7_2Ad2Soyad {
    public static void main(String[] args) {
        // 2 ad ve 1 soyadini alip ustte adlari altta soyadlari o s ayri ayri yazdirma
        // Ahmet Nevzat Celik Tefenni

        Scanner scan = new Scanner(System.in);

        String ad="AHMET NEVZAT";  // Ahmat Nevzat Celik Tefenni

        String soyAd="Celik Tefenni"; // Celik Tefenni

        System.out.println("isminiz: "+ad+"\nsoyisiminiz: " +soyAd);

        System.out.println("---------------------------------------------------------------");

        //Arrays icin Ornek

        String[]name = new String[2];
        name[0]="Ahmet";
        name[1]="Nevzat";

        String[]surName = new String [2];
        surName [0]= "Celik";
        surName [1]= "Tefenni";

        System.out.println(Arrays.toString(name));
        System.out.println(Arrays.toString(surName));

        System.out.println("-------------");

        //list Array
        ArrayList<String> isim= new ArrayList<>();
        isim.add("Ahmet Nevzat");
        isim.add("Celik Tefenni");
        System.out.println("isminiz: "+ isim.get(0)+"\nsoyisminiz: "+ isim.get(1) + "'dir");
        //String[]Months = {"J"}
        System.out.println("------------------------------------------------------------------------");

        System.out.println("Lutfen adinizi ve soyadinizi giriniz: ");
        String isimSoyisim = scan.nextLine();

        //String isim = isimSoyisim.substring();


    }
}

      // \\s  \\S \\w \\W \\d \\D
