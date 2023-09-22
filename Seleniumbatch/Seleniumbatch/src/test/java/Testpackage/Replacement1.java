package Testpackage;

public class Replacement1 {
    public static void main(String[] args) {
        String str = "fdgf5fgu5yu66sfsf";

        int a = 0;

        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                a++;
            }
        }

        System.out.println("Total numerical values: "+a);
        String new_str = str.replaceAll("[a-z]","#");
        int count =str.replaceAll("a-z","").length();
        System.out.println(new_str);
        System.out.println(count);
    }
}
