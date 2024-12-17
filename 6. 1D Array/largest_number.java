/* Write a program to find the largest element in an array */
import java.util.*;
public class largest_number {
    public static int search(int numbers[]) {
        int largest=Integer.MIN_VALUE; //- infinity
          for (int i=0;i<numbers.length;i++) {
            if (largest<numbers[i]) {
                largest=numbers[i];
            }
        }
        return largest;   
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
        int b=search(numbers);
            System.out.print("The largest element in the array is:"+b);




     sc.close();

    }
}
