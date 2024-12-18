/* write a program using recursion to find the first occurrence of an element in an array  */
// space complexity O(n)
// time complexity O(n)
import java.util.*;
public class first_occurrence {
 public static int find(int array[],int b,int i) {
    if (array[i]==b) {
        return i;
    }
    if (i==array.length-1) {
        return -1;
    }
    return find(array,b,i+1);

    

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
        System.out.print("Enter the element whose occurence you want to find:");
        int a=sc.nextInt();

         int b=find(array,a,0);
         if (b!=-1) {
        System.out.println("The given element first occured at:"+b+"th index.");
         }
         else {
            System.out.println("The given element did not occur.");
             }
        sc.close();

    }
}