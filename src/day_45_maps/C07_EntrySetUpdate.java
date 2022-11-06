package day_45_maps;

import day44_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C07_EntrySetUpdate {
    public static void main(String[] args) {
        // soyisimleri buyuk harfe cevirin

        Map<Integer,String> ogrenciMap= ReusableMethods.ogrenciMapOlustur();

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti= ogrenciMap.entrySet();

        Integer tempKey;
        String tempValue;
        String[] tempvalueArr;

        for (Map.Entry<Integer,String> each: ogrenciEntrySeti
        ) {


            tempValue=each.getValue();
            tempvalueArr=tempValue.split("-");

            tempvalueArr[1]=tempvalueArr[1].toUpperCase();


            tempValue=tempvalueArr[0]+" "+
                    tempvalueArr[1]+" "+
                    tempvalueArr[2]+" "+
                    tempvalueArr[3]+" "+
                    tempvalueArr[4];

            each.setValue(tempValue);

        }
        System.out.println(ogrenciMap);

    }
}