package day_45_maps;

import day44_maps.ReusableMethods;
import java.util.Arrays;
import java.util.Map;
public class C01_ValueUpdate {
    public static void main(String[] args) {
        // 103 numarali ogrencinin soyismini Yan yapin
        Map<Integer, String> ogrenciMap= ReusableMethods.ogrenciMapOlustur();
        String ogrenciEskiBilgiler= ogrenciMap.get(103);
        System.out.println(ogrenciEskiBilgiler); // Ali-Cem-11-B-TM
        String[] ogrenciValueArr=ogrenciEskiBilgiler.split("-");
        System.out.println(Arrays.toString(ogrenciValueArr)); // [Ali, Cem, 11, B, TM]
        ogrenciValueArr[1]= "Yan";
        System.out.println(Arrays.toString(ogrenciValueArr)); // [Ali, Yan, 11, B, TM]
        String ogrenciYeniValue= ogrenciValueArr[0]+"-"+
                ogrenciValueArr[1]+"-"+
                ogrenciValueArr[2]+"-"+
                ogrenciValueArr[3]+"-"+
                ogrenciValueArr[4];
        ogrenciMap.put(103,ogrenciYeniValue);
        System.out.println(ogrenciMap);
    }
}
    //Ali-Cem-11-B-TM
    //[Ali, Cem, 11, B, TM]
    //[Ali, Yan, 11, B, TM]
    //{101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Yan-11-B-TM, 104=Ayca-Can-11-B-MF, 105=Ayse-Cem-10-M-Soz}