//Program to find factorial of a number
import java.util.*;
public class L6 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n,fact=1;
        System.out.println("Enter the number for which factorial is to be calculated");
        n=sc.nextInt();
        for(int i=n;i>0;i--){
            fact*=i;
        }
        System.out.println("Factorial of the number "+n+" is "+fact);
    }
}
