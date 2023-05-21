/*
Program to print the pattern
* * * * *
*       * 
* * * * *
 */
import java.util.*;
public class P5{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int l,b;
        System.out.println("enter the length and breadth of the rectangle");
        l=sc.nextInt();
        b=sc.nextInt();
        for(int i=1;i<=b;i++){
            if(i==1 || i==b){
                for(int j=1;j<=l;j++){
                    System.out.print("* ");

                }
            }
            else{
                for(int k=1;k<=l;k++){
                    if(k==1 || k==l)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
