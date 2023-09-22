package Testpackage;

public class ReverseString {
    public static void main(String[] args) {
        String nm = "Apple";
        String rev = "";

        for (int i = nm.length()-1; i >= 0 ; i--) {
            rev = rev + nm.charAt(i); //rev = "el" + "p" = "elp"
        }

        System.out.println(rev);
    }
}
