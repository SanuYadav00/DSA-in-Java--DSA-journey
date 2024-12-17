import java.util.*;
public class income_tax_calculator {
   public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter your income:");
    int income=sc.nextInt();
    if (income<500000) {
        System.out.println("You don't need to pay tax.");
    }
    else if (income<1000000) {
        int tax=(int) (income*0.2f);
        System.out.println("You will have to pay Rs"+tax+" as tax.");

    }
    else {
        int tax=(int)(income*0.3f);
        System.out.println("You will have to pay Rs"+tax+" as tax.");

    }



sc.close();
   } 
}

    

