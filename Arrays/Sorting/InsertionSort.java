public class InsertionSort {
    public static void main(String args[]){
        int a[]={5,3,4,1,2};
        for(int i=1;i<a.length;i++){
            int cur=a[i];
            int prev=i-1;
            while(prev>=0 && a[prev]>cur){
                a[prev+1]=a[prev];
                prev--;
            }
            a[prev+1]= cur;
        }
        for(int j=0;j<a.length;j++)
            System.out.print(a[j]);
    }
}