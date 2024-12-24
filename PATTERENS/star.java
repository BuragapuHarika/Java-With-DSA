public class star {
    public static void main(String args[]) {
        for (int i = 1; i <= 4; i++) {  // Outer loop for the rows
            for (int j = 1; j <= i; j++) {  // Inner loop for printing stars
                System.out.print("*");
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
