package stats.pokemonMonte;
import java.util.ArrayList;
import java.util.Random;
public class CardGame
{
    private ArrayList<Card> deck;
    private ArrayList<Card> hand;
    private ArrayList<Card> prizes;
    public CardGame()
    {
        deck = new ArrayList<>();
        hand = new ArrayList<>();
        prizes = new ArrayList<>();
    }

    public void fillDeck(int pokemonCount)
    {
        for(int i = 0; i < 60 - pokemonCount; i++)
        {
            deck.add(new Energy());
        }
        for(int i = 0; i < pokemonCount; i++)
        {
            deck.add(new Charmander());
        }
    }

    public void fillDeck(int pokemonCount, int candyCount)
    {
        
        for(int i = 0; i < pokemonCount; i++)
        {
            deck.add(new Charmander());
        }
        for(int i = 0; i < candyCount; i++)
        {
            deck.add(new Candy());
        }
        while(deck.size() < 60)
        {
            deck.add(new Energy());
        }
    }

    public void drawHand()
    {
        Random rng = new Random();
        for(int i = 0; i < 7; i++)
        {
            int CardToTakeIndex = rng.nextInt(deck.size());
            hand.add(deck.get(CardToTakeIndex));
            deck.remove(CardToTakeIndex);
        }
    }

    public boolean checkHand()
    {
        for(Card singleCard : hand)
        {
            if(singleCard instanceof Pokemon)
            {
                return true;
            }
        }
        return false;
    }

    public void resetCards()
    {
        deck = new ArrayList<Card>();
        hand = new ArrayList<Card>();
        prizes = new ArrayList<Card>();
    }

    public void drawPrizes()
    {
        Random rng = new Random();
        for(int i = 0; i < 6; i++)
        {
            int CardToTakeIndex = rng.nextInt(deck.size());
            prizes.add(deck.get(CardToTakeIndex));
            deck.remove(CardToTakeIndex);
        }
    }

    public boolean checkPrizes()
    {
        for(Card singleCard : hand)
        {
            if(singleCard instanceof Candy)
            {
                return true;
            }
        }

        for(Card singleCard : deck)
        {
            if(singleCard instanceof Candy)
            {
                return true;
            }
        }

        return false;
    }

    public double testOddsOfDrawingAPokemon(int runCount, int pokemonCount)
    {
        int validDeckCounter = 0;
        for(int i = 0; i < runCount; i++)
        {
            fillDeck(pokemonCount);
        
            drawHand();

            if(checkHand())
            {
                validDeckCounter++;
            }

            resetCards();
        }
        
        return validDeckCounter / (double) runCount;
    }

    public double testOddsOfAllCandieInPrizes(int runcount, int pokemonCount, int candyCount)
    {
        int brickedDeckCounter = 0;
        for(int i = 0; i < runcount; i++)
        {
            fillDeck(pokemonCount, candyCount);

            drawHand();
            while(checkHand())
            {
                resetCards();
                fillDeck(pokemonCount, candyCount);
                drawHand();
            }

            drawPrizes();

            if(!checkPrizes())
            {
                brickedDeckCounter++;
            }

            resetCards();

    
        }

        return brickedDeckCounter / (double) runcount;

    }

}