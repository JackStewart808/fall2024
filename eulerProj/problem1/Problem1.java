package eulerProj.problem1;

public class Problem1
{
    public static void main(String[] args)
    {
        int sum = 0;
        for(int i = 3; i < 1000; i += 3)
        {
            sum += i;
        }

        for(int i = 5; i < 1000; i += 5)
        {
            sum += i;
        }

        for(int i = 15; i < 1000; i+= 15)
        {
            sum -= i;
        }
        System.out.println(sum);
    }

}