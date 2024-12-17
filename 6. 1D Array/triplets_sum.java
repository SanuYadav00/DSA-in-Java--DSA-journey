/* Given an integer array nums, return all the triplets 
[nums[i], nums[j],  nums[k]] such that i != j, i != k, 
and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
Example 1:Input:nums = [-1, 0,  1, 2, -1, -4] 
  Output:   [ [-1, -1, 2] , [-1, 0, 1] ] */

import java.util.*;
public class triplets_sum {
    public static void market(int price[]) {
        System.out.print("The required triplets are:");
        int n=price.length;
        for (int i=0;i<n;i++) {
            for (int j=i+1;j<n;j++) {
                for (int k=j+1;k<n;k++) {
                    if (price[i]+price[j]+price[k]==0) {
                        System.out.println("["+price[i]+","+price[j]+","+price[k]+"]");
                }
              
             
              }
            }
        
        }
    
            

        

        return;   
    }
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total no. of elements in the array:");
        int n=sc.nextInt();
        int price[]=new int[n];
        System.out.print("Enter the array elements:");
        for (int i=0;i<price.length;i++) {
            price[i]=sc.nextInt();
        }
        System.out.print("The array elements are:");
        for (int i=0;i<price.length;i++) {
            System.out.print(" "+price[i]);
        }
        System.out.println();
        market(price);
    


     sc.close();

    }
}

