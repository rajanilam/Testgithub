package Testpackage;

public class Palindrom {
    public static void main(String[] args) {
        /*
store input string to str
create a pal variable to store output string

create a loop that iterates over each character of the input string
    - inside of that loop store that each character in reverse order


 */
        String str = "Aviva";
        String pal = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            pal = pal + str.charAt(i); //pal = "" + "e" = e

        }
        System.out.println("str = "+str);
        System.out.println("pal = " +pal);
        //str = str.toLowerCase();
        //pal = pal.toLowerCase();
        //System.out.println(str.equals(pal)); //str1.equals(str2);
        if(str.equalsIgnoreCase(pal)) {
            System.out.println("This is Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}

