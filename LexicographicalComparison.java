public class LexicographicalComparison {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";

        int result = str1.compareTo(str2);

        if (result == 0) {
            System.out.println("The strings are lexicographically equal.");
        } else if (result < 0) {
            System.out.println("\"" + str1 + "\" is lexicographically less than \"" + str2 + "\".");
        } else {
            System.out.println("\"" + str1 + "\" is lexicographically greater than \"" + str2 + "\".");
        }
    }
}
