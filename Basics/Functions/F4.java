import java.util.*;
public class F4 {
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,r,factn,factr,factnmr;
        System.out.println("Enter n and r");
        n=sc.nextInt();
        r=sc.nextInt();
        factn=fact(n);
        factr=fact(r);
        factnmr=fact(n-r);
        int bc=factn/(factr*factnmr);
        System.out.println("Binomial Coefficient:"+bc); 

    }
}
