/* Write a program to convert a tree into a sum-tree
 In a sum tree, each node=sum of left & right subtrees
 */
// Time Complexity O(n)
import java.util.*;
public class sum_tree {
  static class Node {
    int data;
    Node left;
    Node right;
    Node (int data) {
      this.data=data;
    }
  }
  
  public static int convert(Node root) {  //O(n)
    if (root==null) {
      return 0;
    }
    int leftdata=convert(root.left);
    int rightdata=convert(root.right);
    int data=root.data;
    if (root.left==null && root.right==null) {
      root.data=rightdata+leftdata;
    }
    else if(root.left==null) {
      root.data=rightdata+leftdata+root.right.data;
    }
    else if(root.right==null) {
      root.data=rightdata+leftdata+root.left.data;
    }
    else {
      root.data=rightdata+leftdata+root.right.data+root.left.data;
    }
    return data;
    
  }

  public static void levelorder(Node root) { //O(n)
    if (root==null) {
      return;
    }
    Queue<Node> q=new LinkedList<>();
    q.add(root);
    q.add(null);
    while (!q.isEmpty()) {
      Node currNode=q.remove();
      if (currNode==null) {
        System.out.println();
        if (q.isEmpty()) {
          break;
        }
        else {
          q.add(null);
        }
      }
      else {
        System.out.print(" "+currNode.data);
        if (currNode.left!=null) {
          q.add(currNode.left);
        }
        if (currNode.right!=null) {
        q.add(currNode.right);
        }
      }
    }
  }
  
  public static void main(String args[]) {
    /* 1               1
      / \             / \
     2   3           2   3
      \             / \ / \
       4           4  5 6  7
        \
         5
          \
           6        
     */
   Scanner sc=new Scanner(System.in);
    // Node root=new Node(1);;
    // root.left=new Node(2);
    // root.right=new Node(3);
    // root.left.right=new Node(4);
    // root.left.right.right=new Node(5);
    // root.left.right.right.right=new Node(6); 
    Node root=new Node(1);;
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7); 
    convert(root);
    System.out.println("The sum tree is:");
    levelorder(root);
    sc.close();

  }
  
}