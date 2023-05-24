// Program to print the subarrays of an array
import java.util.*;
public class Subarray{
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
        System.out.println("Subarray of the above array are");
        for(int j=0;j<size;j++){
            for(int k=j;k<size;k++){
                System.out.print("["+n[j]);
                if(j==k){
                    System.out.print("]");
                    continue;
                }
                else
                    System.out.print(n[k]);
            System.out.print("]");
            }
            System.out.println();
        }
    }
}
    
