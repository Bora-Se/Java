package AyseHocaPractise;

import java.util.Scanner;

public class Q8_OrtadakiHarfiYazdirma {
    public static void main(String[] args) {
         /*
    Cift sayida harf iceren bir String degiskenin ortasindaki harfi
    konsolda yazdirmak icin bir Java programi yaziniz.
    Eger kelime cift sayida harf iceriyorsa ortadaki 2 harfi yazdirin
    ORNEK:
        INPUT  :  Python
        OUTPUT :  th
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Cift sayida harf iceren bir kelime giriniz \n Enter a word with an even numbers of letters");
        String word;
        word = scan.next();
        String result = "";
        int length = word.length();
        int middle = 0;
        if (length == 2) {     // Kelime sadece 2 harften olusuyor ise...
            System.out.println(word);
        } else if (length % 2 == 1) {   // Kullanici yanlislikla tek sayida harften olusan kelime girdiyse...
            middle = word.length() / 2;
            result = word.charAt(middle) + "";
            System.out.println(" Middle two letters of the entered word: " + result);
        } else { // Cift sayida harften olusan kelime girilmis ise ortadaki bulunur, ortadaki ile onceki harf yazdirilir
            middle = word.length() / 2;
            result = word.charAt(middle - 1) + "" + word.charAt(middle);
            System.out.println(" Middle two letters of the entered word: " + result);
        }
        scan.close();



    }
}
