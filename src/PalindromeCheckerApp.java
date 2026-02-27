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
        scanner.close();

    }
    // UC2 - Half Loop
    public static boolean checkHalfLoop(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    // UC3 - Reverse String
    public static boolean checkReverse(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return input.contentEquals(reversed);
    }
}