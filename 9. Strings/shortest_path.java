/* Given a route containing 4 directions East(right), West(left), 
North(up), South(down). Find the shortest path to reach destination. "WNEENESENNN" */
import java.util.*;
public class shortest_path {
    public static float find (String str) {
        int n=str.length();
        int x=0;
        int y=0;
        for (int i=0;i<n;i++) {
            if (str.charAt(i)=='S') {
                y--;
            }
            if (str.charAt(i)=='N') {
                y++;
            }
            if (str.charAt(i)=='E') {
                x++;
            }
            if (str.charAt(i)=='W') {
                x--;
            }
        }

        return (float)(Math.sqrt((x*x)+(y*y)));
    }
    public static void main(String arg[]) {
        Scanner sc=new Scanner (System.in);
        String route;
        System.out.println("Enter the directions to reach destination(N,S,E,W):");
        route=sc.nextLine();
        System.out.println("The inputted direction is:"+route);
        float a=find(route);
        System.out.print("The shortest distance is:"+a+" units.");
        

        sc.close();

      
    }
}