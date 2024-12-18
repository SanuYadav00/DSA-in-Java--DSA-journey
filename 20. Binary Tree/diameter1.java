/* Write a program to find the diameter of a tree */
// Time complexity O(n*n)
public class diameter1 {
  public static class Node {
    int data;
    Node right;
    Node left;
    public Node(int data) {
      this.data=data;
      this.left=null;
      this.right=null;
    }
  }
  public static int find(Node root) { // TC O(n*n (n square))
    if (root==null) {
      return 0;
    }
    int leftDiam=find(root.left);
    int lh=height(root.left); //left height
    int rightDiam=find(root.right);
    int rh=height(root.right); // right height

    int selfDiam=lh+rh+1;
    return Math.max(selfDiam,Math.max(leftDiam,rightDiam));
  }

  public static int height(Node root) { // O(n) where n is the no. of nodes
    if (root==null) {
      return 0;
    }
    int lh=height(root.left);
    int rh=height(root.right);
    int height=Math.max(lh,rh)+1;
     return height;
  }

  public static void main(String args[]) {
    /*  
            1 
           / \
          2   3
         / \ / \
        4  5 6  7
    */
    Node root=new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7);
    System.out.println("The diameter of the tree is:"+find(root));

  }
}
