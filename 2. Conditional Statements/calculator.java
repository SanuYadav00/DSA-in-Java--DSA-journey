/* WAP to create a calculator which performs +,-,*,/,% operations
 using switch case statement */
import java.util.*;
public class calculator {
   public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter first number (operand):");
    int a=sc.nextInt();
    System.out.print("Enter second number (operand):");
    int b=sc.nextInt();
    System.out.print("Enter the operation you want to perform:");
    char operation=sc.next().charAt(0);
    switch(operation) {
        case '+':
        System.out.println("The result is:"+(a+b));
        break;
        case '-':
        System.out.println("The result is:"+(a-b));
        break;
        case '*':
        System.out.println("The result is:"+(a*b));
        break;
        case '/':
        System.out.println("The result is:"+(a/b));
        break;
        case '%':
        System.out.println("The result is:"+(a%b));
        break;
        default:
        System.out.println("Invalid Input");

    }


    sc.close();
   } 
}

