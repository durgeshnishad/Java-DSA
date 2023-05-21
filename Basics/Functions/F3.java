//Program to convery from binary to decimal or vice versa according to the users choice
import java.util.*;
public class F3 {
    public static void bintodec(int dec){
        int ldigit,i=0,num=0;
        while(dec>0){
            ldigit=dec%10;
            dec/=10;
            num=num+ldigit*(int)Math.pow(2,i);
            i++;
        }
        System.out.println("decimal number is: "+num);
    }
    public static void dectobin(int dec){
        int bin=0, lnum,i=0;
        while(dec>0){
            lnum=dec%2;
            dec/=2;
            bin=bin+lnum*(int)Math.pow(10,i);
            i++;
        }
    System.out.println("binary number is:"+bin);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter\n1. Binary to decimal conversion\n2. Decimal to binary conversion");
        n=sc.nextInt();
        switch(n){
            case 1:
                int num1;
                System.out.println("Enter the binary number");
                num1=sc.nextInt();
                bintodec(num1);
                break;
            case 2:
                int num2;
                System.out.println("Enter the decimal number");
                num2=sc.nextInt();
                dectobin(num2);
                break;
            default:
                System.out.println("Worng choice Entered");
        }
    }
}
