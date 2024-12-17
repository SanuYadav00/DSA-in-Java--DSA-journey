/* Write a program to print the subarrays in an  array
  and print the max sum of sub arrays using prefix sum method
  big O of n square time complexity
 */
import java.util.*;
public class subarrays2 {
    public static void print(int numbers[]) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int prefixsum[]=new int[numbers.length];
        prefixsum[0]=numbers[0]; 
        for (int i=1;i<numbers.length;i++) {
            prefixsum[i]=prefixsum[i-1]+numbers[i];

        }
        for (int i=0;i<numbers.length;i++) {
            for (int j=i;j<numbers.length;j++) {
                int sum=i==0?prefixsum[j]:prefixsum[j]-prefixsum[i-1]; 
                if (max<sum) {
                    max=sum;
                }
                if (min>sum) {
                    min=sum;
                }
                }
                
        }
        System.out.print("The minimum sum of the sub arrays is:"+min+"\n");
        System.out.print("The maximum sum of the sub arrays is:"+max+"\n");

        return;   
    }
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=sc.nextInt();
        int numbers[]=new int[n];
        System.out.print("Enter the elements of the array:");
        for (int i=0;i<numbers.length;i++) {
            numbers[i]=sc.nextInt();
        }
        System.out.print("The elements of the array are:");
        for (int i=0;i<numbers.length;i++) {
            System.out.print(" "+numbers[i]);
        }
        System.out.println();
        print(numbers);
    


     sc.close();

    }
}

