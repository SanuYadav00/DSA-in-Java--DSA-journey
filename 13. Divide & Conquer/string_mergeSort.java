/* write a program to perform sorting of strings containing only lowercase letters using 
merge_sort*/
// time complexity of this code is O(nlogn)
// space complexity O(n)
import java.util.*;
public class string_mergeSort {
    public static void print(String array[]) {
        System.out.print("The elements of the array are:");
        for (int i=0;i<array.length;i++) {
            System.out.print(" "+array[i]);
        }
        System.out.println();
    }
 public static void sort(String array[],int si,int ei) {
    if (si>=ei) {
        return;
    }
    int mid=si+(ei-si)/2;
    sort(array,si,mid);
    sort(array,mid+1,ei);
    merge(array,si,mid,ei);

}
public static void merge(String arr[],int si,int mid,int ei) {
String temp[]=new String[ei-si+1];
int i=si; // iterator for left part
int j=mid+1; // iterator for right part
int k=0; // iterator for temporary array
while(i<=mid && j<=ei) {
    if (arr[i].charAt(0)<arr[j].charAt(0)) {
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
        String array[]=new String[n];
        System.out.print("Enter the elements of the array:");
        for (int i=0;i<n;i++) {
            array[i]=sc.nextLine();
        }
        sort(array,0,n-1);  
        print(array);
        sc.close();

    }
}