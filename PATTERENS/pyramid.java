public class pyramid {
    public static void main(String args[]) {
        int n = 4;

        // Outer loop for the number of rows
        for (int line = 1; line <= n; line++) {

            // Inner loop to print numbers in each row
            for (int number = 1; number <= line; number++) {
                System.out.print(number);  // Print the number without newline
            }

            // Move to the next line after printing the numbers in each row
            System.out.println();
        }
    }
}
