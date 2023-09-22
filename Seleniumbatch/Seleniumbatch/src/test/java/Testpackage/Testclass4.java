package Testpackage;
import java.util.*;

public class Testclass4 {
    public static void main(String[] args) {
        String str = "elepahant";
        Set<Character> set = new HashSet<>();
        List<Character> uniquevalues = new ArrayList<>();

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i); //str.charAt(0) = "e"
            if (set.add(ch) == true){ //Is set.add("e") = true?
                uniquevalues.add(ch); //uniquevalues = e, l, p, a, h,
            }
        }
        System.out.println(uniquevalues);
    }
//    Set<Integer> Set = new HashSet<>();
//    Set<Integer> Set = new LinkedHashSet<>();
//    Set<Integer> Set = new TreeSet<>();
//
//        Set.add(4);
//        Set.add(5);
//        Set.add(1);
//
//
//        for (int num: Set) {
//        System.out.println(num);
//    }
}
