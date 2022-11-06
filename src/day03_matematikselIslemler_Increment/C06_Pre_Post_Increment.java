package day03_matematikselIslemler_Increment;

public class C06_Pre_Post_Increment {
    public static void main(String[] args) {

        int a=10;

        System.out.println("a nin degeri :" + ++a); //11

        int b= a++; // once atamayi yap sonra deger arttir´12

        System.out.println("b´nin degeri :" + b);// 11

        int c= b++ + a; // once atama c=11+12= 23, b 12

        System.out.println("c nin degeri :" + c); // 23

        System.out.println("son toplam :" + (a+b+c));

    }
}







