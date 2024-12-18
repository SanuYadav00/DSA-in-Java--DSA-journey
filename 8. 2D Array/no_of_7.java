/* Write a program to print the number of 7 in an 2D array */
import java.util.*;
public class no_of_7 {
    public static void search(int array[][]) {
        int count=0;
        for (int i=0;i<array.length;i++) { 
            for (int j=0;j<array[0].length;j++) {
            if (7==array[i][j]) {
                count++;
            }
        }
           
    }
    System.out.println("There are:"+count+" 7's in the array.");
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
        search(array);



     sc.close();

    }
}