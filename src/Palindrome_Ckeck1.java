import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Palindrome_Ckeck1 {
    public static void main(String[] args) {

        System.out.println("Enter your word : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        char firstChar = input.charAt(0);
        int firstCharCode = KeyEvent.getExtendedKeyCodeForChar(firstChar);

        char lastChar = input.charAt(input.length() - 1);
        int lastCharCode = KeyEvent.getExtendedKeyCodeForChar(lastChar);

        if (firstCharCode == lastCharCode){
            System.out.println(input + " is a palindrome value");
        }else {
            System.out.println(input + " is not  a palindrome value");
        }

    }

}