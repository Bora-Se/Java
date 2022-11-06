package day_45_maps;

import day44_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C06_EntrySetUpdate {
    public static void main(String[] args) {
         //MF olan bolum isimlerini Say olarak degistirin

        Map<Integer, String> ogrenciMap= ReusableMethods.ogrenciMapOlustur();

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti=ogrenciMap.entrySet();

        Integer tempKey;
        String tempValue;
        String [] tempValueArr;

        for (Map.Entry<Integer,String> each:ogrenciEntrySeti
             ) {

            // Ali-Can-10-H-MF
            tempValue= each.getValue();
            tempValueArr=tempValue.split("-");  // [Ali, Can, 10, H ,MF]



        }
    }
}
