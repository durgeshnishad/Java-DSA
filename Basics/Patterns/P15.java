/*
Program to print the pattern
    1
   212
  32123
 4321234
543212345
 */
import java.util.*;
public class P15 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("enter the size");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int c=i;
            for(int k=1;k<+n-i;k++)
                System.out.print(" ");
            for(int j=1;j<=2*i-1;j++){
                if(j>=i){
                    System.out.print(c);
                    c++;
                }
                else{
                    System.out.print(c);
                    c--;
                }
            }
            System.out.println();
        }
    }
}
