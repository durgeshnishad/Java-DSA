public class TRW1 {
    public static void main(String args[]){
        int a[]={4,2,0,6,3,2,5}, rw=0,i,j,k;
        for(i=1;i<a.length-1;i++){
            int ml=Integer.MIN_VALUE,mr=Integer.MIN_VALUE;
            for(j=0;j<i;j++){
                if(a[j]>ml)
                    ml=a[j];
            }
            for(k=i+1;k<a.length;k++){
                if(a[k]>mr)
                    mr=a[k];
            }
            int wlevel= Math.min(ml, mr);
            int r=wlevel-a[i];
            if (r>0)
                rw+=r;
        }
        System.out.println("Total Volume of RainWater:"+rw);
    }
}
