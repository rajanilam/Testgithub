package Testpackage;

import java.util.ArrayList;
import java.util.List;

public class Testclass3 {
    public static void main(String[] args) {
//        int a[] = {4, 7, 8, 10};
//
//        for (int i = a.length - 1; i <= 0; i--) {
//            System.out.println(a[i]);
//        }
        List<Integer> listofnums = new ArrayList<>();
        listofnums.add(5);
        listofnums.add(4);
        listofnums.add(81);
        listofnums.add(66);
        listofnums.add(12);
        listofnums.add(1);

        for (int i = 0; i < listofnums.size(); i++) {
            System.out.println(listofnums.get(i));

            listofnums.add(2);
            listofnums.remove(5);


        }
    }
}
