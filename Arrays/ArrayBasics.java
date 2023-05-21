// Program to understand how an array works
import java.util.*;
public class ArrayBasics {
    public static void update(int m[]){ 
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 10 values for an array");
        for(int i=0;i<m.length;i++){
            m[i]=sc.nextInt();
        }
    }
    public static void main(String args[]){
        
        int marks[]= {97,99,100};
        int l=marks.length; //.length function
        System.out.println("The marks array contains marks of "+l+" subjects"); 
        int m[]= new int[10];
        update(m); //call by reference
        for(int i=0;i<m.length;i++){
            System.out.println("Array["+i+"]: "+m[i]);
        } 
    }
}

