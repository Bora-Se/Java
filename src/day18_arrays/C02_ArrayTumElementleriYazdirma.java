package day18_arrays;
import java.util.Arrays;
public class C02_ArrayTumElementleriYazdirma {
    public static void main(String[] args) {

        int[] arr={3,5,7,10};
        //array'in tum elementlerini yazdiralim

        System.out.println(arr[0]+"");
        System.out.println(arr[1]+"");
        System.out.println(arr[2]+"");
        System.out.println(arr[3]+"");

        System.out.println("");

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]+"  ");
        }

        // Eger array'i yazdirmak istersek---olmaaaz

        // System.out.println(arr); // [I@6bf256fa

        // Array'i yazdirabilmek icin Arrays class'indan hazir method kullanmalıyız.

        System.out.println(Arrays.toString(arr));     //[3,5,7,10]

    }
}
