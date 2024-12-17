/* WAP to print a pattern like 
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
    
*/
import java.util.*;
public class butterfly_pattern {
   public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter length of the pattern:");
    int a=sc.nextInt();
    for (int i=1;i<=a/2;i++) {
        for (int j=1;j<=a/2;j++) {
            if (j<=i) {
            System.out.print("*");
    } 
    else {
        System.out.print(" ");
    }
}   
for (int k=1;k<=a/2;k++) {
        if (k+i<=a/2) {
        System.out.print(" ");
} 
else {
    System.out.print("*");
}

}
    System.out.print("\n");
    
   } 
   for (int i=1;i<=a/2;i++) {
    for (int j=1;j<=a/2;j++) {
        if (j+i-1<=a/2) {
        System.out.print("*");
} 
else {
    System.out.print(" ");
}
}   
for (int k=1;k<=a/2;k++) {
    if (k>=i) {
    System.out.print("*");
} 
else {
System.out.print(" ");
}

}
System.out.print("\n");

} 
   
   sc.close();
}

    
}
