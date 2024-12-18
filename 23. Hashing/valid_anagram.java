/* Given two strings s and t, return true if t is an anagram of s and false otherwise.
An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
s="race" t="care" true
s="heart" t="earth" true
s="tulip" t="lipid" false
 */
// time complexity O(n) due to the loops 
import java.util.*;
public class valid_anagram {
  public static boolean anagram(String s, String t) {
    HashMap<Character,Integer> hm=new HashMap<>();
     for (int i=0;i<s.length();i++) {
      char c=s.charAt(i);
      hm.put(c,hm.getOrDefault(c,0)+1);
     }
     for (int i=0;i<t.length();i++) {
      char c=t.charAt(i);
      if (hm.containsKey(c)) {
         if (hm.get(c)==1) {
          hm.remove(c);
         }
         else {
          hm.put(c,hm.get(c)-1);
         }
      }
      else {
        return false;
      }
     }
     return hm.isEmpty();
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
     System.out.print("Enter first string:");
     String s=sc.next();
     System.out.print("Enter second string:");
     String t=sc.next();
     boolean b=anagram(s,t);
     System.out.println("The two words are anagram:"+b);
     sc.close();
  }
}
