// Program to print the largest of two numbers
import java.util.*;
public class C3 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a,b;
        System.out.println("Enter the two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
            System.out.println(a+" is larger");
        else
        System.out.println(b+" is larger");
    }
}
