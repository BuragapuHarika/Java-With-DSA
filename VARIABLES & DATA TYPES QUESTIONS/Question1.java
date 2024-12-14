import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B, C, average;

        System.out.print("Enter the first number: ");
        A = sc.nextDouble();

        System.out.print("Enter the second number: ");
        B = sc.nextDouble();

        System.out.print("Enter the third number: ");
        C = sc.nextDouble();

        average = (A + B + C) / 3.0;
        System.out.println("The average of the three numbers is " + average);
    }
}