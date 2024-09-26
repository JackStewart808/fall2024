package stats.permAndComb;
import java.util.ArrayList;
public class testFactorial
{
    public static void main(String[] args)
    {
        Factorial tester = new Factorial();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i < 10; i++)
        {
            list.add(tester.fac(i));
        }
        
        System.out.println(list);
    }
}