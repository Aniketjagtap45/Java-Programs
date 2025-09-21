import java.util.Arrays;

public class KLargestElements {
    public static void main(String[] args) {
        int[] arr = {12, 5, 787, 1, 23, 45};
        int k = 3;

        Arrays.sort(arr); // Sort array in ascending order

        System.out.println("The " + k + " largest elements are:");
        for (int i = arr.length - 1; i >= arr.length - k; i--) {
            System.out.println(arr[i]);
        }
    }
}
