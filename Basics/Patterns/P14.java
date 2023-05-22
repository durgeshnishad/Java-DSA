/*
Program to print the pattern
12345
1234
123
12
1
 */
import java.util.*;
public class P14 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("enter the size");
        n=sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++)
                System.out.print(j);
            System.out.println();
        }
    }
}
