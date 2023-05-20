//Program to find if a number is Prime or not
import java.util.*;
public class L5 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n;
        boolean isPrime=true;
        System.out.println("Enter the number");
        n=sc.nextInt();
        if(n==2)
            System.out.println(n+" is a Prime number");
        else{
            isPrime=true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0)
                    isPrime=false;
                    break;
            }
            if(isPrime==true)
                System.out.println(n+" is a prime number");
            else
                System.out.println(n+" is not a prime number");
    }
        }
        
}
