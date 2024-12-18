/* Print the sum, difference and product of two complex numbers by creating a 
  class named Complex with separate methods for each operation whose real and imaginary parts are 
  entered by the user
  */
   import java.util.*;
   class Complex {
    int fi,fr,si,sr;
   Complex(int a, int b, int c, int d) {
    fr=a;
    fi=b;
    sr=c;
    si=d;
   }
   void sum() {
    System.out.println("The sum is:"+(fr+sr)+"+"+(fi+si)+"i");
   }
   void difference() {
    System.out.println("The difference is:"+(fr-sr)+"+"+(fi-si)+"i");
   }
   void multiply() {
    System.out.println("The product is:"+((fr*sr)-(fi*si))+"+"+((fr*si)+(sr*fi))+"i"); //(a+ib)(c+id)=(ac-bd)+i(ad+bc)
   }



   }

  public class complex_class {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the real part of first number:");
        int r1=sc.nextInt();
        System.out.print("Enter the imaginary part of first number:");
        int i1=sc.nextInt();
        System.out.print("Enter the real part of second number:");
        int r2=sc.nextInt();
        System.out.print("Enter the imaginary part of second number:");
        int i2=sc.nextInt();
        Complex obj=new Complex(r1,i1,r2,i2);
        obj.sum();
        obj.difference();
        obj.multiply();
        sc.close();


    }

  }