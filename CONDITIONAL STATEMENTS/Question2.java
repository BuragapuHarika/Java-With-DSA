// Question 2 : Finish the following code so that it prints You have a fever if your temperature
// is above 100 and otherwise prints You don't have a fever.
// public class Solution {
// public static void main(String[] args) {
// double temp = 103.5;
// }
// }


import java.util.Scanner;

public class Question2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);

        double temp = 103.5;

        System.out.println("Enter temperature : ");
        double Temp = sc.nextDouble();

        if ( Temp >= 100)
        {
            System.out.println("You have a fever");
        }

        else 
        {
            System.out.println("You do not have a fever");
        }





    }
}