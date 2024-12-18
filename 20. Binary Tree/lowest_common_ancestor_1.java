/* Write a program to print the elements at kth level of a tree */
// Time Complexity O(n)
// We have to create 2 separate array list in this approach. So, its space 
// complexity is more. So, we developed more efficient approach
import java.util.*;
public class lowest_common_ancestor_1 {
  static class Node {
    int data;
    Node left;
    Node right;
    Node (int data) {
      this.data=data;
    }
  }
  
  public static boolean getPath(Node root,int n,ArrayList<Node> path) { // O(n)
      if (root==null) {
        return false;
      }
      path.add(root);
      if (root.data==n) {
        return true;
      }
      if (getPath(root.left,n,path) || getPath(root.right,n,path)) {
        return true;
      }
      path.remove(path.size()-1);
      return false;
  }

  public static Node find(Node root,int n1,int n2) { // )(n)
    ArrayList<Node> path1=new ArrayList<>();
    ArrayList<Node> path2=new ArrayList<>();
    getPath(root,n1,path1);
    getPath(root,n2,path2);

    // last common ancestor
    int i=0;
    for (;i<path1.size() && i<path2.size();i++) {
      if (path1.get(i)!=path2.get(i)) {
        break;
      }
    }
    Node lca=path1.get(i-1);
    return lca;
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
    Node root=new Node(1);;
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.right=new Node(4);
    root.left.right.right=new Node(5);
    root.left.right.right.right=new Node(6);
   /* Node root=new Node(1);;
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.right=new Node(6); */
    System.out.print("Enter first node value:");
    int n1=sc.nextInt();
    System.out.print("Enter second node value:");
    int n2=sc.nextInt();
    System.out.println("The lowest common ancestor of the two nodes is:"+find(root,n1,n2).data);
    sc.close();

  }
  
}
