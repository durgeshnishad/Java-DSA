//Program to find the reverse of a number
import java.util.*;
public class L4 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n,num,revn=0,ldigit;
        System.out.println("Enter the number whose reverese is to be found");
        n=sc.nextInt();
        num=n;
        while(num>0){
            ldigit=num%10;
            num/=10;
            revn=revn*10+ldigit;
        }
        System.out.println("Reverse of the number "+n+" is "+revn);
    }
}
