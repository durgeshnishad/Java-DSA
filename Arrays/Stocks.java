public class Stocks{
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        int buyprice=Integer.MAX_VALUE,maxprofit=0;
        for(int i=0;i<prices.length;i++){
            int profit=0;
            if(prices[i]<buyprice)
                buyprice= prices[i];
            else
                profit= prices[i]-buyprice;
                maxprofit=Math.max(profit,maxprofit);

        }
        System.out.println("Maximum Profit:"+maxprofit);
    }
}