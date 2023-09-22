package Testpackage;

import java.util.*;

public class  Testclass5 {
    public static void main(String[] args) {
        String str = "elepahante";
//        System.out.println(str.indexOf("p"));
//        System.out.println(str.lastIndexOf("p"));
        // System.out.println(str.charAt(1));

        List<Character> uniquevalues = new ArrayList<>(); //Arraylist variableName = new ArrayList();

        for (int i = 0; i < str.length(); i++) { //i=3; 3<10; 3++
            char ch = str.charAt(i); //ch = "p"
            if (str.indexOf(ch) == str.lastIndexOf(ch)) { //str.indexOf(l) = 1, str.lastIndexOf(l) = 1   1 == 1?
                uniquevalues.add(ch); //uniquevalues = [l ]
            }
        }

        System.out.println(uniquevalues);
    }

}
