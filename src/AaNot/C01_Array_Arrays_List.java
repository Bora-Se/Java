package AaNot;

import java.util.Arrays;

public class C01_Array_Arrays_List {
    public static void main(String[] args) {

        // Data turleri; bir variabele bir deger atanabiliyordu
        String isim="Ali"; int sayi=15; char harf='a'; double sayi2=15.3;  double sayi3=15;  boolean dogruMu=true;
        // Array(dizi)’ler Java’da AYNI DATA TURUNDEN birden fazla eleman barindirabilen objelerdir.
        // Array’ler her bir eleman icin ayri bir alan ayirirlar ve bu elemanlara index bilgisi ile ulasabiliriz.

        //1- Bir array olusturulurken 2 sey deklare edilmek zorundadir.
        //A-	Icine konulacak elementlerin data turu--  //VariabelTuru [] variabelisim; // int [ ] arr1;    String [] arr5;
        //Bir array icinde farkli data turunden element olamaz.

        //B-	Icine kac element konulacagi (length)--  int [ ] arr2 = new int [3];
        int [ ] arr2 = new int [5];   String [] str= new String[2];

        //Array’ler primitive data turundeki datalarin degerlerini,
        // non-primitive data turundeki datalarin ise referanslarini barindirirlar.

        //2- Bir array 2 sekilde deklare edilir;
        //   Deklare ettik ama deger atamadik,
        //   java referansi olusturur ama length belli olmadigindan objeyi olusturamaz.
        // int [ ] arr2 = new int [5];   String [] str= new String[2];  // int [ ] arr1;    String [] arr5;

        //3- Bir array’e 2 sekilde deger atanabilir
        //A- Direk degerler atanabilir;
        int [] arr3= {1, 2, 6, 7, 8};  // ya da [1, 2, 6, 7, 8] seklinde

        String [] isimler={"Ali", "Veli", "Ayse", "Fatma"};
        System.out.println(isimler.toString()+ "---------Non primitivlerin indexlerini yazar");
        //B- Uzunlugu belirtilerek olusturulur ama elemanlara deger atamasi yapilmaz.   // int [ ] arr2 = new int [5];
        //Bu durumda Java belirtilen uzunlukta ve default degerlere sahip bir array olusturur.   [0, 0, 0, 0, 0]
        // [0, 0, 0, 0, 0] neden sifir degerleri?

        //4- Bir array’in length’i nasil bulunur ?
        //NOT: Array’deki length bir method degil uzunlugu tutan bir variable’dir. Dolayisiyla yaninda ( ) parantez yoktur.
        int [] arr4= {1, 2, 6, 7, 8};
        System.out.println(isimler.length);
        System.out.println(arr4.length);

        //5- Bir array’de istenen index’deki elemana nasil ulasilir ?  arr[i] =?
        System.out.println(arr4[3]);
        arr4[2]=10;
        System.out.println(arr4.length);

        //6- Bir array’in tum elemanlari nasil yazdirilir ? For-Loop kullanalim.

        for(int i=0; i<arr4.length; i++){
            System.out.print(arr4[i]+ " ");     //
        }

        //7- Bir array nasil yazdirilir ?  toString( )
        // Array direk yazdirilamaz, direk yazdirmak isterseniz array’i degil referansini yazdirir.
        // Array’i yazdirmak icin Arrays class’indan toString( ) method’u kullanilmalidir.

        System.out.println("\nArrayi direek yazmaazz--referanslari yazar---"+arr4);
        System.out.println(Arrays.toString(arr4));


        /* */
        //Onceki Derste Ogrendiklerimiz
        //1-Array ayni data turunden birden fazla eleman barindirabilen Java objesidir.
        //2- Array’ler primitive data turundeki degerleri veya non-primitive data turundeki objelerin referanslarini barindirirlar.
        //3- Bir array’i daha onceki data turlerinden ayirmak icin [ ] kullaniriz.  int arr = 10; int[ ] arr= {3,4,5,7,8};
        //4- Bir array olusturulurken 2 sey belirtilmek zorundadir
        //- icerisine konulacak datalarin turleri - icine konulacak element sayisi (length)
        //5- Bir array olusturulurken belirtilen uzunluk sabittir, sonradan degistirilemez
        //6- Array’lerde elementlere erismek ve update etmek icin index kullanilir
        //    arr[1] bize 1.index’deki elementi getirir,       arr[2]=10; 2.index’deki elemente 10 degerini atamis oluruz
        //7- Bir array’in degeri 2 farkli sekilde atanabilir #  int[ ] arr={1,2,3}; elementler ve uzunluk belirlenmis olur
        //#  int[ ] arr= new int[4];  uzunluk belirlendi ancak elementler Javanin belirledigi default degerlerde
        //8- bir array’in elementlerini yazdirmak istersek loop kullanabiliriz, ancak array’i direk yazdirmak istedigimizde
        //Java array’i degil referansini yazdirir. Array’i yazdirmak icin Arrays class’indan toString( ) method’unu kullanmamiz gerekir.
        //
        //Arrays Sorular: Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun. Eski array’i yeni haliyle kaydedin.
        //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir method yaziniz.
        //Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin. Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]
        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere kullanildigini yazdiran bir method olusturun.
        //Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize donduren bir method olusturun.
        //Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method olusturun.
        //Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin, eski array’e yeni degeri atayin.


        //ONEMLI NOT : Varolan bir array’e yeni deger atanabilir mi ?
        //Varolan bir array’e elementleri yazarak yeni deger atamasi yapamayiz
        //S1 3.sayfa resme bakalim

        //Ancak new keyword ile yeni bir deger atayabiliriz. Bu varolan array’in uzunlugunu degistirmek degil,
        // yepyeni bir array olusturmak oldugundan Java CTE vermez.

        //8- Bir array’in elemanlari nasil siralanir ?    .sort(arr )
        //int [] arr3= {1, 2, 6, 7, 8};  // ya da [1, 2, 6, 7, 8] seklinde
        //String [] isimler={"Ali", "Veli", "Ayse", "Fatma"};
        System.out.print(Arrays.toString(arr4));


        Arrays.sort(arr4);
        System.out.print(Arrays.toString(arr4));

        //Arrays.sort( ) method’u array’i Natural Order’a gore siralar.
        //Buyukten kucuge siralamak isterseniz, sort( ) ile siralayip, loop ile tersine cevirmek gerekir.

        for(int i=arr4.length; i>=0; i--){
            System.out.print(arr4[i]+ " ");     //
        }


        //9- Bir array’de istenen elemanin varligi nasil kontrol edilir ?
        //Array’lerde istenen bir elemanin varligini kontrol etmek icin;
        // .binarySearch( ) method’u kullanilir.
        //Ancak, binarySearch( ) kullanmadan once MUTLAKA .sort( ) ile siralama yapilmalidir.

        // Arrays.sort( ) kullanilmadan da binarySearch( ) calisir ancak sonuclarinin ne olacagi BILINEMEZ.

        // binarySearch( ) ile array’de olmayan bir eleman aranirsa, olmasi gereken sirayi – ile VERIR.

        // 10- Iki array’in esitligi nasil kontrol edilir ?
        //Arrays.equals(arr1,arr2); herbir index icin elemanlari kontrol eder;
        //tum index’lerdeki degerler karsilikli esit ise true, farklilik varsa false döner.

        //11- Bir String’i array’e cevirmek;      str.split( StringAyirac );
        //bir String’i istedigimiz parcalara ayirarak bir array’e cevirir.

        //Multi Dimensional Arrays:   Multidimensional array’ler, icerisinde array bulunduran array’lerdir.
        //
        //Bu sekilde deklare edilmis olan arr array’ini tek katli olarak yazmak istersek, length’i 5 olan bir array goruruz.
        // outer array; Multidimensional array’lerde en distaki array’e outer array,
        //   icerideki array’lere ise inner arrays denir.

        //inner arrays: Multidimensional array’lerde, bir element’e ulasmak icin once elementin icinde oldugu inner array’e,
        // sonra o inner array’deki index’I kullanarak da elemente ulasmaliyiz.


    }

}
