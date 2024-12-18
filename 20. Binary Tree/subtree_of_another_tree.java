/* Given the roots of two binary trees root and subRoot, return true if there is a subtree of root
with the same structure and node values of subRoot and false otherwise 
*/
// O(n*n)
public class subtree_of_another_tree {
  static class Node {
    int data;
    Node left;
    Node right;
    Node (int data) {
      this.data=data;
    }
  }

  public static boolean isIdentical(Node root, Node sroot) {
    if (root==null && sroot==null) {
      return true;
    }
    else if (root==null || sroot==null || root.data!=sroot.data) {
     return false; 
    }
    if (!isIdentical(root.left,sroot.left)) {
      return false;
    }
    if (!isIdentical(root.right,sroot.right)) {
      return false;
    }
    return true;

  }

  public static boolean isSubtree(Node root,Node sroot) {
    if (root==null) {
      return false;
    }  
    if (sroot.data==root.data) {
        if (isIdentical(root,sroot)) {
          return true;
        }
      }
      return isSubtree(root.left,sroot)||isSubtree(root.right,sroot);
  }
  public static void main(String args[]) {
    /* 1        2
      / \      / \
     2   3    4   5
    / \   \
   4   5   6     
     */
    Node root=new Node(1);;
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.right=new Node(6);

    Node subRoot=new Node(2);
    subRoot.left=new Node(4);
    subRoot.right=new Node(5);
    System.out.println("The given subtree is a part of the given tree:"+isSubtree(root,subRoot));

  }
  
}
