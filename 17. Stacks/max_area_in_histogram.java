 /* Given an array of integers height representing the histogram's bar height where the width of each bar is 1, 
 return the area of the largest rectange in the histogram
   */
 // TC O(n) as n+2n=3n and we ignore constants
// SC O(1)
import java.util.*;
public class max_area_in_histogram {
  public static void find1(int array[],int nsr[]) {
   Stack<Integer> s=new Stack<>();
   for (int i=nsr.length-1;i>=0;i--) { // For this loop O(n)

    while(!s.isEmpty() && array[i]<=array[s.peek()]) { // for this loop O(2n) as one element can be pushed only once and it can be popped only once 
     s.pop();
    }

    if (s.isEmpty()) {
      nsr[i]=nsr.length;
    }
    else {
      nsr[i]=s.peek();

    }
    s.push(i);
   }
  }
  public static void find2(int array[],int nsl[]) {
    Stack<Integer> s1=new Stack<>();
   for (int i=0;i<nsl.length;i++) { // For this loop O(n)

    while(!s1.isEmpty() && array[i]<=array[s1.peek()]) { // for this loop O(2n) as one element can be pushed only once and it can be popped only once 
     s1.pop();
    }

    if (s1.isEmpty()) {
      nsl[i]=-1;
    }
    else {
      nsl[i]=s1.peek();

    }
    s1.push(i);
   }
    
   }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the total no. of bars in the histogram:");
    int size=sc.nextInt();
    int array[]=new int[size];
    System.out.print("Enter the heights of the bar:");
    for (int i=0;i<array.length;i++) {
      array[i]=sc.nextInt();
    }
    System.out.print("The heights of the bar are:");
    for (int i=0;i<array.length;i++) {
      System.out.print(array[i]+" ");
    }
    System.out.println();
    int nextSmallerRight[]=new int[array.length];
    int nextSmallerLeft[]=new int[array.length];
    find1(array,nextSmallerRight);
    find2(array,nextSmallerLeft);
    System.out.print("The next smaller right heights are:");
    for (int i=0;i<array.length;i++) {
      System.out.print(nextSmallerRight[i]+" ");
    }
    System.out.println();
    System.out.print("The next smaller left heights are:");
    for (int i=0;i<array.length;i++) {
      System.out.print(nextSmallerLeft[i]+" ");
    }
    System.out.println();
   int maximum=0;
   System.out.print("The possible area rectangles are:");
   for (int i=0;i<array.length;i++) {
    int a=nextSmallerLeft[i];
    int b=nextSmallerRight[i];
    int area=array[i]*(b-a-1);
    System.out.print(area+" ");
    maximum=Math.max(area,maximum);
  }
  System.out.println();
  System.out.println("The area of largest rectangle in histogram is:"+maximum);
   sc.close();
  }
  
}

  
