//Program to check if a number is Odd/Even
import java.util.*;
public class C2 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter the Number");
        n=sc.nextInt();
        if(n%2==0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
}
