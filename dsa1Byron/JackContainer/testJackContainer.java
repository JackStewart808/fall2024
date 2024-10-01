package JackContainer;

public class testJackContainer
{

    public static void main(String[] args)
    {
        JackContainer test1 = new JackContainer();

        for(int i = 0; i < 15; i++)
        {
            test1.add(i*2);
        }
        
        int[] testArray = {0, 3, 6, 9, 12, 15};
        test1.addAll(testArray, 2);

        System.out.println(test1.toString());

    }
}