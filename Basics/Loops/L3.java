//Program to print "Hello World" n times
import java.util.*;
public class L3 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter the number of times you want to print Hello World");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Hello World");
        }
    }
}
