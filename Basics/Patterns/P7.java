/*
Program to print the pattern
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
 */
import java.util.*;
public class P7 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n, counter=1;
        System.out.println("enter size of the triangle");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
}
