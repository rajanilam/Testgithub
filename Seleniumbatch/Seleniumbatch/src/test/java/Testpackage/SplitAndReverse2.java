package Testpackage;

import java.util.Arrays;

public class SplitAndReverse2 {
    public static void main(String[] args) {
        String word = "hi everyone how you guys doing";
        String[] arr = word.split(" "); //
        System.out.println(Arrays.toString(arr)); //[hi, everyone, how, you, guys, doing]

        String[] new_arr = new String[arr.length];
        for(int i =0; i< arr.length; i++){
            String rev = "";
            for (int j = arr[i].length()-1; j >= 0 ; j--) { //j = 1
                rev = rev + arr[i].charAt(j);
            }
            new_arr[i] = rev;
            System.out.println(Arrays.toString(new_arr));

        }
        String outputString = String.join(" ", new_arr);
        System.out.println("input string is "+word);
        System.out.println("output string is "+outputString);

//        for (int j = arr[i].length()-1; j >= 0 ; j--) {
//            System.out.println("Before"+Arrays.toString(new_arr));
//            new_arr[i++] = arr[i][j]; //new_arr[0] = arr[
//            System.out.println("After"+Arrays.toString(new_arr));
//        }
        //System.out.println("New Array is "+Arrays.toString(new_arr));
//        System.out.println(Arrays.toString(arr));
//        String[] new_arr = new String[arr.length];
//        int count =0;
//        for (int i =arr.length-1; i>= 0; i--){
//            new_arr[count++] = arr[i];
//        }
//        System.out.println("New Array is "+Arrays.toString(new_arr));
//        String res = String.join(" ", new_arr);
//        System.out.println(res);
    }
}
