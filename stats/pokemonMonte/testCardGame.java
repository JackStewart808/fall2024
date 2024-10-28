package stats.pokemonMonte;

public class testCardGame
{
    public static void main(String[] args)
    {
        CardGame testGame = new CardGame();

        //System.out.println(testGame.testOddsOfDrawingAPokemon(100_000, 10));

        System.out.println(testGame.testOddsOfAllCandieInPrizes(100_000, 10, 1));
       
    }
}