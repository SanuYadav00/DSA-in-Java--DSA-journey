/* Write a program to perform binary search in an array */
import java.util.*;
public class binary_search {
    public static int search(int numbers[],int k) {
        int start=0;
        int end=numbers.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if (k==numbers[mid]) {
                return mid;
            }
            else if (k<numbers[mid]) {
                end=mid-1;
            } 
            else {
                start=mid+1;
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
