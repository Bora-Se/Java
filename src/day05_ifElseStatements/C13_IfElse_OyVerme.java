package day05_ifElseStatements;

public class C13_IfElse_OyVerme {
    public static void main(String[] args) {
        // Soru; Secim için insanların yas ve vatandaslik durumuna göre oy kullanıp kullanamayacagını yazdırınız.
        /* isminizi yazınız
           yasinizi yazin
           vatandaslık drm yaz
         */
        String isim="Berkay";
        int yas=22;
        String vatandas="Isvec";
                boolean oyVerebilir=(yas>=18 && vatandas=="Isvec");
        if (oyVerebilir) System.out.println("Oy kullanabilirsin Gardas");
        if (!oyVerebilir) System.out.println("Oy veremezsin Birader");
        // else System.out.println("Oy veremezsin Birader");
    }
}
