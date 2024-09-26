package stats.permAndComb;


public class PermAndComb
{
    public int perm(int total, int selected)
    {

        Factorial factorial = new Factorial();

        int numerator = factorial.fac(total);
        int denominator = factorial.fac(total - selected);
        return numerator / denominator;

    }

    public int comb(int total, int selected)
    {
        Factorial factorial = new Factorial();

        int numerator = factorial.fac(total);
        int denominator = factorial.fac(total - selected) * factorial.fac(selected);
        return numerator / denominator;

    }
}