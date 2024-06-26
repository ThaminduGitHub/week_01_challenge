import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Palindrome_Check {
    public static void main(String[] args) {

        System.out.println("Enter your word : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] chars = input.toCharArray();
        int[] x = keyCode(input);
        int[] chars1 = palindrome(chars);
        int number = 0;


        for(int i = 0; i < chars.length; i++){
            if(x[i] == chars1[i]){
                number++;
            }
        }
        if (number == chars.length) {
            System.out.println(input + " is a palindrome value");
        } else {
            System.out.println(input + " is not a palindrome value");
        }

    }

    public static int[] keyCode(String input) {
        int[] code = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
            code[i] = keyCode;

        }
        return code;
    }


    public static int[] palindrome(char[] chars) {
        char[] temp = new char[chars.length];
        int[] code1 = new int[chars.length];
        int b = 0;

        for (int i = temp.length - 1; i >= 0; i--) {
            temp[b] = chars[i];
            b++;

        }
        for (int i = 0; i < chars.length; i++) {
            int code  = KeyEvent.getExtendedKeyCodeForChar(temp[i]);
            code1[i] = code;

        }
        return code1;

    }
}
