/*
Program to print the pattern
*****
****
***
**
*
 */
import java.util.*;
public class P2 {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        int n;
        System.out.println("enter the length");
        n=sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
