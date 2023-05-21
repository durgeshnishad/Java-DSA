/*
Program to print the pattern
A
BC
DEF
GHIJ
KJLMNO
 */
import java.util.*;
public class P4{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n;
        char ch='A';
        System.out.println("enter the no");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                 ch++;
            }
            System.out.println();
        }
    }
}
