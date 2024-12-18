/* Write a program to print the transpose of a 2D array */
import java.util.*;
public class transpose {
    public static void change(int array[][]) {
        int transpose[][]=new int [array[0].length][array.length];
        for (int i=0;i<transpose.length;i++) { 
            for (int j=0;j<transpose[0].length;j++) {
            transpose[i][j]=array[j][i];
        }
           
    }
    System.out.println("The transposed matrix is:");
        for (int i=0;i<transpose.length;i++) {
            for (int j=0;j<transpose[0].length;j++) { 
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

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
        change(array);



     sc.close();

    }
}