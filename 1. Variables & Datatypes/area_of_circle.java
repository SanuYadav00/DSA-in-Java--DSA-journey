import java.util.*;
public class area_of_circle {
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        
        System.out.print("Enter radius of circle:");
        float r=sc.nextFloat();
        float area=(22*r*r)/7;
        System.out.println("The area of circle is: "+area);
        sc.close();

    }
    
}
