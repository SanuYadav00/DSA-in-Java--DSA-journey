/* Write a program to print the sum of elements of 2nd row in an 2D array */
import java.util.*;
public class sum_of_2nd_row {
    public static void search(int array[][]) {
        int j=1;
        int sum=0;
        for (int i=0;i<array[0].length;i++) { 
          sum+=array[j][i];
           
    }
    System.out.println("The sum of 2nd row is:"+sum);
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