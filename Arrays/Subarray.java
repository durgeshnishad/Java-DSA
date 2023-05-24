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
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                for(int k=i;k<=j;k++)
                    System.out.print(n[k]);
                System.out.println();
            }
            System.out.println();
        }
    }
}
    
