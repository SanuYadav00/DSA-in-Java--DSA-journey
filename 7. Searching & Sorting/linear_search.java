/* Write a program to perform linear search in an array */
import java.util.*;
public class linear_search {
    public static int search(int numbers[],int k) {
        for (int i=0;i<numbers.length;i++) {
            if (k==numbers[i]) {
                return i;
            }
        }
        return -1;   
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
        System.out.print("Enter the element you want to search:");
        int key=sc.nextInt();
        int b=search(numbers,key);
        if (b!=-1) {
            System.out.print("The element was found at index:"+b);
        }
        else {
            System.out.print("The element was not found."); 
        }




     sc.close();

    }
}