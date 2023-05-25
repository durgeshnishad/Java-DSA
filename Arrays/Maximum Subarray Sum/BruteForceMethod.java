//Program to find maximum subarray sum - bruteforce
import java.util.*;
public class BruteForceMethod{
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
        int msum=0;
        for(int j=0;j<size;j++){
            for(int k=j;k<size;k++){
                int csum=0;
                for(int l=j;l<=k;l++){
                    csum+=n[l];
                    if(l==k){
                        if(csum>msum)
                            msum=csum;
                    }
                }
            }
        }
        System.out.println("Max Sum:"+msum);
    }
}