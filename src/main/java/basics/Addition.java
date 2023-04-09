package basics;
import java.util.Scanner;
public class Addition {

    public static void main(String[] args) {
       /*Scanner scanner = new Scanner(System.in);
       System.out.print("Input a string: ");
       char[] letters = scanner.nextLine().toCharArray();
       System.out.print("Reverse string: ");
       for (int i = letters.length - 1; i >= 0; i--) {
           System.out.print(letters[i]);
       }
       System.out.print("\n");*/
       
       
       
       
       //duplicate character
       
       String str = "beautiful beach";
       char[] carray = str.toCharArray();
       System.out.println("The string is:" + str);
       System.out.print("Duplicate Characters in above string are: ");
       for (int i = 0; i < str.length(); i++) {
          for (int j = i + 1; j < str.length(); j++) {
             if (carray[i] == carray[j]) {
                System.out.print(carray[j] + " ");
                break;
             }
          }
       }
   }
    
    
}