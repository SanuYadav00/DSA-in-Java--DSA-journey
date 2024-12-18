/* Write a program to print the elements at kth level of a tree */
// Time Complexity O(n)
import java.util.*;
public class kth_level_of_tree {
  static class Node {
    int data;
    Node left;
    Node right;
    Node (int data) {
      this.data=data;
    }
  }


  public static void level(Node root,int level,int k) {
    if (root==null) {
      return;
    }
    if(level==k) {
      System.out.print(root.data+" ");
      return;
    }
    level(root.left,level+1,k);
    level(root.right,level+1,k);
    return;
  }

  
  public static void main(String args[]) {
    /* 1        2
      / \      / \
     2   3    4   5
      \   
       4
        \
         5
          \
           6        
     */
   Scanner sc=new Scanner(System.in);
    /* Node root=new Node(1);;
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.right=new Node(4);
    root.left.right.right=new Node(5);
    root.left.right.right.right=new Node(6); */
    Node root=new Node(1);;
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.right=new Node(6);
    System.out.print("Enter the value of K:");
    int k=sc.nextInt();
    System.out.println("The elements at kth level of tree are:");
    level(root,1,k);
    sc.close();

  }
  
}
