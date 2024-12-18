/* Write a program to perform counting sort in an array */
import java.util.*;
public class counting_sort {
    public static void sort(int arr[]) {
        int n=arr.length;
        int largest=Integer.MIN_VALUE;
        for (int i=0;i<n;i++) {
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int [largest+1];
        for (int i=0;i<n;i++) {
            count[arr[i]]++;
        }

        int j=0;
        for (int i=0;i<count.length;i++) {
            while (count[i]>0) {
              arr[j]=i;
              j++;
              count[i]--;
            }
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
        sort(numbers);
        System.out.print("The elements of the array after sorting are:");
        for (int i=0;i<numbers.length;i++) {
            System.out.print(" "+numbers[i]);
        }        
        System.out.println();
    




     sc.close();

    }
}