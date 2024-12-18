import java.util.*;
public class heap_implementation {
  static class Heap {
    ArrayList<Integer> arr=new ArrayList<>();

    public void insert(int data) { // O(logn)
        // insert at last index
        arr.add(data);

        // fix heap
        int x=arr.size()-1; // x is child index
        int par=(x-1)/2; // par index
        while (arr.get(x)<arr.get(par)) { // o(logn)
          int temp=arr.get(par);
          arr.set(par,arr.get(x));
          arr.set(x,temp);
          x=par;
          par=(x-1)/2;

        }
      }

      public int peek() {
        return arr.get(0);
      }

      private void heapify(int i) { // O(logn)
        int left=2*i+1;
        int right=2*i+2;
        int minIdx=i;
        if (left<arr.size() && arr.get(minIdx)>arr.get(left)) {
          minIdx=left;
        }
        if (right<arr.size() && arr.get(minIdx)>arr.get(right)) {
          minIdx=right;
        }
        if (minIdx!=i) {
          // swap
          int temp=arr.get(i);
          arr.set(i,arr.get(minIdx));
          arr.set(minIdx,temp);

          heapify(minIdx);
        }
      }

      public int remove() { // o(logn)
        int data=arr.get(0);

        // stwp-1 swap first and last
        arr.set(0,arr.get(arr.size()-1));
        arr.set(arr.size()-1,data);

        // step-2 delete last
        arr.remove(arr.size()-1);
        heapify(0);
        return data;
      }

      public boolean isEmpty() {
        return arr.size()==0;
      }
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    Heap h=new Heap();
    h.insert(3);
    h.insert(4);
    h.insert(1);
    h.insert(5);
    while (!h.isEmpty()) {
      System.out.println(h.peek());
      h.remove();
    }
    // System.out.print("Enter your choice:");
    // int choice=sc.nextInt();
    // switch(choice) {
    //   case 1:
    //   System.out.print("Enter the element to add:");
    //   int n=sc.nextInt();
    //   h.insert(n);
    //   case 2:
    //   default:
    // }
    sc.close();
  }
  
}
