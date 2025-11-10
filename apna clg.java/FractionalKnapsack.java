import java.util.*;
public class FractionalKnapsack {
    public static void main(String args[]){
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int w=50;

        double ratio[][]=new double[val.length][2];
        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
        }
        int capacity=w;
        int maxVal=0;
        for(int i=0;i<val.length;i++){
            if(capacity>=weight[i]){
                maxVal+=ratio[i][1]*weight[i];
                capacity-=weight[i];
            }else{
                maxVal+=(int)ratio[i][1]*capacity;
                capacity=0;
                break;
            }

        }
        System.out.println("final value is "+maxVal);
    }
    
}
