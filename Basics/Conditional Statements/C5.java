//Program to print the largest of 3 numbers
import java.util.*;
public class C5 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c)
            System.out.println(a+" is the largest");
        else if (b>a && b>c)
            System.out.println(b+" is the largest");
        else
            System.out.println(c+" is the largest");
    }
}
