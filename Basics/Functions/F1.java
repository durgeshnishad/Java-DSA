//Program to understand functions
import java.util.*;
public class F1 {
    public static void printHW(){ //void function
        System.out.println("Hello World");
    }
    public static int printHWreturn(){ //int return type function
        System.out.println("Hello World");
        System.out.println("Hello World");
        return 2;
    }
    public static void main(String args[]){
        printHW();
        printHWreturn();
    }
}
//