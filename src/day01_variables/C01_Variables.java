package day01_variables;

public class C01_Variables {


    public static void main(String[] args) {


        System.out.println("Hello World");

        // Buraya yazilan yazilari Java okumaz
        // bu satirlara comment denir
        // kod yazan kisinin kendisine veya takim arkadaslarina
        // kodun nasil calistigini anlatmasi icin kullanilir

        /* Java bu satirlardaki kodlari da okumaz  */

        int sayi=12;
        int numara;
        System.out.println(sayi); //12

        /*System.out.println(numara);
        Java deger atamasi olmadan sadece deklarasyon yapmamiza izin verir
        ancak deger atamasi yapmadan kullanmamiza izin vermez  */

        numara=20;
        System.out.println(numara); //20

        /*String numara=40;
        deklarasyon sadece bir kere olur, ama deger atamasi istedigimiz kadar yapilabilir*/
        System.out.println("---------------------------------------------");

    }}

        /*
        package day05_ifElseStatements;

        import java.util.Scanner;
public class C01_IfStatements{

    public static void main(String[] args) {
        // basit if cumleleri ile ilgili ornek
        // Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not= scan.nextDouble();
        if (not>=50){
            System.out.println("Sinifi gectin");
            // if (not>=50)System.out.println("Sinifi gectin");
        }if (not<50){
            System.out.println("Maalesef kaldin");
        }}} */