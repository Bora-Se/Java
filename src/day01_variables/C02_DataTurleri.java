package day01_variables;

public class C02_DataTurleri {
    public static void main(String[] args) {

        boolean emekliOlurMu= false;

        emekliOlurMu=true;
        // boolean sadece true veya false değerini alır
        // true veya false direk yazılır cift tırnak veya tek tırnak icine alınmaz

        char harf=65;
        System.out.println(harf);
        char sayı='3';
        char karakter='#';


        // char harfler='asd'; olmaz tek karakter olmalı
        //  char sayılar="2"; olamaz tek tırnak içinde yazılmalı

        float floatSayı=2.3F; // float sayılar 32 bit kullanır
        double doublSayı=4.555; // double sayılar 64 bit kullanır

        doublSayı=20;
        // 20 degerini düşünürsek variable turunu int,short,byte yapabiliriz.dolayısıyla bir variable

        // verilen 3 tamsayının ortalamasını hesaplayan bir program yazın

        int sayı1=11;
        int sayı2=23;
        int sayı3=7;

        System.out.println((double) (sayı1+sayı2+sayı3)/3);  // 41/3= 13.6
        // sayılar int oldugundan java sonucu int verir
        // yuvarlama yapmaz, virgulden sonrasını atar
        // bu durumda her ne kadar gırılen sayılar tam sayı olsa da ortalama hesaplayan bir programı
        // float ya da double ile yapmak daha mantıklı olacaktır.

        float sayı4=11f;
        float sayı5=23f;
        float sayı6=7f;
        System.out.println((sayı4+sayı5+sayı6)/3);

        double sayı7=11;
        double sayı8=23;
        double sayı9=7;
        // float ve double ile calsırken ondalıklı kısımda onemsiz hatalar olabilir

        System.out.println((sayı7+sayı8+sayı9)/3);
        double sayı10=15;
        double sayı11=5;
        System.out.println(sayı10/sayı11);
    } }