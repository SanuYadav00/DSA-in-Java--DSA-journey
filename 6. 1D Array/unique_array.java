/* Write a program to check if the elemnts of array are unique or not
 */
import java.util.*;
public class unique_array {
    public static void market(int price[]) {
        int n=price.length;
        for (int i=0;i<n;i++) {
            for (int j=i+1;j<n;j++) {
              if (price[i]==price[j]) {
                System.out.println("The elements of the array are repeated(are not unique)");
                return;
              }
            }
        } 
    
            

        System.out.println("The elements of the array are unique.");
        return;   
    }
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total no. of elements in the array:");
        int n=sc.nextInt();
        int price[]=new int[n];
        System.out.print("Enter the array elements:");
        for (int i=0;i<price.length;i++) {
            price[i]=sc.nextInt();
        }
        System.out.print("The array elements are:");
        for (int i=0;i<price.length;i++) {
            System.out.print(" "+price[i]);
        }
        System.out.println();
        market(price);
    


     sc.close();

    }
}

