package eulerProj.problem4;


public class Problem4
{
    public static void main(String[] args)
    {
        int highestPalindrome = 0;
        int product;
        for(int i = 999; i > 0; i--)
        {
            for(int j = 999; j > 0; j--)
            {
                product = i * j;
                if(product > highestPalindrome && isPalindrome(product))
                {
                    highestPalindrome = product;
                    break;
                }
                if(j == 999)
                {
                    if (product < highestPalindrome)
                    {
                        break;
                    }
                }

            }
        }
        System.out.println(highestPalindrome);
    }

    public static boolean isPalindrome(int inputValue)
    {
        String inputString = "" + inputValue;
        for(int i = 0; i < inputString.length(); i++)
        {
            if(inputString.charAt(i) != inputString.charAt(inputString.length() - 1 - i))
            {
                return false;
            }
        }
        return true;

    }
    
}