/* Write  a program in java to create a segment tree */
import java.util.*;
public class segment_trees {
  static int tree[];
  public static void init(int n) {
    tree=new int[4*n];
  }
  public static int buildST(int arr[],int sti, int start, int end) { // TC O(n)
    if (start==end) {
      tree[sti]=arr[start];
      return tree[sti];
    }
    int mid=(start+end)/2;
    int left=buildST(arr,2*sti+1,start,mid);
    int right=buildST(arr,2*sti+2,mid+1,end);
    tree[sti]=left+right;
    return tree[sti];
  }

  public static int getSum(int arr[],int qi, int qj) { // TC = O(logn)
    int n=arr.length;
    return getSumUtil(0,0,n-1,qi,qj);

  }
  public static int getSumUtil(int i,int si, int sj,int qi, int qj) {
    if (qj<si || sj<qi) { // non-overlapping
       return 0;
    }
    else if (si>=qi && sj<=qj) { // coplete overlap
      return tree[i];
    }
    else { // partial overlap
      int mid=(si+sj)/2;
      int left=getSumUtil(2*i+1,si,mid,qi,qj);
      int right=getSumUtil(2*i+2,mid+1,sj,qi,qj);
      return left+right;
    }
  }  

  public static void update (int arr[],int idx, int newVal) { // O(logn)
    int diff=newVal-arr[idx];
    arr[idx]=newVal;
    updateUtil(0,0,arr.length-1,idx,diff); // O(logn)
    return;
  }

  public static void updateUtil(int i, int si, int sj,int idx, int diff ) {
    if (idx>sj || idx<si) {
      return;
    }
    tree[i]+=diff;
    if (si!=sj) { // non-leaf
      int mid=(si+sj)/2;
      updateUtil(2*i+1,si,mid,idx,diff);
      updateUtil(2*i+2,mid+1,sj,idx,diff);
    }
    
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
    System.out.print("Enter the range whose values you want to find:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("The value in the range is:"+getSum(arr,a,b));
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