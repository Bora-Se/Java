package day01_Java;

public class sorular {

    public static void main(String[] args) {
        // Soru 1- Kullanicidan uc farkli data turunde deger alip, girilen degerleri aciklamalariyla yazdirin
        String isim = "Ali";
        System.out.println("Hos Geldin  " + isim);
        System.out.println("Hos Geldin\n  " + isim);
        String isim1;
        isim1 = "Ahmet";
        System.out.println("Tesekkurler " + isim1 + " bey!");
        System.out.println("Tesekkurler\n " + isim1);
        int sayi1;
        sayi1 = 10;
        int sayi2;
        sayi2 = 20;
        System.out.println("Buradaki iki sayinin ortalamasi: " + (sayi1 + sayi2) / 2);
        float sayi3;
        sayi3 = 10;
        float sayi4;
        sayi4 = 20;
        System.out.println("Buradaki iki sayinin ortalamasi: " + (sayi3 + sayi4) / 2);
        double sayi5;
        sayi5 = 10.4;
        double sayi6;
        sayi6 = 20.5;
        System.out.println("Buradaki iki sayinin ortalamasi: " + (sayi5 + sayi6) / 2);
        System.out.println("Buradaki iki sayinin toplami: " + (sayi5 + sayi6) + " ve\n " + "bu iki sayinin carpimi: " + (sayi5 * sayi6) + " dır. ");
        String text;
        text=" Ornekler icin Tesekkurler. ";
        System.out.println("Alı Bey; " + text);
    }
}