public class ExceptionDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            // Trying to access an invalid index
            System.out.println("Accessing element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the exception
            System.out.println("Exception caught: " + e);
        }

        System.out.println("Program continues after exception handling.");
    }
}
