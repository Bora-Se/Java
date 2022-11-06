package AyseHocaPractise;

import java.util.Scanner;

public class Q9_CumledeKelimeAratma {
    /*
     * Kullanicidan bir kelime ve cumle aliniz
     * Kelimeyi cumle icinde aratip yazdiriniz
     *
     * Orn : Cumle = "hihihi" String = "hi" output = "hihihi" ' nin icinde 3 tane "hi" var
     * Orn : Cumle = "Yoldayim" String = "yol" output = "Yoldayim" in icinde 1 tane "yol" var
     *
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Ben bir ceviz agaciyim  ===> aciyim   uzunluktan aradigimin uzunlugu...
        System.out.println("Lutfen bir cumle giriniz");
        String sentence = scan.nextLine();
        System.out.println("Lutfen aratmak istediginiz kelimeyi giriniz");
        String word = scan.nextLine();
        int count = 0;

        for (int i = 0; i <= sentence.length()-word.length() ; i++) {

            if (sentence.substring(i,i+word.length()).equalsIgnoreCase(word)){
                count++;

            }

        }
        if (count>=1) {
            System.out.println("Bu cumlede " + count + " adet " + word + " var");
        } else  System.out.println("Bu cumlede " + word + " yok!");
    }
}
