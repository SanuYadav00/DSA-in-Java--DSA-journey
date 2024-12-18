/* Write a program to show the implementation of different operations inside a hashmap */
import java.util.*;
public class HashMap_Implementation {
  static class HashMap<k,v> { //generic
    private class Node {
      k key;
      v value;
      public Node (k key, v value) {
        this.key=key;
        this.value=value;
      }
    }
    private int n; //n (no. of nodes)
    private int N; // bucket size
    private LinkedList<Node> buckets[]; // N no. of buckets 
    // data type of bucket array is linked list of nodes

    @SuppressWarnings("unchecked")

    public HashMap() { // constructor of hashmap class
      this.N=4;
      this.buckets=new LinkedList[4];
      for (int i=0;i<4;i++) {
        this.buckets[i]=new LinkedList<>();
      }
    }
    
    private int hashFunction (k key) {
        int hc=key.hashCode();
        return Math.abs(hc)%N;
      }

     private int SearchInLL (k key, int bi) {
      LinkedList<Node> ll= buckets[bi];
      int di=0;
      for (int i=0;i<ll.size();i++) {
        Node node=ll.get(i);
        if (node.key==key) {
          return di;
        }
        di++;
      }
      return -1;
     } 
    
     @SuppressWarnings("unchecked")
    private void rehash() {
      LinkedList<Node> oldBuck[]=buckets;
      buckets=new LinkedList[N*2];
      N=2*N;
      for (int i=0;i<buckets.length;i++) {
        buckets[i]=new LinkedList<>(); 
      }
      // nodes -> add in bucket
      for (int i=0;i<oldBuck.length;i++) {
        LinkedList<Node> ll=oldBuck[i];
        for (int j=0;j<ll.size();j++) {
          Node node=ll.remove();
          put(node.key, node.value);
        }
      }
    }
    public void put(k key, v value) { // O(lambda) 
      // since lambda is always constant so O(1)
       int bi=hashFunction(key);
       int di=SearchInLL(key,bi); // output will be either valid index of already existing key or -1 
       if (di!=-1) {
        Node node=buckets[bi].get(di);
        node.value=value;
       }
       else {
        buckets[bi].add(new Node(key,value));
        n++;
       }
       double lambda= (double)n/N;
       if (lambda > 2.0) { // let threshold value is 2
           rehash();
       }
    }

    public boolean containsKey (k key) { // O(1)
      int bi=hashFunction(key);
       int di=SearchInLL(key,bi); // output will be either valid index of already existing key or -1 
       if (di!=-1) { // valid
         return true;
       }
       else {
        return false;
       }
      }

    public v remove (k key) { // O(1)
      int bi=hashFunction(key);
      int di=SearchInLL(key,bi); // output will be either valid index of already existing key or -1 
      if (di!=-1) {
       Node node=buckets[bi].remove(di);
       n--;
       return node.value;
      }
      else {
       return null;
      }
    }

    public v get (k key) {
      int bi=hashFunction(key);
       int di=SearchInLL(key,bi); // output will be either valid index of already existing key or -1 
       if (di!=-1) {
        Node node=buckets[bi].get(di);
        return node.value;
       }
       else {
        return null;
       }
    }

    public ArrayList<k> keySet() {
      ArrayList<k> keys=new ArrayList<>();
      for (int i=0;i<buckets.length;i++) {
         LinkedList<Node> ll=buckets[i];
         for (Node node:ll) {
          keys.add(node.key);
         }
      }
      return keys;
    }

    public boolean isEmpty() {
      return n==0;
    }
  }
  public static void main(String args[]) {
    HashMap<String,Integer> hm=new HashMap<>();
    hm.put("India",100);
    hm.put("China",150);
    hm.put("US",50);
    hm.put("Nepal",5);
    ArrayList<String> keys=hm.keySet();
    for (String key:keys) {
      System.out.println(key);
    }
    System.out.println(hm.get("India"));
    System.out.println(hm.remove("India"));
    System.out.println(hm.get("India"));
  }
}