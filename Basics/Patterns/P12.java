/*
Program to print the pattern
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 
 */
import java.util.*;
public class P12 {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n,i;
    System.out.println("enter the size");
    n=sc.nextInt();
    for(i=1;i<=n;i++){
        for(int j=n-i;j>=1;j--)
            System.out.print("  ");
        for(int k=1;k<=2*i-1;k++)
            System.out.print("* ");
        System.out.println();
    }
    for(i=n;i>=1;i--){
        for(int j=n-i;j>=1;j--)
            System.out.print("  ");
        for(int k=1;k<=2*i-1;k++)
            System.out.print("* ");
        System.out.println();
    }
    } 
}  
