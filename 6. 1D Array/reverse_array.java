/* Write a program to reverse the elements  in an array */
import java.util.*;
public class reverse_array {
    public static void reverse(int numbers[]) {
        int start=0;
        int end=numbers.length-1;
        while (start<=end) {
            int temp=numbers[end];
            numbers[end]=numbers[start];
            numbers[start]=temp;
            start++;
            end--;
            
        }
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
        reverse(numbers);
        
            System.out.print("The elements of the array after reverse are:");
            for (int i=0;i<numbers.length;i++) {
                System.out.print(" "+numbers[i]);
            }
            System.out.println();


     sc.close();

    }
}
