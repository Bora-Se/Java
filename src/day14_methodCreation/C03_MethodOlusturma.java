package day14_methodCreation;

public class C03_MethodOlusturma {
    public static void main(String[] args) {


    /*
    verilen iki integer'i toplayip sonucu bize donduren bir method olusturun
     */
        int sayi1=10;
        int sayi2=20;
        System.out.println(ikiSayiTopla(4,6)); //10

    }
    public static int ikiSayiTopla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }

}
