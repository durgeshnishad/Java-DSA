/*
Program to print the pattern
      * * * * 
    *     * 
  *     * 
* * * * 
 */
import java.util.*;
public class P11 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("enter the size");
;       n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++)
                System.out.print("  ");
            if(i==1 || i==n){
                for(int k=1;k<=n;k++)
                    System.out.print("* ");
            }
            else{
                for(int l=1;l<=n;l++){
                    if(l==1 || l==n)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}  
