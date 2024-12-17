/* Write a program to print the subarrays in an  array
  and print the max sum of sub arrays using brute_force method
  Big O of n cube time complexity
 */
import java.util.*;
public class subarrays {
    public static int print(int numbers[]) {
        int ts=0;
        System.out.println("All the subarrays of the array are:");
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<numbers.length;i++) {
            for (int j=i;j<numbers.length;j++) {
                int sum=0;
                for (int k=i; k<=j; k++) {
                    System.out.print(" "+numbers[k]);
                    sum=sum+numbers[k];
                }
                if (sum>max) {
                    max=sum;
                }
                if (sum<min) {
                    min=sum;
                }
                System.out.print(" Sum="+sum);
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("The minimum sum of the sub arrays is:"+min+"\n");
        System.out.print("The maximum sum of the sub arrays is:"+max+"\n");

        return ts ;   
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
        int b=print(numbers);
        System.out.print("The total number of sub arrays in the array are:"+b);


     sc.close();

    }
}
