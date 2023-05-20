//Program to perform arithmetic calculation based on the users choice
import java.util.*;
public class C8 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n,a,b;
        System.out.println("Enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division");
        n=sc.nextInt();
        switch(n){
            case 1:
                int sum=a+b;
                System.out.println("Sum:"+sum);
                break;
            case 2:
                int diff=a-b;
                System.out.println("Difference:"+diff);
                break;
            case 3:
                int prod=a*b;
                System.out.println("Product:"+prod);
                break;
            case 4:
                int div=a/b;
                System.out.println("Quotient:"+div);
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}
