/* The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.

For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
Given an integer num, return its complement.

 

Example 1:

Input: num = 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2. */
import java.util.*;
public class number_complement {
    public static int findComplement(int num) {
        if (num == 0) return 1;

        int bitLength = Integer.toBinaryString(num).length();
        
        int mask = (1 << bitLength) - 1;
        
        return num ^ mask;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int c=findComplement(n);
        int bitLength = Integer.toBinaryString(n).length();
        String bit = Integer.toBinaryString(n);
        int mask = (1 << bitLength) - 1;
        System.out.println("Binary equivalent of given number:"+bit);
        System.out.println("bitlength:"+bitLength);
        System.out.println("mask:"+mask);
        System.out.println("The complement number is:"+c);
        sc.close();

    }
}