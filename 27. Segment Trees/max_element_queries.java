/* Write  a program in java to create a max segment tree and perform below queries
 a. Output max for the subarray[i...j]
 b. Update the element at idx
 */
// TC for creation of segment tree O(n)
// TC for finding max of a range O(logn)
// TC for updating values O(logn)
import java.util.*;
public class max_element_queries {
  static int tree[];
  public static void init(int n) {
    tree=new int[4*n];
  }
  public static void buildST(int arr[],int sti, int start, int end) { // TC O(n)
    if (start==end) {
      tree[sti]=arr[start];
      return;
    }
    int mid=(start+end)/2;
    buildST(arr,2*sti+1,start,mid);
    buildST(arr,2*sti+2,mid+1,end);
    tree[sti]=Math.max(tree[2*sti+1],tree[2*sti+2]);
    return;
  }

  public static int getMax(int arr[],int qi, int qj) { // TC = O(logn)
    int n=arr.length;
    return getMaxUtil(0,0,n-1,qi,qj);

  }
  public static int getMaxUtil(int i,int si, int sj,int qi, int qj) {
    if (qj<si || sj<qi) { // non-overlapping
       return Integer.MIN_VALUE;
    }
    else if (si>=qi && sj<=qj) { // coplete overlap
      return tree[i];
    }
    else { // partial overlap
      int mid=(si+sj)/2;
      int left=getMaxUtil(2*i+1,si,mid,qi,qj);
      int right=getMaxUtil(2*i+2,mid+1,sj,qi,qj);
      return Math.max(left,right);
    }
  }  

  public static void update (int arr[],int idx, int newVal) { // O(logn)
    arr[idx]=newVal;
    updateUtil(0,0,arr.length-1,idx,newVal); // O(logn)
    return;
  }

  public static void updateUtil(int i, int si, int sj,int idx, int newVal ) {
    if (idx>sj || idx<si) {
      return;
    }
    if (si==sj) {
      tree[i]=newVal;
    }
    tree[i]=Math.max(tree[i],newVal);
    if (si!=sj) {
      tree[i]=Math.max(tree[i],newVal);
      int mid=(si+sj)/2;
      updateUtil(2*i+1,si,mid,idx,newVal);
      updateUtil(2*i+2,mid+1,sj,idx,newVal);
    }
      return;
    // if (idx>sj || idx<si) {
    //   return;
    // }
    // else if (si==sj) {
    //   tree[i]=newVal;
    //   return;
    // }
    //   int mid=(si+sj)/2;
    //   updateUtil(2*i+1,si,mid,idx,newVal);
    //   updateUtil(2*i+2,mid+1,sj,idx,newVal);
    //   tree[i]=Math.max(tree[2*i+1],tree[2*i+2]);
    //   return;
     }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the total no. of elements in the array:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.print("Enter the elements of the array:");
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt(); 
    }
     init(n);
    buildST(arr,0,0,n-1); 
    System.out.print("The elements of the segment tree are:");
    for (int i=0;i<tree.length;i++) {
      System.out.print(tree[i]+" ");
    }
    System.out.println();
    System.out.print("Enter the range whose max value you want to find:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("The max value in the range is:"+getMax(arr,a,b));
    System.out.print("Enter the index whose value you want to update:");
    int idx=sc.nextInt();
    System.out.print("Enter the new value:");
    int newVal=sc.nextInt();
    update(arr,idx,newVal);
    System.out.print("The elements of the segment tree after updation are:");
    for (int i=0;i<tree.length;i++) {
      System.out.print(tree[i]+" ");
    }
    System.out.println();
    sc.close();
  }
}