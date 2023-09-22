package Testpackage;

import java.util.Arrays;

public class Remobelement {
    public static void main(String[] args) {
        int [] nums = {3,2,2,3};
        int remove_element = 3;
        int[] new_arr = new int [ nums.length];
        for ( int i = 0; i < nums.length; i++){
            int num = 0;
            if(num[i] != remove_element){
                new_arr[i] = nums[i];
            }
        }
        Arrays.sort (new_arr);
        System.out.println(Arrays.toString(new_arr));
    }
}
