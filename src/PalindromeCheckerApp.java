public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Original string
        String original = "level";

        // Create Stack and Queue
        java.util.Stack<Character> stack = new java.util.Stack<>();
        java.util.Queue<Character> queue = new java.util.LinkedList<>();

        // Push to stack and enqueue to queue
        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            stack.push(ch);      // LIFO
            queue.add(ch);       // FIFO
        }

        // Compare pop (stack) and dequeue (queue)
        boolean isPalindrome = true;

        while (!stack.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }
    }
}
