import java.util.*;

public class BuySellStock {
    public static void main(String[] args) {
        int []arr = {2,4,3,1,5,9,8,7,6};
        int buy = arr[0];
        int maxprofit = 0;
        int profit = 0;
        int sell = 0;
        for(int i=1;i<arr.length;i++){
            if(buy < arr[i]){
                profit = arr[i] - buy;
                if(profit > maxprofit){
                    sell = arr[i];
                    maxprofit = profit;
                }
            }
            else{
                buy = arr[i];
            }
        }
        System.out.println("Buy : "+buy);
        System.out.println("Sell : "+sell);
        System.out.println("Max Profit : "+maxprofit);
    }
}