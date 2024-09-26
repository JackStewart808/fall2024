package stats.permAndComb;

public class testPermAndComb
{
    public static void main(String[] args)
    {
        PermAndComb tester = new PermAndComb();

        System.out.println(tester.perm(5, 2));
        System.out.println(tester.comb(5, 2));

        
        System.out.println(tester.perm(10, 5));
        System.out.println(tester.comb(10, 5));
        

    }
}