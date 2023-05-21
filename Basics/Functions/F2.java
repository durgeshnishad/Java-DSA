// Program to calculate sum of two numbers using void and int return type functions
import java.util.*;
public class F2 {
    public static int addition(int a, int b){
        int sum= a+b;
        return sum;
    }
    public static void add(int a, int b){
        int sum= a+b;
        System.out.println("Sum:"+sum);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a,b;
        System.out.println("enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        int sum= addition(a,b); // storing sum into a variable from the int return type functions
        System.out.println("Sum:"+sum);
        System.out.println("Sum:"+addition(2,3));// directly printing sum from the int return type
        add(4,3); // callinf the void function
    }
}
