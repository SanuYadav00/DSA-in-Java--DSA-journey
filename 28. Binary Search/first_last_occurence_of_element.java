/* Write a program to find the first and last position of an element in an sorted array:*/
import java.util.*;
public class first_last_occurence_of_element {
  public static class pair {
    int first;
    int last;
    pair(int f, int l) {
      this.first=f;
      this.last=l;
    }
  }

  public static pair search(int arr[],int target) {
    int start=0;
    int end=arr.length-1;
    int first=-1;
    while (start<=end) {
      int mid=(start+end)/2;
       if (target==arr[mid]) {
        first=mid;
        end=mid-1;
       }
       else if (target<arr[mid]) {
        end=mid-1;
       }
       else {
        start=mid+1;
       }
    }


    if (first==-1) {
      return new pair(-1,-1);
    }
    end=arr.length-1;
    start=first;
    int last=first;

    while (start<=end) {
      int mid=(start+end)/2;
       if (target==arr[mid]) {
        last=mid;
        start=mid+1;
       }
       else if (target<arr[mid]) {
        end=mid-1;
       }
       else {
        start=mid+1;
       }
    }

    return new pair(first,last);
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of the array:");
    int n=sc.nextInt();
    int numbers[]=new int[n];
    System.out.print("Enter the elements of the array:");
    for (int i=0;i<numbers.length;i++) {
        numbers[i]=sc.nextInt();
    }
    System.out.print("Enter the target element:");
        int target=sc.nextInt();
        pair b=search(numbers,target);
        System.out.println("The first occurence is at index "+b.first+" and last occurence is at index "+b.last);

    sc.close();
  }
}