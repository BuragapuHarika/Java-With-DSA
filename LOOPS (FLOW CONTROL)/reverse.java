public class reverse 
{
    public static void main(String args[])
    {
        int n = 10899;

        while(n > 0)
        {
            int lastDIgit = n % 10 ; // 
            System.out.print(lastDIgit + " ");
            n = n / 10; // n /= 10
          

        }
        System.out.println();
    }
        
}
