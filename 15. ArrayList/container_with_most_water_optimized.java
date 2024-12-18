/* For n given lines on X-axis, use 2 lines to form
 a container such that it holds maximum water */
 // suppose 1 litre of water can be stored in 1 unit height and 1 unit width
// Time Complexity=O(n)
import java.util.*;
 public class container_with_most_water_optimized {
  public static int water(ArrayList<Integer> array) {
    int n=array.size();
    int lp=0; // left_pointer
    int rp=n-1; // right-pointer
    int max=Integer.MIN_VALUE;
    while (lp<rp) {
      int temp= Math.min(array.get(lp),array.get(rp)) * (rp-lp); // water= height* width
      max=Math.max(max,temp);
      if (array.get(lp)<array.get(rp)) {
        lp++;
      }
      else {
        rp--;
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