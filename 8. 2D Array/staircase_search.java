/* Write a program to search for an element in a sorted 2D array */
import java.util.*;
public class staircase_search {
    public static void search(int array[][],int k) {
        int i=0;
        int n=array[0].length;
        int m=array.length;
        int j=n-1;
        while(i<m && j>=0) {
            if (k==array[i][j]) {
                System.out.println("The element was found at index ("+i+","+j+").");
                return;
            }
            else if (k>array[i][j]) {
                i++;
            }
            else {
                j--;
            }
        
           
        }
    System.out.println("The element was not found in the array.");
}

    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of rows in the array:");
        int r=sc.nextInt();
        System.out.print("Enter the no. of columns in the array:");
        int c=sc.nextInt();
        int array[][]=new int[r][c];
        System.out.print("Enter the elements of the array:");
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) { 
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("The elements of the array are:");
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) { 
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        for (int i=0;i<9;i++) {
        System.out.print("Enter the element you want to search:");
        int key=sc.nextInt();
        search(array,key);
        }



     sc.close();

    }
}