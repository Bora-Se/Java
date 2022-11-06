package AAA1;

import java.util.Scanner;

public class C01_matematik {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Lutfen adınızı gırın: ");
        String ısım = scan.nextLine();

        System.out.println(" Lutfen soy adınızı girin: ");
        String soyAd = scan.nextLine();

        System.out.println("Lutfen yasınızı gırın: ");
        int yas = scan.nextInt();

        scan.nextLine();

        System.out.println(" Lutfen adress gırın: ");
        String adress = scan.nextLine();

        System.out.println("ısım = " + ısım);
        System.out.println("soyAd = " + soyAd);
        System.out.println("yas = " + yas);
        System.out.println("adress = " + adress);

        scan.close();
    }
}

