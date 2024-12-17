/* You are given an array prices where prices[i] is the price 
  of a given stock on the ith day. You want to maximize your
  your profit by choosing a single day to buy one stock and 
  choosing a different day in the future 
  to sell that stock. Return the maximum profit you can achieve 
 from this transaction. If you cannot achieve any profit, return 0.
 */
import java.util.*;
public class stock_market {
    public static void market(int price[]) {
        int n=price.length;
       /* // n square time complexity 
        int max_profit=0;
        for (int i=0;i<n;i++) {
            for (int j=i+1;j<n;j++) {
              if (price[j]-price[i]>max_profit) {
                max_profit=price[j]-price[i];
              }
            }
        } */
        
        int max_profit=0;
        int buy_price=Integer.MAX_VALUE;
        for (int i=0;i<n;i++) {
            if (price[i]<buy_price) {
                buy_price=price[i];
            }
            else {
                int profit=price[i]-buy_price;
                    max_profit=Math.max(max_profit,profit);
                }
            }
            
            

        System.out.print("The maximum profit that can be earned from this transaction is:"+max_profit);
        return;   
    }
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total no. of days:");
        int n=sc.nextInt();
        int price[]=new int[n];
        System.out.print("Enter the prices of the stock on respective days:");
        for (int i=0;i<price.length;i++) {
            price[i]=sc.nextInt();
        }
        System.out.print("The prices on respective days are:");
        for (int i=0;i<price.length;i++) {
            System.out.print(" "+price[i]);
        }
        System.out.println();
        market(price);
    


     sc.close();

    }
}

