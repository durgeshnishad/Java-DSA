public class CountingSort {
    public static void main(String args[]){
        int a[]={3,2,1,15,3,6,1,3}, i=0;
        int max=Integer.MIN_VALUE;
        for(i=0;i<a.length;i++){
            max=Math.max(a[i], max);
        }
        int c[]= new int[max+1];
        for(i=0;i<a.length;i++){
            c[a[i]]++;
        }
        int j=0;
        for(i=0;i<c.length;i++){
            while(c[i]>0){
                a[j]=i;
                j++;
                c[i]--;
            }
        }
        for(i=0;i<a.length;i++)
            System.out.print(a[i]);
    }
}
