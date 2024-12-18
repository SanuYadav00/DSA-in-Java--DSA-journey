/* You are given n pairs of numbers. In every pair, the first number is always 
smaller than the second number. A pair (c,d) can come after pair (a,b) 
if b<c. Find the longest chain which can be formed from a given set of 
pairs.
Sample input:pairs:(5,24),(39,60),(5,28),(27,40),(50,90)
Sample output: ans=3
 */
// Time complexity O(nlogn) 
// Time complexity of inbuilt sort of arrays is O(nlogn)
import java.util.*;
public class max_length_chain_of_pairs {
  public static int chain(int A[][]) {
    Arrays.sort(A,Comparator.comparingDouble(o->o[2]));
    int n=0;
    ArrayList<Integer> arr=new ArrayList<>();
    arr.add(A[0][0]);
    int endPoint=A[0][2];
    n++;
    for (int i=1;i<A.length;i++) {
      if (A[i][1]>=endPoint) {
        arr.add(A[i][0]);
        endPoint=A[i][2];
        n++;
      }
    }
    System.out.print("The pairs used to make longest chain are:");
    for (int i=0;i<arr.size();i++) {
       System.out.print(" "+arr.get(i)+"th pair,");
    }
    System.out.println();
    return n;
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the total number of pairs:");
    int n=sc.nextInt();
    int pairs[][]=new int[n][3];
    System.out.print("Enter the pairs:");
    for (int i=0;i<n;i++) {
        pairs[i][0]=i;
        pairs[i][1]=sc.nextInt();
        pairs[i][2]=sc.nextInt();
    }
    System.out.print("The length of longest chain is:"+chain(pairs));
    sc.close();
  }
}


