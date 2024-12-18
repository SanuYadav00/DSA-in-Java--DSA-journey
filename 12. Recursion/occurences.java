/* For a given integer array of size n. You have to find all the occurrences
 (indices) of a given element(key) and print them.Use a recursive function.
 */
import java.util.*;
public class occurences {
 public static void print(int array[],int key,int i) {
    if (i==array.length) {
        return;
    }
    if (array[i]==key) {
        System.out.println(i+"th index");
    }
     print(array,key,i+1);
}
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.print("Enter the elements of the array:");
        for (int i=0;i<n;i++) {
        array[i]=sc.nextInt();
        }
        System.out.print("Enter the element(key) whose occurences you want to find:");
        int key=sc.nextInt();
        System.out.print("The element occurs at following indices:");
        print(array,key,0);
        sc.close();

    }
}