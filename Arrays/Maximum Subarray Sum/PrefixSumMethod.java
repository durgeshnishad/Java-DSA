//Programm to find maximum subarray sum using prefix method
import java.util.*;
public class PrefixSumMethod{
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
        int prefix[]=new int[size];
        prefix[0]=n[0];
        for(int i=1;i<size;i++){
            prefix[i]=prefix[i-1]+n[i];
        }
        int msum=0;
        for(int i=0;i<size;i++){
            int csum=0;
            for(int j=i;j<size;j++){
                csum=  i==0? prefix[j]: prefix[j]-prefix[i-1];
                if(csum>=msum)
                    msum=csum;
            }
        }
        System.out.println("Max Sum:"+msum);
    }
}