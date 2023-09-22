package Testpackage;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SplitandReverse {
    public static void main(String[] args) {
        String word = "hi everyone how you guys doing";
        String[] arr = word.split(" ");

        System.out.println(Arrays.toString(arr));
        String[] new_arr = new String[arr.length];
        int count =0;
        for (int i =arr.length-1; i>= 0; i--){
            new_arr[count++] = arr[i];
        }
        System.out.println("New Array is "+Arrays.toString(new_arr));
        String res = String.join(" ", new_arr);
        System.out.println(res);

    }
}
