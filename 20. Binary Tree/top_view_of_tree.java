/* Write a program to find the top view of a tree
*/
// Time Complexity O(n)
import java.util.*;
public class top_view_of_tree {
  static class Node {
    int data;
    Node left;
    Node right;
    Node (int data) {
      this.data=data;
    }
  }

  static class Info {
    Node node;
    int hd; // horizontal distance
    public Info(Node node, int hd) {
      this.node=node;
      this.hd=hd;
    }
  }

  public static void view(Node root) {
    Queue<Info> q=new LinkedList<>();
    HashMap<Integer,Node> map=new HashMap<>();
    int min=0,max=0;
    q.add(new Info(root, 0));
    q.add(null);
    while (!q.isEmpty()) {
      Info curr=q.remove();
      if (curr==null) {
        if (q.isEmpty()) {
          break;
        }
        else {
          q.add(null);
        }
      }
      else {
      if (!map.containsKey(curr.hd)) { // first time my hd is occuring
          map.put(curr.hd,curr.node);
      }
      if (curr.node.left!=null) {
        q.add(new Info(curr.node.left,curr.hd-1));
        min=Math.min(min,curr.hd-1);
      }
      if (curr.node.right!=null) {
        q.add(new Info(curr.node.right,curr.hd+1));
        max=Math.max(max,curr.hd+1);
      }
    }
  }
    for (int i=min;i<=max;i++) {
      System.out.print(map.get(i).data+" ");
    }
    System.out.println();
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
    Node root=new Node(1);;
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.right=new Node(4);
    root.left.right.right=new Node(5);
    root.left.right.right.right=new Node(6); 
    /*Node root=new Node(1);;
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.right=new Node(6);*/
    System.out.println("The top view of the given tree is:");
    view(root);

  }
  
}
