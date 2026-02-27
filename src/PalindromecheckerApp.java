import java.util.*;

/**
 * =====================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =====================================================
 *
 * All palindrome validation techniques combined.
 * Now accepts input from user.
 *
 * @author Aanish Nithin A
 * @version 1.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("     PALINDROME CHECKER     ");
        System.out.println("====================================");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("-------------------------------------");

        System.out.println("UC2 - Half Loop            : " + checkHalfLoop(input));
        System.out.println("UC3 - Reverse String       : " + checkReverse(input));
        System.out.println("UC4 - Two Pointer          : " + checkTwoPointer(input));
        System.out.println("UC5 - Stack                : " + checkStack(input));
        System.out.println("UC6 - Queue + Stack        : " + checkQueueStack(input));
        System.out.println("UC7 - Deque Optimized      : " + checkDeque(input));
        System.out.println("UC8 - Linked List          : " + checkLinkedList(input));
        System.out.println("UC9 - Recursive            : " + checkRecursive(input, 0, input.length() - 1));

        scanner.close();
    }