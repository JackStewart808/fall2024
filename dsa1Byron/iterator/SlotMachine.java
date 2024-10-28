package iterator;

import java.util.Random;

public class SlotMachine extends Iterator
{
    public SlotMachine(int numberOfCoins)
    {
        super(numberOfCoins);
    }

    public int runSlotMachine()
    {
        int numberOfPulls = 0;

        while(this.hasNext())
        {
            numberOfPulls++;
            next();
            Random rand = new Random();
            int randomInteger = rand.nextInt(5);
            if(randomInteger == 0)
            {
                value += 2;
            }
        }

        return numberOfPulls;
    }
}