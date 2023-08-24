//import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class InBuildFn {
    public static void printArr(int a[]){
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]);
        System.out.println();
    }
    public static void printArr(Integer a[]){
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]);
        System.out.println();
    }
    public static void main(String args[]){
        int a1[]={5,3,4,2,1};
        int a2[]={5,3,4,2,1};
        Integer a3[]={5,3,4,2,1};
        Integer a4[]={5,3,4,2,1};
        
        Arrays.sort(a1);
        Arrays.sort(a2,0,3);
        Arrays.sort(a3, Collections.reverseOrder());
        Arrays.sort(a3, 0, 3, Collections.reverseOrder());
        
        printArr(a1);
        printArr(a2);
        printArr(a3);
        printArr(a4);
    }
}
