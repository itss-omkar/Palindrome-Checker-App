import java.util.Scanner;

public class PalindromeCheckerApp {

    public void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // create object
        PalindromeService service = new PalindromeService();

        // call method
        boolean result = service.checkPalindrome(input);

        if(result)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }class PalindromeService {

        public boolean checkPalindrome(String input) {

            int start = 0;
            int end = input.length() - 1;

            while(start < end) {
                if(input.charAt(start) != input.charAt(end))
                    return false;

                start++;
                end--;
            }

            return true;
        }
    }
}