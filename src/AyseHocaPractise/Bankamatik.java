package AyseHocaPractise;

import java.util.Scanner;

public class Bankamatik {
    /*
     * Ask user Name, Surname and credit card numbers than convert it to special
     * form
     *
     * (Check credit card number, if there aren’t 16 digit print
     * “Invalid credit card number”
     *
     * Input : John White 1234234534561478
     * Output : Name : J*** W****
     *          CCN  : **** **** **** 1478
     *  (Initials for name and surname should be uppercase)
     */
    public static void main(String[] args) {

        System.out.println("**********************************************");
        System.out.println("\tATM`ye Hosgeldiniz.");
          // \t metni ortalar
        String menu = "1.Islem : Bakiye Sorgulama" +
        "\n2.Islem : Para Yatirma" +
        "\n3.Islem : Para Cekme" +
        "\n4.Islem : Cikis";
        System.out.println(menu);
        System.out.println("**********************************************");

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yapmak istediginiz islemi seciniz : ");

        int bakiye = 1000;
        int islem = scan.nextInt();

        switch (islem) {

            case 1 :
                System.out.println("Bakiyeniz : "+ bakiye + " £");
                break;

            case 2 :
                System.out.println("Yatirmak istediginiz tutari giriniz : ");
                int tutar = scan.nextInt();

                bakiye+=tutar;
                System.out.println("Yatirilan tutar : "+ tutar + " £" +
                        "\nYeni bakiyeniz : " + bakiye + " £");
                break;
            case 3 :
                System.out.println("Cekmek istediginiz tutari girin : ");
                int cekilen = scan.nextInt();

                if(cekilen <=bakiye) {
                    bakiye-= cekilen;

                    System.out.println("Kalan Bakiyeniz : " + bakiye + " £" +
                            "\nYeni bakiyeniz : " + bakiye + " £");
                }else System.out.println("Yetersiz Bakiye!!!");
                break;

            case 4 :
                System.out.println("Cikis Yapiliyor...");
                break;
            default:
                System.out.println("Gecersiz Islem!!!");
                break;
                /*

            case 2 :
                System.out.print("Yatirmak istediginiz tutari giriniz : ");
                int tutar = scan.nextInt();
​
                bakiye+=tutar;
                System.out.print("Yatirilan tutar : "+ tutar +" €\nYeni bakiyeniz : "+ bakiye + " €");
                break;
            case 3 :
                System.out.print("Cekmek istediginiz tutari girin : ");
                int cekilen = scan.nextInt();
​
                if(cekilen<=bakiye){
                    bakiye-=cekilen;
                    System.out.print("Kalan bakiyeniz : "+ bakiye);
                }else System.out.println("Yetersiz Bakiye!!!");
                break;

                 */

        }
    }
}
