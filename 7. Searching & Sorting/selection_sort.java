/* Write a program to perform selection sort in an array */
import java.util.*;
public class selection_sort {
    public static void sort(int numbers[]) {
        
        for (int i=0;i<numbers.length-1;i++) {
            int min_position=i;
            for (int j=i+1;j<numbers.length;j++) {
                if (numbers[j]< numbers[min_position]) {
                    min_position=j;
                }
            }
            int temp=numbers[min_position];
            numbers[min_position]=numbers[i];
            numbers[i]=temp;
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