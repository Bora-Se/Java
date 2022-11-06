package day01_Java;

public class Deneme {
    public static void main(String[] args) {
        /* Not-1; Berkay'ı Tanıyalım:
        kişisel bilgiler
            1.Isim
            2.yas
            3.calıstıgı şirket
            4.full-tıme
            5.cinsiyet
            6.kaç yıl tecrube
            7.Kısaca kimdir?
         */
        System.out.println("1. Berkay'ı Tanıyalım");
        System.out.println("Kişisel bilgiler:");
        String ısım= "Berkay Şükrü";
        String soyad= "ÇelikAdam";
        int yas= 21;
        String şirket= "XYZ";
        boolean fullTime= true;
        char EyadaK= 'E';
        double tecrube= 2.5;
        String numara= "076-1561302";


        System.out.println("ısım = " + ısım);
        System.out.println("soyad = " + soyad);
        System.out.println("yas = " + yas);
        System.out.println("şirket = " + şirket);
        System.out.println("fullTime = " + fullTime);
        System.out.println("EyadaK = " + EyadaK);
        System.out.println("tecrube = " + tecrube);
        System.out.println("numara = " + numara);

        System.out.println("Ben " + ısım +" "+  soyad+ ",\n "+ yas+" yasındayım, Isveç'te yasıyorum ve " + şirket+ "'de çalışıyorum.");
        System.out.println("---- -------------------------------------------------- ------");
        System.out.println("                                                              ");

        System.out.println("---- 2. Aşağıdakı sayıların toplamını, çarpımını, ortalamasını, karesını ve küpünü bulalım. ----");

        // Not; Aşağıdakı 3 sayının toplamını, çarpımını, ortalamasını, karesını ve küpünü bulalım.
        double n1 = 10.9;
        double n2 = 12.3;
        double n3 = 3.0;

        System.out.println("---- Sayıların Toplamı ------");

        System.out.println("Yukarıdaki üç sayının toplamı =" + (n1+n2+n3) + "'dür.");
        System.out.println("Yukarıdaki üç sayının toplamı =" +(int)(n1+n2+n3) + "'dir.");
        System.out.println("Yukarıdaki üç sayının toplamı =" +((int)n1+(int)n2+(int)n3) + "'dir.");
        System.out.println("Yukarıdaki üç sayının toplamı =" +(float)(n1+n2+n3) + "'dir.");
        System.out.println("Yukarıdaki üç sayının toplamı =" +(double)(n1+n2+n3) + "'dir.");

        System.out.println("----- Sayıların Çarpımı ------");

        System.out.println("Yukarıdaki üç sayının çarpımı= " + (n1 * n2 * n3));
        System.out.println("Yukarıdaki üç sayının çarpımı= " +(int)(n1 * n2 * n3));
        System.out.println("Yukarıdaki üç sayının çarpımı= " +((int)n1 * (int)n2 * (int)n3));
        System.out.println("Yukarıdaki üç sayının çarpımı= " +(float)(n1 * n2 * n3));
        System.out.println("Yukarıdaki üç sayının çarpımı= " +(double)(n1 * n2 * n3));

        System.out.println("----- Sayıların Ortalaması -----");

        System.out.println("Bu uc sayının ortalaması= " + (n1+n2+n3)/3 + "'dir.");
        System.out.println("Bu uc sayının ortalaması= " + (int)(n1+n2+n3)/3 + "'dir.");
        System.out.println("Bu uc sayının ortalaması= " + ((int)n1+(int)n2+(int)n3)/3 + "'dir.");
        System.out.println("Bu uc sayının ortalaması= " + (float)(n1+n2+n3)/3 + "'dir.");
        System.out.println("Bu uc sayının ortalaması= " + (double)(n1+n2+n3)/3 + "'dir.");


        System.out.println("---  Sayıların Karesi-küpü ----------");

        //Sayıların Karesi-küpü-----------
        System.out.println((n3) + " sayısının karesi= " + (int) (n3*n3) + "'dur.");
        System.out.println((int)(n3) + " sayısının karesi= " + (int) (n3*n3) + "'dur.");
        System.out.println((n1) + " sayısının karesi= " + (n1*n1) + "'dir.");
        System.out.println((n1) + " sayısının karesi= " + (int)(n1*n1) + "'dir.");
        System.out.println((n1) + " sayısının karesi= " + ((int)n1*(int)n1) + "'dir.");
        System.out.println((n2) + " sayısının küpü= " + (int)(n2*n2*n2) + "'dir.");
        System.out.println((n3) + " sayısının küpü= " + (int)(n3*n3*n3) + "'dir.");

        //Değer değiştirme--------------
        System.out.println("----3. Değer değiştirme----");

        String isim1 = "Bora";
        System.out.println(isim1);
        isim1= "Berkay";
        System.out.println(isim1);
        System.out.println("--------------------------------------------");

        System.out.println("Not:  :)))   \n " +"    Umarım bu örnekler, sizin için de faydalı olur.\n " +  "     :)))");

    }
}
