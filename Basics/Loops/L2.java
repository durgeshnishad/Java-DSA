//Program to print the sum of first n natural numbers
import java.util.*;
public class L2 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n,i=1,sum=0;
        System.out.println("Enter the number until where you want to calculate thr sum");
        n=sc.nextInt();
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("Sum:"+sum);
    }
}
