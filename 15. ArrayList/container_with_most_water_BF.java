/* For n given lines on X-axis, use 2 lines to form
 a container such that it holds maximum water */
 // suppose 1 litre of water can be stored in 1 unit height and 1 unit width
// Time Complexity=O(n^2)
import java.util.*;
 public class container_with_most_water_BF {
  public static int water(ArrayList<Integer> array) {
    int n=array.size();
    int max=Integer.MIN_VALUE;
    for (int i=0;i<n-1;i++) {
      for (int j=i+1;j<n;j++) {
          int temp=Math.min(array.get(i),array.get(j)) * (j-i);
          max=Math.max(max,temp);
      }
    }
    return max;
  }
    public static void main(String args[]) {
    ArrayList<Integer> array=new ArrayList<>();
   array.add(1);
   array.add(8);
   array.add(6);
   array.add(2);
   array.add(5);
   array.add(4);
   array.add(8);
   array.add(1);
   array.add(7);

    int a=water(array);
   System.out.println("The maximum water that can be hold is:"+a+" litres.");
  
   
  
  }
  }



// using array
/* public class container_with_most_water_BF {
public static int water(int array[]) {
  int n=array.length;
  int max=Integer.MIN_VALUE;
  for (int i=0;i<n-1;i++) {
    for (int j=i+1;j<n;j++) {
        int temp=Math.min(array[i],array[j]) * (j-i);
        max=Math.max(max,temp);
    }
  }
  return max;
}
  public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the no of lines:");
  int n=sc.nextInt();
  int array[]=new int[n];
 System.out.print("Enter the height of the respective lines:"); 
 for (int i=0;i<n;i++) {
  array[i]=sc.nextInt();
 }int a=water(array);
 System.out.println("The maximum water that can be hold is:"+a+" litres.");

 sc.close();

}
} */