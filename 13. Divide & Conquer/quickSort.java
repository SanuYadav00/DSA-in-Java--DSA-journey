/* write a program to perform quick_sort*/
// time complexity of this code is O(nlogn) , in worst case O(n^2)
// space complexity O(1)
import java.util.*;
public class quickSort {
    public static void print(int array[]) {
        System.out.print("The elements of the array are:");
        for (int i=0;i<array.length;i++) {
            System.out.print(" "+array[i]);
        }
        System.out.println();
    }
 public static void sort(int array[],int si,int ei) {
    if (si>=ei) {
        return;
    }
    int pivot_index=partition(array,si,ei);
    sort(array,si,pivot_index-1); // left
    sort(array,pivot_index+1,ei); // right
}
public static int partition(int arr[],int si,int ei) {
    int pivot=arr[ei];
    int i=si-1; // to make place for elements smaller than pivot
    for (int j=si;j<ei;j++) {
        if (arr[j]<=pivot) {
            i++;
            //swap
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
    } 
    i++;
            //swap
            int temp=pivot;
            arr[ei]=arr[i];
            arr[i]=temp;
            return i;

}

    /* int pivot=array[ei];
    int i=si-1;
    int j=si;
    while (j<ei) {
        if (array[j]<pivot) {
            i++;
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        }
        j++;
    }
    array[ei]=array[i+1];
    array[i+1]=pivot;
    sort(array,si,i);
    sort(array,i+2,ei); */



    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the total number of elements in the array:");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.print("Enter the elements of the array:");
        for (int i=0;i<n;i++) {
            array[i]=sc.nextInt();
        }
        sort(array,0,n-1);  
        print(array);
        sc.close();

    }
}