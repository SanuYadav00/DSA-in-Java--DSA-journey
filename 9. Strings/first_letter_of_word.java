/* Write a program to convert first letter of each word in a sentence to upper case */
import java.util.*;
public class first_letter_of_word {
    public static String change (String str) {
        StringBuilder sb= new StringBuilder("");
        int n=str.length();
           char ch= Character.toUpperCase(str.charAt(0));
           sb.append(ch);

        for (int i=1;i<n;i++) {

            if (str.charAt(i)==' ' && i<n-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
            sb.append(str.charAt(i));
            }
            
        }
        return sb.toString();
    }
    public static void main(String arg[]) {
        Scanner sc=new Scanner (System.in);
        String Sentence;
        System.out.print("Enter a sentence without uppercase letters:");
        Sentence=sc.nextLine();
        String str2=change(Sentence);
        System.out.print(str2);

        

        sc.close();

      
    }
}