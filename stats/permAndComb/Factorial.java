package stats.permAndComb;

public class Factorial
{

    public int fac(int num)
    {
        int product = 1;
        for(int i = 2; i <= num; i++)
        {
            product *= i;
        }

        return product;
    }
}