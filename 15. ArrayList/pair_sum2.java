/* Write a program to find if any pair in a sorted & rotated arraylist
has a target sum.
For example: list={11,15,6,8,9,10} target=16
  */
 // we will use 2 pointer approach
// Time Complexity=O(n)
import java.util.*;
 public class pair_sum2 {
  public static boolean sum(ArrayList<Integer> array, int target) {
    int n=array.size();
    int lp=0; // left pointer
    int rp=n; // right pointer
    for (int i=0;i<n;i++) {
      if (array.get(i)>array.get(i+1)) {
        lp=i+1;
        rp=i;
        break;
      }
    }
    
 
  while (lp!=rp) {
    if (array.get(lp)+array.get(rp)==target) {
      return true;
    }
    else if ((array.get(lp)+array.get(rp))>target) {
      rp=(n+rp-1)%n;
    }
    else {
      lp=(lp+1)%n;
    }
  }
    return false;
  }
    public static void main(String args[]) {
    ArrayList<Integer> array=new ArrayList<>();
   array.add(11);
   array.add(15);
   array.add(6);
   array.add(8);
   array.add(9);
   array.add(10);
   System.out.println(array);
   int target=16;
    boolean a=sum(array,target);
   System.out.println("The elements give the target pair sum:"+a);
  
   
  
  }
  }