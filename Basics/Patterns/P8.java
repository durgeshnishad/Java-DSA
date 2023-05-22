/*
Program to print the pattern
1 
0 1 
0 1 0 
1 0 1 0 
1 0 1 0 1 
 */
import java.util.*;
public class P8 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n,c=1;
        System.out.println("enter the size of the triangle"); 
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(c%2==0)
                    System.out.print("0 ");
                else 
                    System.out.print("1 ");
                c+=1;
            }
            System.out.println();
        }
    }
}
