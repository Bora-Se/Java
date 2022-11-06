package AaNot;

import day19_arrays.C04_ElementArama;

import java.util.Arrays;

public class C02_Array2 {
    public static void main(String[] args) {

        String isim="Ali"; int sayi=15; char harf='a'; double sayi2=15.3;  double sayi3=15;  boolean dogruMu=true;
    // 1- Bir array olusturulurken 2 sey deklare edilmek zorundadir.
        int [ ] arr1;    String [] arr5;
        String [] isimler= new String[5]; //Dikkat degerler?

    // 2- Bir array 2 sekilde deklare edilir;
        int [] arrr;     int arrr2 [];
        //Deklare?  Degerler?  Uzunluk?   Java referans olusturu ama uzunluk olm icin objeyi olusturamaz

    //3- Bir array’e 2 sekilde deger atanabilir
        int [] arr= {1, 2, 3, 4, 5};  // ya da [1, 2, 3, 4, 5] seklinde
        int [ ] arr2 = new int [3];
        String [] ogrenciler={"Ali", "Murat", "Yakup", "Fatma", "Meryem", "Zeynep"};
        //String [] isimler={"Ali", "Veli", "Ayse", "Fatma", 5};
        //String [] isimler={"Ali", "Veli", "Ayse", "Fatma"};
        String [] mevsimler= new String[4];
        //String [] mevsimler={"Ilkbahar", "Yaz", "Sonbahar", "Kis"};

        // =========================================================================\\
    // 4- Bir array’in length’i nasil bulunur ?
        //int [] arr3= {1, 2, 6, 7, 8};
        //int [] arr4= {1, 5, 8, 10, 3};
        System.out.println("******* Array'lerin uzunluklari *******");
        System.out.println(arr.length);
        System.out.println(mevsimler.length);
        System.out.println(isimler.length);
        System.out.println(ogrenciler.length);

       /*// =========================================================================\\
    // 5- Bir array’de istenen index’deki elemana nasil ulasilir ?  arr[i] =?
        //System.out.println(arr[3]);
        System.out.println("***** Index'teki eleman ****");
        System.out.println(arr[2]);
        arr[2]=33;
        System.out.println("Index 2 deki yeni eleman: "+ arr[2]);

    // 6- Bir array’in tum elemanlari nasil yazdirilir ? For-Loop kullanalim.
       int [] arr4= {1, 5, 15, 25, 20, 10};
        System.out.println("*** int elemanli Arraysin tum elemanlarini yazdiralim***");
       for(int i=0; i<arr4.length; i++){
        System.out.print(arr4[i]+ "  ");
            }
            System.out.println("\n*** MEVSIMLERI YAZDIRALIM  ***");
      //String [] mevsimler={"Ilkbahar", "Yaz", "Sonbahar", "Kis"};
        for(int i=0; i<arr4.length; i++){
        System.out.println(arr4[i]+ "  ");
            }
*/
    //7- Bir array nasil yazdirilir ?  toString( )
        // Array direk yazdirilamaz, direk yazdirmak isterseniz array’i degil referansini yazdirir.
        // Array’i yazdirmak icin Arrays class’indan toString( ) method’u kullanilmalidir.
        // int [] arr= {1, 2, 3, 4, 5};

        /*System.out.println("*** int elemanli Arraysi yazdiralim***");
        System.out.println(arr);  //[I@6bf256fa
        System.out.println(Arrays.toString(arr)); //[1, 5, 15, 25, 20, 10]

        System.out.println(arr4);  //[I@6bf256fa
        System.out.println(Arrays.toString(arr4)); //[1, 5, 15, 25, 20, 10]

        System.out.println("*** String elemanli Arraysi yazdiralim***");
        System.out.println(mevsimler);  // [Ljava.lang.String;@6cd8737
        System.out.print(Arrays.toString(mevsimler)); // [null, null, null, null]  */

/*    // 8- Bir array’in elemanlari nasil siralanir ?    .sort(arr )   int [] arr4= {1, 5, 15, 25, 20, 10};
        Arrays.sort(arr4);
        System.out.println("\n*** .sort yapilmis, int elemanli Arraysi yazdiralim***"); //[1, 5, 10, 15, 20, 25]
        System.out.println("arr4 un siralanmis sekli: " + Arrays.toString(arr4));
*/
        // =========================================================================\\

    //9- Bir array’de istenen elemanin varligi nasil kontrol edilir ?
        //Array’lerde istenen bir elemanin varligini kontrol etmek icin;  .binarySearch( ) method’u kullanilir.
        //Ancak, binarySearch( ) kullanmadan once MUTLAKA .sort( ) ile siralama yapilmalidir.
        //Arrays.sort( ) kullanilmadan da binarySearch( ) calisir ancak sonuclarinin ne olacagi BILINEMEZ.
        //binarySearch( ) ile array’de olmayan bir eleman aranirsa, olmasi gereken sirayi – ile VERIR.
        String[] ornek = {"Fatih","Muhammet","Jacob","Dalyan","Bora","Esra","Naci"};
    /* Binary search bir array'de bir elementin oldugu index'i verir. Ancak oncelikle sort yapilmalidir.
     sort yapilmadan binary search ile arama yapilirsa sonucun ne olacagini bilemeyiz */

        System.out.println("***  Array de OLAN elemanlari ariyoruz ***");
        System.out.println(Arrays.binarySearch(ornek,"Esra"));
        System.out.println(Arrays.binarySearch(ornek,"Fatih"));
        System.out.println(Arrays.binarySearch(ornek,"Bora"));
        Arrays.sort(ornek); // [Bora, Dalyan, Esra, Fatih, Jacob, Muhammet, Naci]
        System.out.println(Arrays.toString(ornek));
        System.out.println(Arrays.binarySearch(ornek, "Fatih"));  //3

        // ---------------------------------------------------------------------------\\
    /* --------array'de olmayan bir element aranirsa,
         once o element array'de olsa kacinci SIRADA olacagini bulur
         basina - yazarak olmadigini bize soyler

        System.out.println("***  Array de OLMAYAN elemanlari ariyoruz ***");
        // [Bora, Dalyan, Esra, Fatih, Jacob, Muhammet, Naci]
        System.out.println(Arrays.binarySearch(ornek, "Gursel")); // -5
        System.out.println(Arrays.binarySearch(ornek, "Sukran")); // -8
        System.out.println(Arrays.binarySearch(ornek, "Ahmet")); // -1
        //{"Fatih","Muhammet","Jacob","Dalyan","Bora","Esra","Naci"}

        // =========================================================================\\*/
    /*10- Iki array’in esitligi nasil kontrol edilir ?
        Arrays.equals(arr1,arr2); herbir index icin elemanlari kontrol eder;
        tum index’lerdeki degerler karsilikli esit ise true, farklilik varsa false döner.*/


    /*11- Bir String’i array’e cevirmek;      str.split( StringAyirac );
        bir String’i istedigimiz parcalara ayirarak bir array’e cevirir.   */
        String [] mevsimler2={"Ilkbahar", "Yaz", "Sonbahar", "Kis"};














    }
}
