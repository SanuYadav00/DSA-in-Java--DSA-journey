/* Write a program to search for an element in an 2D array */
import java.util.*;
public class linear_search {
    public static void search(int array[][],int k) {
        for (int i=0;i<array.length;i++) { 
            for (int j=0;j<array[0].length;j++) {
            if (k==array[i][j]) {
                System.out.println("The element was found at index ("+i+","+j+").");
                return;
            }
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
        System.out.print("Enter the element you want to search:");
        int key=sc.nextInt();
        search(array,key);



     sc.close();

    }
}