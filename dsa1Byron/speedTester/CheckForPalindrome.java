package speedTester;

public class CheckForPalindrome
{
    public static void main(String[] args)
    {
        String testString = "racecartn";

        Stack forwardStack = new Stack();
        for(int i = 0; i < testString.length(); i++)
        {
            forwardStack.push(String.valueOf(testString.charAt(i)));
        }

        Stack tempStack = forwardStack;
        Stack backwardsStack = new Stack();
        while(tempStack.peek() != null)
        {
            backwardsStack.push(tempStack.pull());
        }

        boolean isPalindrome = true;
        while(forwardStack.peek() != null)
        {
            if(forwardStack.pull() != backwardsStack.pull())
            {
                System.out.println(testString = " Is Not A Palindrome");
                isPalindrome = false;
            }
        }
        if(isPalindrome)
        {
            System.out.println(testString + " Is a Palindrome");
        }
    }
}