import java .util.*;
public class IndianCoin {
    public static void main(String args[]){
        Integer coin[]={1,2,5,10,20,50,100,500,2000};
        int amount=1059;
        Arrays.sort(coin,Collections.reverseOrder());
        int countofcoin=0;
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<coin.length;i++){
            if(coin[i]<=amount){
            while(coin[i]<=amount){
                countofcoin++;
                ans.add(coin[i]);
                amount-=coin[i];}}

            
        }
        System.out.println("min number of coin uses = "+countofcoin);

        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }

    }
}
    

