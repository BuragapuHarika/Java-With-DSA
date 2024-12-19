// Question 5 : Write a Java program that takes a year from the user and print whether that
// year is a leap year or not

import java.util.Scanner;

public class Question5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year :");
        int year = sc.nextInt();

        if (year % 4 == 0)
        {
            System.out.println("It is an Leap year");

        }
        else 
        {

            System.out.println("It is not an Leap Year");
        }


    }
}