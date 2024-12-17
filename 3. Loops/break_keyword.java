/* WAP to print inputted until the number is 10*/
import java.util.*;
public class break_keyword {
    
   public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    for (int i=0;i>=0;i++) {
    System.out.print("Enter a number:");
    int n=sc.nextInt();
    if (n%10!=0) {
        System.out.println("The inputted number is:"+n);  
}
else {
    break;
}
    
   } 
   sc.close();
}
    
}
