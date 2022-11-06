package AaNot;

import java.util.Arrays;
import java.util.Scanner;

public class C02_Array2_Ornek {
    public static void main(String[] args) {
        /* ======================== SORU-1  ============================  */
        /*  */
        int[] arr = {3, 5, 7, 10};                //array'in tum elementlerini yazdiralim
        System.out.println(arr[0] + "");
        System.out.println(arr[1] + "");
        System.out.println(arr[2] + "");
        System.out.println(arr[3] + "");
        //-------------------------------------------//
        System.out.println("***** FOR ile yazdiralim  **** ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "  ");
        }
        // Eger array'i yazdirmak istersek---olmaaaz     // System.out.println(arr); // [I@6bf256fa
        // Array'i yazdirabilmek icin Arrays class'indan hazir method kullanmalıyız.
        System.out.println(Arrays.toString(arr));     //[3,5,7,10]

        /* ======================== SORU-2  ============================
        char[] harf = {'A', 'l', 'i', ' ', 'v', 'e', 'l', 'i'};

        System.out.println("***** FOR ile yazdiralim  **** ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "  ");
        }

        System.out.println(Arrays.toString(harf));     //[A, l, i,  , v, e, l, i]
        System.out.println(harf.length);     // ???
*/
        /* ======================== SORU-3  ============================  */

       /* String [] ogrenciler={"Ali", "Murat", "Yakup", "Fatma", "Meryem", "Zeynep"};
        System.out.println(" ****  Arrayin ELEMANLARI ***");
        for( int i=0; i< ogrenciler.length; i++){
            System.out.print(ogrenciler[i] + " ");
        }
        System.out.println(" ****  Arrayi YAZDIRALIM ***");
        System.out.println(ogrenciler);
        System.out.println(Arrays.toString(ogrenciler));          */

        /* ======================== SORU-4  ============================  */
       /* int [] sayilar = new int[4];
        sayilar [0]=15;
        sayilar [1]=11;
        sayilar [2]=21;
        sayilar [3]=33;
        System.out.println(" ****  Arrayin ELEMANLARI ***");
        for( int i=0; i< sayilar.length; i++){
            System.out.print(ogrenciler[i] + " ");
        }
        System.out.println(" ****  Arrayi YAZDIRALIM ***");
        System.out.println(ogrenciler);
        System.out.println(Arrays.toString(ogrenciler));

        */

        /* ======================== SORU-5-  ============================
        //

        /*======================== SORU-6 ============================
        //Yukaridaki sayilar arrayinin tum elemanlarini 2 arttiralim
        int [] sayi= {1, 3, 5, 7, 9};  //[3, 5, 7, 9,11]

        for (int i = 0; i < sayi.length; i++) {
            System.out.println(sayi[i]+2 + " ");
        }
        System.out.println(Arrays.toString(sayi));  //  */

        /*==========  SORU-7 YENI ARRAY OLUSTURMA   ===================
        /* KURAL : Bir array'in uzunlugu sabittir ve degistirilemez ancak ihtiyac
      duydugumuzda yeni bir array olusturup o array'i eski array'e atayabiliriz */

        /*int[] eskiarr = {2, 3, 5};
        int[] yeniarr = {4, 5, 6, 8};     // yeniarr={3,4,5};

        eskiarr = yeniarr;

        System.out.println("Eski Array in son hali: " +Arrays.toString(eskiarr)); // [4, 5, 6, 8]
        System.out.println("Yeni Array imiz: " +Arrays.toString(yeniarr));
        // ornegin arr = [1,2,3] array'ini [1,2,3,4] haline getirmek istersek

        int[] arr1 = {1, 2, 3};

        int[] yeniArr1 = new int[3 + 1]; // uzunlugu 1 fazla yeni bir array olustururum

        for (int i = 0; i < arr1.length; i++) {
            yeniArr1[i] = arr1[i];
        }
        yeniArr1[3] = 4;
        System.out.println(Arrays.toString(yeniArr1));  */

        /* ========= SORU-9 ELEMANLARIN TOPLAMINI YAZDIRMA  ==============
        int[] sayi = {3, 5, 7, 10, -10, -5, 0}; // Arraydeki tum elemanlarin toplamini bulalim
        int toplam=0;
        for (int i = 0; i < sayi.length; i++) {
            toplam+=sayi[i];
            System.out.println( i + ". indexteki eleman: " + sayi[i]);
        }
        System.out.println("Bu Elemanlarin toplami:  " + toplam);
*/
        /* ========= SORU-10 ELEMANLARIN TOPLAMINI veren METHOD  ==============
        //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
        // sonucu bize donduren bir method yaziniz.

        int[]arr = {3,5,7,10, -5,0};
        int sonuc=elemanlariTopla(arr);
        System.out.println("Array'deki pozitif elemanlarin toplami : "+sonuc);
    }
    public static int elemanlariTopla(int[] arr) {
        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]>0) {
                toplam += arr[i];
            }
        }
        return toplam;      */
         /* =========== SORU-11- EN uzun_kisa KELIME yi BULALIM  ============================*/

        /*// Verilen String bir array’deki en uzun ve en kisa
        // kelimeleri yazdiran bir method olusturun.

        String[] kelime={"Fatih", "Muhammet","Jacob","Dalyan","Bora","Ali", "Esra"};

        String enUzunKelime= kelime[0];
        String enKisaKelime= kelime[0];
        for (int i = 0; i < kelime.length; i++) {
            if(kelime[i].length()>enUzunKelime.length()){
               enUzunKelime=kelime[i];
            }
        if(kelime[i].length()<enKisaKelime.length()){
               enKisaKelime=kelime[i];
            }
        }
        System.out.println("enUzunKelime = " + enUzunKelime);
        System.out.println("enKisaKelime = " + enKisaKelime);

        //enUzunKelime = Muhammet
        //enKisaKelime = Ali
*/
        /* =========== SORU-11- int bir ARRAY'deki, EN buyuk & kucuk elemani BULALIM  ============================*/

        /*// Verilen int bir ARRAY'deki, EN buyuk & kucuk elemani BULALIM
        // bulan/ yazdiran bir method olusturun.

        // -- sectigimiz index teki eleman en buyukse, buyukte, enkucukse kucukte sorun olabilir... i=4 ve a[i]<a[4]
        int[] a = {3, 5, 7, 10, -5, 0};
        System.out.println("a nin uzunlugu: " + a.length);  //a nin uzunlugu: 6

        int enBuyukSayi= a[4];  //
        int enKucukSayi= a[4];  // a[0] yaptigimda enkucuksayi=0, a[5] yaptigimda enkucuksayi=-5, a[4] enkucuksayi=0

        for (int i = 0; i < a.length; i++) {
            if(a[i]>a[4]){
                enBuyukSayi=a[i];
            }
            if(a[i]<a[4]){
                enKucukSayi=a[i];
            }
        }
        System.out.println("enBuyukSayi = " + enBuyukSayi);
        System.out.println("enKucukSayi = " + enKucukSayi);

        //    a[0]                    a[5]                  a[4]
        // enBuyukSayi = 10     // enBuyukSayi = 10    //enBuyukSayi = 0
        //  enKucukSayi = 0     // enKucukSayi = -5    //enKucukSayi = -5
*/
        /* ======================== SORU-12- SCANNER ============================
        // Kullanicidan Arrayin uzunlugunu ve degerlerini alip yazdiralim
        Scanner scanner=new Scanner(System.in);
        System.out.println("*** Sayilardan olusan bir array olusturacagiz *** ");
        System.out.println(" Arrayiniz kac elemanli olsun? Rakamla yaziniz; ");
        int uzunluk= scanner.nextInt();

        System.out.println("***  Lutfen sayilari giriniz; *** ");
        int [] sayix= new int[uzunluk];

        for (int i=0; i< sayix.length; i++){
            System.out.println("Arrayin "+ (i) + ". index elemani: " );
            sayix[i]= scanner.nextInt();
        } System.out.println("*** Array'in elemanlari: ***");
        for (int i = 0; i <sayix.length ; i++) {
            System.out.println(sayix[i]+ " ");
        }
        System.out.println("Array'in kendisi: "+ Arrays.toString(sayix));
*/
        /* ======================== SORU-13- SCANNER ============================
        // Kullanicidan Arrayin uzunlugunu ve degerlerini alip yazdiralim
        Scanner scanner=new Scanner(System.in);
        System.out.println("*** Isimlerden olusan bir array olusturacagiz *** ");
        System.out.println(" Arrayiniz kac elemanli olsun? Rakamla yaziniz; ");
        int arrayinUzunlugu= scanner.nextInt();
        scanner.nextLine();
        System.out.println("***  Lutfen isimleri giriniz; *** ");
        String [] isimler= new String[arrayinUzunlugu];

        for (int i=0; i< isimler.length; i++){
            System.out.println("Arrayin "+ (i) + ". index elemani: " );
            isimler[i]= scanner.nextLine();
        } System.out.println("*** Array'in elemanlari: ***");
        for (int i = 0; i <isimler.length ; i++) {
            System.out.println(isimler[i]+ " ");
        }
        System.out.println("Array'in tumu: "+ Arrays.toString(isimler));     */


        /* ========= SORU-14 ELEMANLARI TERSTEN YAZDIRMA  ==============  */
        int[] b ={3,5,7,10,-5,0};
        System.out.println("b nin uzunlugu: " + b.length);  //b nin uzunlugu: 6
        Arrays.sort(b);
        System.out.println("b arrayimizin siralanmis hali; " + Arrays.toString(b));
        // b arrayimizin siralanmis hali; [-5, 0, 3, 5, 7, 10]


        for (int i =b.length-1; i>=0; i--) {
            System.out.println(i + ". indeximiz = " + b[i]);
            System.out.println("Arrayin siralanmis ve Tersten yazilmis hali: " + Arrays.toString(b));
        }}}



        /* === SORU-15 STRING ELEMANLARI PARCALARA AYIRMA ve ARRAY e ATAMA ====  */

      /*  String str= "Ali topu at, at Ali at";

        String[] kelimeler= str.split(" ");  // SpacedenAyir demek
        System.out.println(Arrays.toString(kelimeler)); // [Ali, topu, at,, at, Ali, at]

        String[] virguldenAyir= str.split(",");
        System.out.println(Arrays.toString(virguldenAyir)); // [Ali topu at,  at Ali at]

        String[] adanAyir=str.split("a");
        System.out.println(Arrays.toString(adanAyir)); // [Ali topu , t, , t Ali , t]

        // str string'inde kac kelime var
        System.out.println(kelimeler.length); // 6

        // verilen bir string'i karakterlerine ayirmak istersek

        String[] tumkarakterler= str.split("");
        System.out.println(Arrays.toString(tumkarakterler));
        // [A, l, i,  , t, o, p, u,  , a, t, ,,  , a, t,  , A, l, i,  , a, t]



    }

}







