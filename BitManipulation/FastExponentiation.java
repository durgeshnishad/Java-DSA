public class FastExponentiation {
    public static void main(String args[]){
        int n=5, a=2, ans=1;
        while(n>0){
            if((n&1)!=0)
                ans*=a;
            a*=a;
            n=n>>1;
        }
        System.out.println(ans);
    }
}
