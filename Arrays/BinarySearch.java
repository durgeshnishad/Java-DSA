import java.util.*;
public class BinarySearch {
    public static int BS(int n[], int size, int nsearch){
        int start=0,end=size-1,mid;
        while(start<=end){
            mid=(start+end)/2;
            if(nsearch>n[mid]){
                start=mid+1;
            }
            else if(nsearch<n[mid]){
                end=mid-1;
            }
            else
                return mid;
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int size,nsearch;
        System.out.println("enter the size of the array");
        size=sc.nextInt();
        int n[]= new int[size];
        System.out.println("enter the array of numbers of size "+size);
        for(int i=0;i<size;i++){
            n[i]=sc.nextInt();
        }
        System.out.println("enter the number to be searched");
        nsearch=sc.nextInt();
        int t=BS(n,size,nsearch);
        if(t!=-1)
            System.out.println("Found");
        else
            System.out.println("NotFound");
    }
}
