package stats.pokemon;

public class testCardGame
{
    public static void main(String[] args)
    {
        CardGame testGame = new CardGame();
        for(int i = 0; i < 60; i++)
        {
            System.out.println(testGame.run(1_000_000, i));
        }
       
    }
}