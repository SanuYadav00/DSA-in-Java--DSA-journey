/* write a program using recursion to find the last occurrence of an element in an array  */
// space complexity O(n)
// time complexity O(n)
import java.util.*;
public class last_occurence {
 public static int find(int array[],int a,int i) {
    if (array[i]==a) {
        return i;
    }
    if (i==0) {
        return -1;
    }
    return find(array,a,i-1);
}
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the total number of elements in the array:");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.print("Enter the elements of the array:");
        for (int i=0;i<n;i++) {
            array[i]=sc.nextInt();
        }
        System.out.print("Enter the element whose last occurrence you want to find:");
        int a=sc.nextInt();
        int b=find(array,a,n-1);
        if (b!=-1) {
            System.out.println("The given element last occurred at "+b+"th index of the given array.");
        }
        else {
            System.out.println("The given element did not occur in the given array.");
        }
        sc.close();

    }
}