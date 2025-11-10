public class buyAndSellStock {
    public static int stocks (int sellPrice[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0;i<sellPrice.length;i++){
            if(buyPrice>sellPrice[i]){
                buyPrice=sellPrice[i];
            }else{

                 maxprofit=sellPrice[i]-buyPrice;
                //maxprofit=Math.max(maxprofit,profit);
                
                
                }
                
            }return maxprofit;


        }
        


    
    public static void main(String args[]){
        int sellPrice[]={7,6,4,3,1};
        //int maxProfit=stocks(sellPrice);
        System.out.println(stocks(sellPrice));

    }
    
}
