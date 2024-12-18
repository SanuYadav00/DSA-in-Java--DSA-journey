/* Write a program to perform selection sort in an array */
import java.util.*;
public class insertion_sort {
    public static void sort(int arr[]) {
        
        for (int i=1;i<arr.length;i++) {
            int current=arr[i];
            int prev=i-1;

            // finding out the correct position to insert
            while(prev>=0 && arr[prev]>current) {
                arr[prev+1]=arr[prev];
                prev--;
            }

            // insertion
            arr[prev+1]=current;

        }
      
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
        sort(numbers);
        System.out.print("The elements of the array after sorting are:");
        for (int i=0;i<numbers.length;i++) {
            System.out.print(" "+numbers[i]);
        }        
        System.out.println();
    




     sc.close();

    }
}