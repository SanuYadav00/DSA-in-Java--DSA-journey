/* Write a program to find base power exponent faster 
 normal exponentiation= O(n)
 Fast exponentiation=O(logn)
 */
import java.util.*;
public class fast_exponentiation {
    public static int find(int a,int n) {
        int ans=1;
        while (n!=0) {
            if ((n&1)==1) {
                ans*=a;
            }
            a*=a;
            n=(n>>1);
        }
        return ans;
    }
public static void main(String args[]) {
    Scanner sc=new Scanner (System.in);
    for (int i=0;i<5;i++) {
    System.out.print("Enter a  base number:");
    int a=sc.nextInt();
    System.out.print("Enter the exponent(power) of base number:");
    int n=sc.nextInt();
    if (n>=0) {
    int b=find(a,n);
    System.out.println(n+" power "+a+" is:"+b);
    }
    else {
        int b=find(a,Math.abs(n));
        float c=1/ (float)b;
        System.out.println(n+" power "+a+" is:"+c); 
    }
}
sc.close();
}
}