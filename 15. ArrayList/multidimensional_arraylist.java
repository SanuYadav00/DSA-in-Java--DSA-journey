/* Write a program to print the reverse of an arraylist */
// Time Complexity=O(n)
import java.util.*;
import java.util.ArrayList;
public class multidimensional_arraylist {
public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
  ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
  ArrayList<Integer> list1=new ArrayList<>();
  ArrayList<Integer> list2=new ArrayList<>();
  ArrayList<Integer> list3=new ArrayList<>();

  for (int i=1; i<=5; i++) {
    list1.add(i*1); // 1 2 3 4 5
    list2.add(i*2); // 2 4 6 8 10
    list3.add(i*3); // 3 6 9 12 15
  }
  mainlist.add(list1);
  mainlist.add(list2);
  mainlist.add(list3);
  list2.remove(3);
  System.out.println(mainlist);

  System.out.println("The elements are:");
  for (int i=0;i<mainlist.size();i++) {
    ArrayList<Integer> currlist=mainlist.get(i);
    for (int j=0;j<currlist.size();j++) {
      System.out.print(currlist.get(j)+" ");

    }
    System.out.println();
  }
  
 sc.close();

}
}