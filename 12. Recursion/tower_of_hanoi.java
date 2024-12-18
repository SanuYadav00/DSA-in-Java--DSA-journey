/* You have 3 towers and N disks of different sizes which can slide onto any tower.
The puzzle starts with disks sorted in ascending order of size from top to bottom (i.e, each 
disk sits on top of an even larger one)
You have the following constraints:
(1) Only one disk can be moved at a time.
(2) A disk is slid off the top of one tower onto another tower.
(3)A disk cannot be placed on top of a smaller disk. Write a program 
to move the disks from the first tower to thelast using Stacks.
Hint: The approach is:
-shift n-1 discs from A to B using C
-Shift the last disc from A to C
-Shift n-1 discs from B to C using A 
*/
import java.util.*;
public class tower_of_hanoi {
 public static void shift (int n, String src, String helper, String dest) {
    if(n==1) {
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        return;
    }
    //transfer top n-1 from src to helper usingdest as 'helper'
    shift(n-1,src,dest,helper);
    //transfer nth from src to dest
    System.out.println("transfer disk "+n+" from "+src+" to "+dest);
    //transfer n-1 from helper to dest using srcas 'helper'
    shift(n-1,helper,src,dest);
    }

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of disc:");
        int n=sc.nextInt();
        shift(n,"A","B","C");
        sc.close();

    }
}