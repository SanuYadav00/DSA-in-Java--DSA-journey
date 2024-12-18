/* Write a program to know if a pair of the elements of a arraylist
 give the target sum or not
  */
 
// Time Complexity=O(n^2)
import java.util.*;
 public class pair_sum1_BF {
  public static boolean sum(ArrayList<Integer> array, int target) {
    int n=array.size();
  boolean a=false; 
  for (int i=0;i<n-1;i++) {
    for (int j=i+1;j<n;j++) {
      if (array.get(i)+array.get(j)==target) {
        return true;
      }
    }
  }
    return a;
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

    boolean a=sum(array,19);
   System.out.println("The elements give the target pair sum:"+a);
  
   
  
  }
  }