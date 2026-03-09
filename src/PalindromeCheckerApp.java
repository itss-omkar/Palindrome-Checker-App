import java.util.Scanner;
import java.util.Stack;

/* MAIN CLASS */
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Choose strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        if(result)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}

/* INTERFACE */
interface PalindromeStrategy {
    boolean check(String input);
}

/* STACK STRATEGY CLASS */
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        // push characters into stack
        for(char c : input.toCharArray()) {
            stack.push(c);
        }

        // compare characters
        for(char c : input.toCharArray()) {
            if(c != stack.pop())
                return false;
        }

        return true;
    }
}