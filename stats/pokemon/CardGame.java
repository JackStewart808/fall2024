package stats.pokemon;
import java.util.ArrayList;
import java.util.Random;
public class CardGame
{
    private ArrayList<Card> deck;
    private ArrayList<Card> hand;
    public CardGame()
    {
        deck = new ArrayList<>();
        hand = new ArrayList<>();
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
    }

    public double run(int runCount, int pokemonCount)
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

}