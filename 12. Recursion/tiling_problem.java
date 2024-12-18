/* Given a "2*n" board(floor) and tiles of size "2*1" , count the 
number of ways to tile the given board using the 2*1 tiles.
 (A tile can either be placed horizontally or vertically) */
 import java.util.*;
public class tiling_problem {
 public static int find(int n) {
    if (n==0 || n==1) {
        return 1;
    }
    return find(n-1)+find(n-2); // total ways=total ways if we choose horizontal+total ways if we choose vertical
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of the board:");
        int n=sc.nextInt();
        int totalways=find(n);
        System.out.print("The total number of ways is:"+totalways);
        sc.close();

    }
}


