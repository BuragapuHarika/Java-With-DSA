public class character {
    public static void main(String args[])
    {
        int ch='A';
        int n=4;

        // outer loop
        for(int line=1; line<=n; line++)
        {
            //inner loop
            for(int chars=1; chars<=line; chars++)
            {
                System.out.print((char)ch);
                ch++;
            }
            System.out.println();
        }
    }
}
