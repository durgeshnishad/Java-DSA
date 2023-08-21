/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class AA3{
    public static void main(String args[]){
        int prices[]={7,6,3,2,1};
        int buyp=Integer.MAX_VALUE;
        int maxprofit=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buyp)
                buyp=prices[i];
            else{
                int profit= prices[i]-buyp;
                if(profit>maxprofit)
                    maxprofit=profit;
            }
        }
        if(maxprofit>0)
            System.out.println(maxprofit);
        else
            System.out.println("0");
    }
}