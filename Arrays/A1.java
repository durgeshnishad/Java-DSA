//Program to find the largest number in an array
import java.util.*;
public class A1 {
    public static int largest(int n[]){
        /*int l=n[0];
        for(int i=1;i<n.length;i++){
            if(l<n[i])
                l=n[i];
        }
        return l;*/
        int l=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            if(l<n[i])
                l=n[i];
        }
        return l;
    }
    public static void main(String args[]){
        int n[]={1,3,2,88,9,34,65,98,78,0,91,101};
        System.out.println("Largest number in the array:"+largest(n));
    }
}
