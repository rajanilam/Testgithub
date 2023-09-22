package Testpackage;

public class whilesum {
    public static void main(String[] args) {
//        int num = 124;
//
//        int sum = 0;
//
//        while (num > 0){
//            sum = sum + num % 10;
//            num = num / 10;
//        }
//
//        System.out.println("the sum of all digits are "+sum ); //prints sum of 1,2,4=7

//        int num = 123, reversed = 0;
//
//        while (num != 0) {
//            int digit = num % 10;
//            reversed = reversed * 10 + digit;
//            num /= 10; //12.3 which picks up 12
//        }
//
//        System.out.println("Reversed Number:" + reversed); ''prints 321

        int num = 1233;

        int sum = 0;

        while (num>0){
            if((num%10)%2!=0)
                sum = sum +num%10;
            num=num/10;

        }
        System.out.println(sum); //prints sum of 1,3,3 =7
    }


}
