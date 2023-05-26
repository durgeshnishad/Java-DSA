//Program to find maximum subarray sum using kadane's algorithm
import java.util.*;
public class KadanesAlgo {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int size;
        System.out.println("enter the size of the array");
        size=sc.nextInt();
        int n[]= new int[size];
        System.out.println("enter the array");
        for(int i=0;i<size;i++){
            n[i]=sc.nextInt();
        }
        int csum=0, msum=0;
        for(int j=0;j<size;j++){
            csum+=n[j];
            if(csum<0)
                csum=0;
            else if(csum>=msum)
                msum=csum;
            else
                continue;  
        }
        System.out.println("Max Sum:"+msum);
    }
}
