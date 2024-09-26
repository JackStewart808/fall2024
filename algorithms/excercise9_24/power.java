package algorithms.excercise9_24;

class power
{
    public double pow(int x, int n)
    {
        double product = 1;

        if(n == 0)
        {
            return 1;
        }

        for(int i = 0; i < java.lang.Math.abs(n); i++)
        {
            product *= x;
        }

        if(n > 0)
        {
            return product;
        }
        else
        {
            return 1/product;
        }
    }
}