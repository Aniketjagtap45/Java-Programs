public class SimpleValidation {

    public static void checkNumber(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number cannot be negative!");
        } else {
            System.out.println("Valid number: " + num);
        }
    }

    public static void main(String[] args) {
        try {
            checkNumber(-3); // Negative number triggers exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program finished.");
    }
}
