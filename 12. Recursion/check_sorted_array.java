/* write a program using recursion to check if a given array is sorted or not */
// space complexity O(n)
// time complexity O(n)
import java.util.*;
public class check_sorted_array {
 public static boolean find(int array[],int i) {
    if (i==array.length-1) {
        return true;
    }
    if (array[i]>array[i+1]) {
        return false;
    }
    return find(array,i+1);

    

}
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the total number of elements in the array:");
        int n=sc.nextInt();
        int array[]= new int[n];
        System.out.print("Enter the elements of the array:");
        for (int i=0;i<n;i++) {
         array[i]=sc.nextInt();

        }

        boolean a=find(array,0);
        System.out.print("The given array is sorted:"+a);
        sc.close();

    }
}