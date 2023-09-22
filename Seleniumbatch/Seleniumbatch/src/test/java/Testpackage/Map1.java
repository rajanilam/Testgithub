package Testpackage;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
//        Map<String, String> map = new LinkedHashMap<>();
//        map.put("name1","Alex");
//        map.put("name3","Paul");
//        map.put("name2","Ronit");
//        map.put("name4","Ali");
//        map.put("name5","Peter");
//        map.put("name6","Max");
//        System.out.println(map);
//        for (var entry : map. entrySet()){
//            System.out.println("Key is: " + entry.getKey());
//            System.out.println("Value is: " + entry.getValue());
         String str = " elepahant";
         Map<Character, Integer> freq = new LinkedHashMap<>();

         for (var ch: str.toCharArray()){
//             System.out.println(ch);
//             System.out.println(freq.get(ch));
//             System.out.println(freq.getOrDefault(ch, 6));
             freq.put(ch,freq.getOrDefault(ch,0)+1);
             System.out.println(freq);
        }

    }
}
