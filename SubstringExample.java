import java.util.Scanner;

public class SubstringExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        if (start >= 0 && end <= input.length() && start < end) {
            String substring = input.substring(start, end);
            System.out.println("Substring from index " + start + " to " + end + ": " + substring);
        } else {
            System.out.println("Invalid indices.");
        }

        scanner.close();
    }
}
 
