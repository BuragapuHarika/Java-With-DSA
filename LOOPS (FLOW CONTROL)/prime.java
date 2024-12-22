// import java.util.Scanner;
// public class prime 
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         if ( n==2)

//         {
//             System.out.println("it is the  prime number");

//         }

//         else
//         {
//             boolean isprime = true;// just for tracking purpose we take it as a boolean variable .

        
//         for(int i = 2 ; i <= n-1; i++)
//         {
//             if (n % i == 0)
//             {// n is the multiple of the i ( i not equal to the 1 or n )
//                 // here, n is take it as the example of the 12 means n = 12;

//                isprime = false; // it is the composite number
//             }
//         }

//         if (isprime == true)
//         {
//             System.out.println("n is the prime number");

//         }
//         else 
//         {
//             System.out.println("n is not  the prime number");
//         }

//         }
        

//     }
// }


import java.util.Scanner;
public class prime 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if ( n==2)

        {
            System.out.println("it is the  prime number");

        }

        else
        {
            boolean isprime = true;// just for tracking purpose we take it as a boolean variable .

        
        for(int i = 2 ; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {// n is the multiple of the i ( i not equal to the 1 or n )
                // here, n is take it as the example of the 12 means n = 12;

               isprime = false; // it is the composite number
            }
        }

        if (isprime == true)
        {
            System.out.println("n is the prime number");

        }
        else 
        {
            System.out.println("n is not  the prime number");
        }

        }
        

    }
}