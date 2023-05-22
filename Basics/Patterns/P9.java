/*
Program to print the pattern
*                 * 
* *             * * 
* * *         * * * 
* * * *     * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * *     * * * * 
* * *         * * * 
* *             * * 
*                 * 
 */
import java.util.*;
public class P9 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n,i;
        System.out.println("enter the size");
        n=sc.nextInt();
        for (i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            for(int k=2*(n-i);k>=1;k--)
                System.out.print("  ");
            for(int m=1;m<=i;m++)
                System.out.print("* ");
            System.out.println();
        }
        for(i=n;i>=1;i--){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            for(int k=2*(n-i);k>=1;k--)
                System.out.print("  ");
            for(int k=1;k<=i;k++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
