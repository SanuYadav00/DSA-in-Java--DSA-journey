/* Write a program to print the elements of a 2D matrix in spiral form */
import java.util.*;
public class spiral_matrix {
    public static void display(int array[][]) {
       int r=array.length;
       int c=array[0].length;
        int sr=0; // starting row
       int sc=0; // starting column
        int er=r-1; // ending row
        int ec=c-1; // ending column

        System.out.println("The elements of the matrix printed in spiral way are:");
        while (sr<=er && sc<=ec) {
        for (int j=sc;j<=ec;j++) {
            System.out.print(array[sr][j]+" ");
        }
        for (int i=sr+1;i<=er;i++) {
            System.out.print(array[i][ec]+" ");
        }
        for (int j=ec-1;j>=sc;j--) {
            System.out.print(array[er][j]+" ");
        }
        for (int i=er-1;i>=sr+1;i--) {
            System.out.print(array[i][sc]+" ");
        }
        sr++;
        sc++;
        er--;
        ec--;
    }
    System.out.println();
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
        display(array);



     sc.close();

    }
}