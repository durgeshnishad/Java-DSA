/*
Program to print the pattern
*
**
***
****
*****
 */
import java.util.*;
public class P1{
    public static void main(String arge[]){
    Scanner sc= new Scanner(System.in);
    int n;
    System.out.println("enter the length of the pattern");
    n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
