//CONDITIONAL STATEMENTS QUESTIONS
//Question 1 : Write a Java program to get a number from the user and print whether it is
//positive or negative.



import java.util.Scanner;

public class Question1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any NUmber : ");
        int number = sc.nextInt();

        if (number % 2 == 0)
        {
            System.out.println("It is the positive Number");
        }

        else 
        {
            System.out.println("It is the Negative Number");
        }
    }
}