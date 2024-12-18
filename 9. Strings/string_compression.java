/* Write a program to perform string compression. For example if input
  is aabbcccdddeee then output shall be a2b2c3d3e3  */
  // time complexity of this program is linear O(n) despite having 
  // 2 loops because in while loop , i is getting incremented same as for loop
import java.util.*;
public class string_compression {
    public static String compression (String str) {
        StringBuilder sb= new StringBuilder("");
        int n=str.length();
        for (int i=0;i<n;i++) {
            Integer count=1;
            while (i<n-1 && str.charAt(i)!=' ' && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            
        }
        if (count!=1) {
           sb.append(str.charAt(i));
           sb.append(count);
        }
        else {
            sb.append(str.charAt(i));
        }
    }
        return sb.toString();
    }
    public static void main(String arg[]) {
        Scanner sc=new Scanner (System.in);
        String Sentence;
        System.out.print("Enter a string:");
        Sentence=sc.nextLine();
        String str2=compression(Sentence);
        System.out.print(str2);

        

        sc.close();

      
    }
}