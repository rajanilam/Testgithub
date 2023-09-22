package Testpackage;

public class Practicejava { // entry point

    public static void main(String[] args) {

        /* for (int i = 0; i<10; i++)
        {
            System.out.println(i);

        }
        int f =0;
        while (f<10){
            System.out.println("f is smaller than 10");
            f++;
        }*/
        String lang = "java";

        switch (lang){

            case "python":
                System.out.println("Learning python");
                break;

            case "c++":
                System.out.println("Learning c++");
                break;

            case "java":
                System.out.println("Learning java");
                break;

            default:
                System.out.println("not learning anything");
        }
    }
}
