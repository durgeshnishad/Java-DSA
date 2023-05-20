//Program to print n numbers using while loop
import java.util.*;
public class L1 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n,i=1;
        System.out.println("Enter the number until where you want to print");
        n=sc.nextInt();
        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
    }
}
