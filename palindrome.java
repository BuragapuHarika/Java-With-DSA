public class palindrome
{
    public static void main(String args[])
    {
        String str  = "abba";
        int left = 0;
        int right = str.length()-1;

        boolean isPalindrome =  true;

        while(left < right)
        {
            if(str.charAt(left) == str.charAt(right))
            {
                System.out.println("it is the palindrome");
                left++;
                right--;
            }
             else{
                System.out.println("It  is not an palindrome");
             }

        }
    }
}