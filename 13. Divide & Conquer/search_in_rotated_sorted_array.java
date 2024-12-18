/* write a program to search in rotated sorted array
 Input:sorted, rotated array with distinct numbers (in ascending order)
 It is rotated at a  pivot point. Find the index of the given element.
*/
// we can also solve this question using linear search but time complexity will be O(n)
// time complexity of this code is O(nlogn)
import java.util.*;
public class search_in_rotated_sorted_array {
    
public static int search(int arr[],int si,int ei,int key) {
    if (si>ei) {
        return -1;
    }
     int mid=si+(ei-si)/2;
     if (arr[mid]==key) {
        return mid;
     }
     else if (arr[mid]<arr[si]) {
        if (arr[mid]<key && key<arr[ei]) {
          return search(arr,mid+1,ei,key);
     }
     else {
        return search(arr,si,mid-1,key);

     }
    }
     else {
        if (key>arr[si] && arr[mid]>key) {
        return search(arr,si,mid-1,key);
     }
     else { 
        return search(arr,mid+1,ei,key);

     }
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
        System.out.print("Enter the value which you want to search:");
        int key=sc.nextInt();

        int a=search(array,0,n-1,key);
        if (a!=-1) {
            System.out.println("The value was found at index:"+a);
        }  
        else {
            System.out.println("The value was not found.");
        }  
        sc.close();

    }
}