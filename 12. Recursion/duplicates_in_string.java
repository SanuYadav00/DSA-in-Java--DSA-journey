/* write a program using recursion to remove the duplicates in a string */
import java.util.*;
public class duplicates_in_string {
 public static void remove (String s,StringBuilder sb, boolean array[],int i) {
    if (i==s.length()) {
        System.out.print("The updated string without duplicates is:"+sb);
        return;
    }
    char currentchar=s.charAt(i);
    if (array[currentchar-'a']==false) {
        array[currentchar-'a']=true;
        remove(s,sb.append(currentchar),array,i+1);
    }
    else {
        remove(s,sb,array,i+1);
    }

    
    }

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder("");
        boolean array[]=new boolean [26];
        remove(s,sb,array,0);
        sc.close();

    }
}