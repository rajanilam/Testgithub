package Testpackage;

public class Methodpackage {
    public static void main (String[] args){
        // Using void return type
//        Methodpackage cls = new Methodpackage();
//        cls.sumofnums( 4, 6);
//        cls.sumofnums( 477, 623);
//    }
//    private void sumofnums (int a, int b){
//        int sum = a + b;
//        System.out.println("sum of a and b is "+sum);

        //Using int return type
//        Methodpackage cls = new Methodpackage();
//        int sum1 = cls.sumofnums( 4, 6);
//        System.out.println("The value of sum1 is "+sum1);
//        int sum2 = cls.sumofnums( 477, 623);
//        System.out.println("The value of sum1 is "+sum2);
//
//        int difference2 = cls.difference ( 477, 623);
//        System.out.println("The value of difference2 is "+difference2);
        Methodpackage mref = new Methodpackage();
        int sum = mref.calc( 4, 6, "+");
        System.out.println("Sum is :" +sum);


    }
    private int calc(int a, int b, String ops) {
        int res = 0;
        if (ops.equals("+")) {
            res = a + b;
        } else if (ops.equals("-")) {
            res = a - b;
        } else if (ops.equals("*")) {
            res = a * b;
        }

        return res;

    }}