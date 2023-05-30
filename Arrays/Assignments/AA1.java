//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
import java.util.*;
public class AA1 {
    public static boolean distinchCheck(int nums[]){
        boolean isnotdistinct=false;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    isnotdistinct=true;
                    break;
                }
                else
                    continue;
            }
        }
        return isnotdistinct;
    }
    public static void main(String args[]){
        int a[]= {1,2,3,4,5,6};
        System.out.println(distinchCheck(a));
    }
}
