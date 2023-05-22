import java.util.*;
public class LinearSearch {
    public static int LS(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key)
                return i;
        }
        return -1;
    }
    public static int LS(String name[],String nsearch){
        for(int i=0;i<name.length;i++){
            if(name[i]==nsearch)
                return i;
        }
        return -1;
    }
    public static void main(String args[]){
    int number[]={2,4,3,5,6,11,7,0,9};
    int nosearch=2;
    String name[]={"Durgesh","Vedansh","Ayush","Mayank"};
    String nsearch="Mayank";
    int k1=LS(number,nosearch);
    int k2=LS(name,nsearch);
    if(k1!=-1)
        System.out.println(nosearch+" is found");
    else
        System.out.println(nosearch+" is not found");
    if(k2!=-1)
        System.out.println(nsearch+" is found");
    else
        System.out.println(nsearch+" is not found");
    }
}
