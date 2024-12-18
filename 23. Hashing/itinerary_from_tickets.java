/* Write a program to find itinerary(journey) from tickets 
 Chennai->Bengaluru
 Mumbai->Delhi
 Goa->Chennai
 Delhi->Goa
 OUtput: Mumbai->Delhi->Goa->Chennai->Bengaluru
*/
// TC O(n)
import java.util.*;
public class itinerary_from_tickets {
  public static void journey(String ticket[][]) {
    HashMap<String,String> to_from=new HashMap<>();
    HashMap<String,String> from_to=new HashMap<>();
    for (int i=0;i<ticket.length;i++) {
      from_to.put(ticket[i][0],ticket[i][1]);
      to_from.put(ticket[i][1],ticket[i][0]);
    }
    String start="";
    for (String s:from_to.keySet()) {
       if (!to_from.containsKey(s)) {
        start=s;
        break;
       }
    }
    String journey=start;
    while (from_to.containsKey(start)) {
      journey=journey+"->"+from_to.get(start);
      start=from_to.get(start);

    }
    System.out.println(journey);
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the total no. of tickets:");
    int n=sc.nextInt();
    String ticket[][]=new String[n][2];
    System.out.print("Enter the starting point and destination of all respective tickets:");
    for (int i=0;i<n;i++) {
      ticket[i][0]=sc.next();
      ticket[i][1]=sc.next();
    }
    System.out.println("The final journey schedule is:");
    journey(ticket);
    sc.close();
  }
  
}
