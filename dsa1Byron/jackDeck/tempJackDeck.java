package jackDeck;

public class tempJackDeck
{
    public static void main(String[] args)
    {
        JackDeck testDeck = new JackDeck();

        for(int i = 0; i < 50; i++)
        {
            testDeck.push(Integer.toString(i));
        }

        System.out.println(testDeck.peek());
        System.out.println(testDeck.pull());
        System.out.println(testDeck.pull());

        System.out.println(testDeck.contains("46"));
        System.out.println(testDeck.pull());
        System.out.println(testDeck.pull());
    }
}
