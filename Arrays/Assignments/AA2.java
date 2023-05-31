import javax.lang.model.util.ElementScanner14;

public class AA2 {
    public static void search(int n[], int start, int end, int target){
        while(start<end){
            int mid=(start+end)/2;
            if(target>n[mid])
                start=mid+1;
            else if(target>n[mid])
                end=mid-1;
            else
                System.out.println(mid);
        }
    }
    public static void main(String args[]){
        int n[]={7,6,5,4,3,0,1,2,};
        int start=0, end=n.length-1,pivot=0;
        while(start<end){
            int m=(start+end)/2;
            if(n[m-1]>n[m] && n[m]>n[m+1])
                start=m+1;
            else if(n[m-1]<n[m] && n[m]<n[m+1])
                end=m-1;
            else{
                pivot=m; 
                break;
            }

            System.out.println(pivot);
            int target= 6;
            if(target>=n[pivot] && target<=n[n.length-1])
                search(n,pivot,n.length,target);
            else
                search(n,0,pivot,target);
        }
    }
}
