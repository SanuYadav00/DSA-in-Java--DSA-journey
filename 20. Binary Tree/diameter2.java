/* Write a program to find the diameter of a tree */
// Time complexity O(n)
public class diameter2 {
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
  public static class Info {
    int ht; // height
    int dm; // diameter
    public Info(int diam,int height) {
      this.ht=height;
      this.dm=diam;
    }
  }
  public static Info find(Node root) { // TC O(n)
    if (root==null) {
      return new Info(0,0);
    }
     Info leftInfo=find(root.left);
     Info rightInfo=find(root.right);
     int diam=Math.max(Math.max(leftInfo.dm,rightInfo.dm),(leftInfo.ht+rightInfo.ht+1));
     int height=Math.max(leftInfo.ht,rightInfo.ht)+1;
     return new Info(diam,height);
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
    System.out.println("The diameter of the tree is:"+find(root).dm);
    System.out.println("The height of the tree is:"+find(root).ht);

  }
}
