import java.util.Scanner;

public class Basics{
    
    public static void checkEvenOdd(int n){
        if((n&1)==0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.println(5&6); //Bitwise AND
        System.out.println(5|6); //Bitwise OR
        System.out.println(5^6); //Bitwise XOR
        System.out.println(~5); //1's complement
        System.out.println(5<<2); //Binary left shift (a*2^b)
        System.out.println(6>>1); //Binary right shift (a/2^b)

        System.out.println("enter the number (odd/even check)");
        int  n= in.nextInt();
        checkEvenOdd(n);
    }
}