/* Given n non-negative integers representing an elevation map
 where the width of each bar is 1, compute how much water it can trap 
 after rainig. Write a program to calculate trapped rainwater. 

 */
import java.util.*;
public class trapped_rainwater {
    public static int print(int height[]) {
        int n=height.length;
        int maxleftboundary[]=new int[n];
        int maxrightboundary[]=new int[n];


        maxleftboundary[0]=height[0];
        for (int i=1;i<n;i++) {
                maxleftboundary[i]=Math.max(height[i],maxleftboundary[i-1]);
            }
        
            maxrightboundary[n-1]=height[n-1];
        for (int i=n-2;i>=0;i--) {
            maxrightboundary[i]=Math.max(height[i],maxrightboundary[i+1]);
        }
     
        int trappedwater=0;
        for (int i=0;i<n;i++) {
            int waterlevel=Math.min(maxleftboundary[i],maxrightboundary[i]);
            trappedwater=trappedwater+waterlevel-height[i];
        }
        return trappedwater ;   
    }
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total number of height bars:");
        int n=sc.nextInt();
        int height[]=new int[n];
        System.out.print("Enter the heights of the bar:");
        for (int i=0;i<height.length;i++) {
            height[i]=sc.nextInt();
        }
        System.out.print("The heights of the bar are:");
        for (int i=0;i<height.length;i++) {
            System.out.print(" "+height[i]);
        }
        System.out.println();
        int trapped_rainwater=print(height);
        System.out.print("The total water that can be trapped after raining are:"+trapped_rainwater);


     sc.close();

    }
}
