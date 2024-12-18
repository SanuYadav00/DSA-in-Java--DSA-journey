/* We are given an infinite supply of denominations [1,2,5,10,20,50,100,500,2000].
 Find minimum no. of coins/notes to make change for a value v.
 Input:V=121
 Output:ans=3 (100+20+1)
 Input:V=590
 Output:ans=4 (500+50+20+20)
 */
// Time Complexity O(n)
import java.util.*;
public class indian_coins {
  public static void find(int notes[],int v) {
    int n=0;
    int rv=v; // remaining value to change
    System.out.print("The change description is:");
    int index=notes.length-1;
    while (rv>0) {
        if (notes[index]<=rv) {
            n++;
            System.out.print(notes[index]+"+");
            rv-=notes[index];
        }
        else {
          index--;
        }
    }
    System.out.println();
    System.out.println("The minimum no. of coins/notes required for making the change is:"+n);
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int notes[]={1,2,5,10,20,50,100,500,2000};
    System.out.print("Enter the amount whose change you want:");
    int v=sc.nextInt();
    find(notes,v);
    sc.close();
  }
  
}
