/* Write a program to sort an array using inbuilt sort */
import java.util.Arrays;
import java.util.*;
import java.util.Collections;
public class inbuilt_sort {
    
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=sc.nextInt();
        Integer numbers[]=new Integer[n];
        System.out.print("Enter the elements of the array:");
        for (int i=0;i<numbers.length;i++) {
            numbers[i]=sc.nextInt();
        }
        System.out.print("The elements of the array are:");
        for (int i=0;i<numbers.length;i++) {
            System.out.print(" "+numbers[i]);
        }        
        System.out.println();
        Arrays.sort(numbers,0,5);
        System.out.print("The elements of the array after  partial sorting are:");
        for (int i=0;i<numbers.length;i++) {
            System.out.print(" "+numbers[i]);
        }        
        System.out.println();
    
        Arrays.sort(numbers);
        System.out.print("The elements of the array after full sorting are:");
        for (int i=0;i<numbers.length;i++) {
            System.out.print(" "+numbers[i]);
        }        
        System.out.println();
        
        Arrays.sort(numbers,0,5,Collections.reverseOrder());
        System.out.print("The elements of the array after  partial descending sorting are:");
        for (int i=0;i<numbers.length;i++) {
            System.out.print(" "+numbers[i]);
        }        
        System.out.println();
    
        Arrays.sort(numbers,Collections.reverseOrder());
        System.out.print("The elements of the array after full descending sorting are:");
        for (int i=0;i<numbers.length;i++) {
            System.out.print(" "+numbers[i]);
        }        
        System.out.println();
    




     sc.close();

    }
}
