/* WAP to print inputted number if the number is not multiple of 10*/
import java.util.*;
public class continue_keyword {
    
   public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    do {
    System.out.print("Enter a number:");
    int n=sc.nextInt();
    if (n%10!=0) {
        System.out.println("The inputted number is:"+n);  
}
else if (n%1000==0) {
    break;
}
else {
    continue;
}
    
   } while(true);
sc.close();
}
    
}

