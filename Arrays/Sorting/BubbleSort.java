public class BubbleSort {
    public static void main(String args[]){
        int a[]={5,3,4,2,1};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int j=0;j<a.length;j++)
            System.out.print(a[j]);
    }
}
