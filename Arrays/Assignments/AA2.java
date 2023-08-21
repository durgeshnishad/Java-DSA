/*
There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown
pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k],
nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For
example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the
index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity
 */
public class AA2 {
    public static int search(int n[], int start, int end, int target){
        while(start<=end){
            int mid=(start+end)/2;
            if(target>n[mid])
                start=mid+1;
            else if(target<n[mid])
                end=mid-1;
            else
                return mid;
        }
        return -1;
    }
    public static void main(String args[]){
        int n[]={4,5,6,7,0,1,2};
        int pivot=Integer.MAX_VALUE;
        int pindex=0;
        for(int i=0;i<n.length;i++){
            if(n[i]<pivot){
                pivot=n[i];
                pindex=i;
            }
        }
        int target=2;
        int size=n.length;
        if(target>=pivot &&target<=n[size-1])
            System.out.println(search(n, pindex, size - 1, target));
        else
            System.out.println(search(n, 0, pindex - 1, target));
    }
}