/* Write a program to find the sum of diagonals in a 2D array */
import java.util.*;
public class sum_of_diagonals {
    public static void sum(int array[][]) {
        int primarydiagonalsum=0;
        int secondarydiagonalsum=0;
        int diagonalsum;
        // Brute force method
        /* for (int i=0;i<array.length;i++) { 
            for (int j=0;j<array.length;j++) {
            if (i==j) {
                primarydiagonalsum+=array[i][j];
            }
            if (i+j==array.length-1) {
                secondarydiagonalsum+=array[i][j];
            }
        }
           
    } */
    for (int i=0;i<array.length;i++) { 
            primarydiagonalsum+=array[i][i];
            secondarydiagonalsum+=array[i][array.length-1-i];
       
}
    System.out.println("The sum of primary diagonal elements is:"+primarydiagonalsum);
    System.out.println("The sum of secondary diagonal elements is:"+secondarydiagonalsum);
    if (array.length%2!=0) {
          diagonalsum=secondarydiagonalsum+primarydiagonalsum-array[(array.length-1)/2][(array.length-1)/2];
    }
    else {
        diagonalsum=secondarydiagonalsum+primarydiagonalsum;
    }
    System.out.println("The sum of diagonal elements is:"+diagonalsum);

    }

    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of rows or columns in the array:");
        int r=sc.nextInt();
        int array[][]=new int[r][r];
        System.out.print("Enter the elements of the array:");
        for (int i=0;i<r;i++) {
            for (int j=0;j<r;j++) { 
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("The elements of the array are:");
        for (int i=0;i<r;i++) {
            for (int j=0;j<r;j++) { 
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        sum(array);



     sc.close();

    }
}
