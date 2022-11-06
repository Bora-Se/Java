package day05_ifElseStatements;
import java.util.Scanner;
public class C01_IfStatements {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        int not= scan.nextInt();
        if (not>=50) {
            System.out.println("Sınıfı Geçtin");
        }
        if (not<50){
            System.out.println("Maalesef Kaldın");

        }

    }
}
