package logical_Program;

public class Palindrome_No {
	public static void main(String[] args) {
        // Hardcoded number for demonstration
        int number = 121298;

        int originalNum = number;
        int reversedNum = 0;

        // Reverse the number
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            reversedNum = reversedNum * 10 + digit;
            temp /= 10;
        }

        // Check if the reversed number is equal to the original number
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}
