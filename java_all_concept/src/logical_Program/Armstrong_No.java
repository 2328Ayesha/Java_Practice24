package logical_Program;

public class Armstrong_No {

	public static void main(String[] args) {
        int number = 121;  // Change this to the number you want to check

        int originalNumber = number;
        int numDigits = 0;
        int sum = 0;

        // Count the number of digits in the given number
        int temp = originalNumber;
        while (temp != 0) {
            temp /= 10;
            numDigits++;
        }

        // Calculate the sum of each digit raised to the power of the number of digits
        temp = originalNumber;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }

        // Check if the number is an Armstrong number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
