/* Write a program to print the pairs in array  in an array */
import java.util.*;
public class pairs_in_array {
    public static int pairs(int numbers[]) {
        int tp=0;
        System.out.print("All the pairs of the array are:");
        for (int i=0;i<numbers.length;i++) {
            for (int j=i+1;j<numbers.length;j++) {
                System.out.print("("+numbers[i]+","+numbers[j]+") ");
                tp++;
            }
            System.out.println();
        }
        return tp ;   
    }
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=sc.nextInt();
        int numbers[]=new int[n];
        System.out.print("Enter the elements of the array:");
        for (int i=0;i<numbers.length;i++) {
            numbers[i]=sc.nextInt();
        }
        System.out.print("The elements of the array are:");
        for (int i=0;i<numbers.length;i++) {
            System.out.print(" "+numbers[i]);
        }
        System.out.println();
        int b=pairs(numbers);
        System.out.print("The total number of pairs in the array are:"+b);


     sc.close();

    }
}
