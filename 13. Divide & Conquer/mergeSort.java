/* write a program to perform merge_sort*/
// time complexity of this code is O(nlogn)
// space complexity O(n)
import java.util.*;
public class mergeSort {
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
    int mid=si+(ei-si)/2;
    sort(array,si,mid);
    sort(array,mid+1,ei);
    merge(array,si,mid,ei);

}
public static void merge(int arr[],int si,int mid,int ei) {
int temp[]=new int[ei-si+1];
int i=si; // iterator for left part
int j=mid+1; // iterator for right part
int k=0; // iterator for temporary array
while(i<=mid && j<=ei) {
    if (arr[i]<arr[j]) {
        temp[k++]=arr[i++];
        // i++;
        // k++;
    }
    else {
        temp[k]=arr[j];
        j++;
        k++;
    }
}
while (i<=mid) {
    temp[k++]=arr[i++];
    
}
while (j<=ei) {
    temp[k++]=arr[j++];
}
// copy temp to original array
for (k=0,i=si; k<temp.length;k++,i++) {
    arr[i]=temp[k];
}
}
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