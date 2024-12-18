/* Write a program to build a tree in a preorder way, traverse the tree in pre-order , post-order, in-order and
 level-order ways. Also find the height of the tree , total no. of nodes and sum of all nodes
 */
// time complexity O(n)
import java.util.*;
public class part1 {
  public static class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
      this.data=data;
      this.left=null;
      this.right=null;

    } 
  }
  
  static class BinaryTree {
    static int index=-1;
    public  Node buildTree(int nodes[]) {
        index++;
        if (nodes[index]==-1) {
          return null;
        }
        Node newnode=new Node(nodes[index]);
        newnode.left=buildTree(nodes);
        newnode.right=buildTree(nodes);
        return newnode;
    }

    public void preorder(Node root) { // tc O(n)
      if (root==null) {
        return;
      }
      System.out.print(root.data+"->");
      preorder(root.left);
      preorder(root.right);
    }

    public void inorder(Node root) { // tc O(n)
      if (root==null) {
        return;
      }
      inorder(root.left);
      System.out.print(root.data+"->");
      inorder(root.right);
    }

    public void postorder(Node root) { // tc O(n)
      if (root==null) {
        return;
      }
      postorder(root.left);
      postorder(root.right);
      System.out.print(root.data+"->");
    }

    public void levelorder(Node root) { //O(n)
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

    public int height(Node root) { // O(n) where n is the no. of nodes
      if (root==null) {
        return 0;
      }
      int lh=height(root.left);
      int rh=height(root.right);
      int height=Math.max(lh,rh)+1;
       return height;
    }

    public int count (Node root) { // O(n)
      if (root==null) {
        return 0;
      }
      return count(root.left)+count(root.right)+1;
    }

    public int sum(Node root) { // O(n)
      if (root==null) {
        return 0;
      }
      return root.data+sum(root.left)+sum(root.right);
    }
  }
  public static void main(String args[]) {
    BinaryTree tree=new BinaryTree();
    int Nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    Node root=tree.buildTree(Nodes);
    System.out.print("The pre-order traversal of the tree is:");
    tree.preorder(root);
    System.out.println();
    System.out.print("The in-order traversal of the tree is:");
    tree.inorder(root);
    System.out.println();
    System.out.print("The post-order traversal of the tree is:");
    tree.postorder(root);
    System.out.println();
    System.out.println("The level-order traversal of the tree is:");
    tree.levelorder(root);
    System.out.println("The height of tree is:"+tree.height(root));
    System.out.println("The total no. of nodes in the given tree is:"+tree.count(root));
    System.out.println("The sum of all node values is:"+tree.sum(root));
  }
}