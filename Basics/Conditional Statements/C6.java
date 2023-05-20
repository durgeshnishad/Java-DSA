//Program to find whether Even/Odd using ternary operator
import java.util.*;
public class C6 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n=sc.nextInt();
        String type= (n%2==0)? "Even":"Odd";
        System.out.println(n+" is a "+type+" number");
    }
}
