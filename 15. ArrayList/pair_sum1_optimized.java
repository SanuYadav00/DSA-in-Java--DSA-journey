/* Write a optimized program to know if a pair of the elements of a arraylist
 give the target sum or not
  */
 // we will use 2 pointer approach
// Time Complexity=O(n)
import java.util.*;
 public class pair_sum1_optimized {
  public static boolean sum(ArrayList<Integer> array, int target) {
    int n=array.size();
    int lp=0;
    int rp=n-1;
 
  while (lp<rp) {
    if (array.get(lp)+array.get(rp)==target) {
      return true;
    }
    else if ((array.get(lp)+array.get(rp))>target) {
      rp--;
    }
    else {
      lp++;
    }
  }
    return false;
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
   Collections.sort(array);
   int target=17;
    boolean a=sum(array,target);
   System.out.println("The elements give the target pair sum:"+a);
  
   
  
  }
  }