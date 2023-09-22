package Testpackage;

public class ReplacementRej {
    public static void main(String[] args) {
        String str = "A-Za-zo9";

        int a = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                a++;
            }
        }

//        System.out.println("Total number of Uppercase: "+a); //this will print the total number of character
        String new_str = str.replaceAll("[A-Za-zo9\s]", "");// thi will find the special character in the str "A-Za-zo9"
//        String new1_str = str.replaceAll("0-9","");
        int count = new_str.length(); //this will count the number of special character
        System.out.println(new_str);
//        System.out.println(new1_str);
        System.out.println(count);//this will print the total number of special character
    }
}
