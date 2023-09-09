import java.util.*;
public class Operations {
    public static int getNumber(int n, int i){
        int bitMask=1<<i;
        if((n&bitMask)==0)
            return 0;
        else
            return 1;
    }

    public static int setNumber(int n, int i){
        int bitMask= 1<<i;
        return n|bitMask;
    }

    public static int clearNumber(int n, int i){
        int bitMask=~(1<<i);
        return n&bitMask;
    }

    public static int clearLastIBit(int n, int i){
        int bitMask=~0<<i;
        return n&bitMask;
    }

    public static int clearRangeBits(int n, int i, int j){
        int a= ~(~0<<i);
        int b=1<<j+1;
        int bitMask= a|b;
        return n&bitMask;
    }
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        int n,i,j;
        System.out.println("enter the number");
        n=in.nextInt();
        System.out.println("Enter the ith position for the get, set & clear operarion");
        i=in.nextInt();
        System.out.println(getNumber(n, i));
        System.out.println(setNumber(n,i));
        System.out.println(clearNumber(n, i));
        System.out.println(clearLastIBit(n,i));
        System.out.println("Enter the jth position for clear range od bits");
        j=in.nextInt();
        System.out.println(clearRangeBits(n,i,j));
    }
}
