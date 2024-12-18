/* We are given N points in a @D plane which are locations of N
cars. If we are at the origin, print the nearest K cars  */
import java.util.*;
public class nearby_cars {
  static class Point implements Comparable<Point> {
    int x;
    int y;
    int distance;
    int no;
    public Point(int x,int y,int distance, int no) {
      this.x=x;
      this.y=y;
      this.distance=distance;
      this.no=no;
    }
    @Override
    public int compareTo (Point p) {
      return this.distance-p.distance;
    }
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the no. of cars (N):");
    int n=sc.nextInt();
    System.out.print("Enter the value of k:");
    int k=sc.nextInt();
    PriorityQueue<Point> cars=new PriorityQueue<>();
    System.out.print("Enter the x-coordinate and y-coordinate respectively of all the points:");
    for (int i=0;i<n;i++) {
       int x=sc.nextInt();
       int y=sc.nextInt();
       int distance=(x*x)+(y*y);
       cars.add(new Point(x,y,distance,i));
  
    }
    System.out.print("The nearest "+k+" cars are:");
    for (int i=0;i<k;i++) {
      System.out.print(" C"+cars.peek().no);
      cars.remove();
    }
    System.out.println();
    sc.close();
  }
}