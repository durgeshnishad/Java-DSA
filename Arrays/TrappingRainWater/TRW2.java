public class TRW2 {
    public static void main(String args[]){
        int a[]={4,2,0,6,3,2,5};
        int ml[]= new int[a.length];
        ml[0]=a[0];
        for(int i=1;i<a.length;i++){
            ml[i]=Math.max(a[i],ml[i-1]);
        }

        int mr[]= new int[a.length];
        mr[a.length-1]=a[a.length-1];
        for(int j=a.length-2;j>=0;j--){
            mr[j]=Math.max(a[j],mr[j+1]);
        }

        int rw=0;
        for(int k=0;k<a.length;k++){
            int wl=Math.min(ml[k],mr[k]);
            rw+=wl-a[k];
        }
        System.out.println(rw);
    }
}
