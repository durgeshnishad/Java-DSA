/*
Program to print the pattern
    1
   2 2
  3 3 3 
 4 4 4 4
5 5 5 5 5
 */
import java.util.*;
public class P13 {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n;
    System.out.println("enter the size");
    n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=n-i;j>=1;j--)
            System.out.print(" ");
        for(int k=1;k<=i;k++)
            System.out.print(i+" ");
        System.out.println();
    }
    }
}
