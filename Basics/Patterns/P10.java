/*
Program to print the pattern
        * * * * * 
      * * * * * 
    * * * * * 
  * * * * * 
* * * * * 
 */
import java.util.*;
public class P10 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("enter the size of the rhombus");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=n-i;k>=1;k--)
                System.out.print("  ");
            for(int l=1;l<=n;l++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
