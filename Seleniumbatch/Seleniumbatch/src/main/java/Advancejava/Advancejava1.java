package Advancejava;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class Advancejava1 {
    @Test
    public void trycatch() { //throws FileNotFoundException
        try {
            System.out.println("Test1"); //This will print Test1
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("There is InterruptedException");
        }
        catch (Exception e){
            System.out.println(" There is Interrupted Exception ");
        }
            finally
         {
            System.out.println("There failed because file is not available");
        }
    }
}

