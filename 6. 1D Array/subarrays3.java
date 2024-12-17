/* Write a program to print the subarrays in an  array
  and print the max sum of sub arrays using kadeane's method
  big O of n  time complexity
 */
import java.util.*;
public class subarrays3 {
    public static void print(int numbers[]) {
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;
        int minus=-1;

        
        // if all values are negative
        for (int i=0; i<numbers.length;i++) {
            if (numbers[i]>maxsum) {
                maxsum=numbers[i];
            }
            if (minus<numbers[i]) {
                minus=numbers[i];
            }
        }
        if (minus==-1) {
            System.out.print("The maximum sum of the sub arrays is:"+maxsum+"\n");
            return;
        }

            // for normal arrays with atleast one non-negative value
            for (int j=0;j<numbers.length;j++) {
                cursum=j==0?numbers[j]:cursum+numbers[j];
                if (cursum<0) {
                    cursum=0;
                }
                if (cursum>maxsum) {
                    maxsum=cursum;
                }
                }
        System.out.print("The maximum sum of the sub arrays is:"+maxsum+"\n");

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

