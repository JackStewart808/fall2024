package stats.montyhall;

import java.util.ArrayList;
import java.util.Random;
public class montyhall
{
    public int desiredRunCount = 10000;


    public int playWithSwitching(int numberOfRuns) {
        int winCounter = 0;
        int carDoor;
        int pickedDoor;
        int revealedDoor;
        Random rand = new Random();
        ArrayList<String> doorList = new ArrayList<>();

        for(int i = 0; i < numberOfRuns; i++)
        {
            doorList.clear();

            //set random index in arraylist of len 3 to be Car, rest are Goat

            doorList.add("Goat");
            doorList.add("Goat");
            doorList.add("Goat");
            carDoor = rand.nextInt(3);
            doorList.set(carDoor, "Car");
            
            //Have Player Pick A Door
            pickedDoor = rand.nextInt(3);
            
            //Select a door to "reveal" which is neither carDoor or pickedDoor
            do
            {
                revealedDoor = rand.nextInt(3);
            }
            while(revealedDoor == carDoor || revealedDoor == pickedDoor);

            //If the current Picked door and the revealed door are goats, then the swapDoor is the car and the player will swap and win
            if(doorList.get(revealedDoor) == "Goat" && doorList.get(pickedDoor) == "Goat")
            {
                winCounter ++;
            }
        }
        return winCounter;
    }

    public int playWithoutSwitching(int numberOfRuns)
    {
        int winCounter = 0;
        int randint;
        int pickedDoor;
        Random rand = new Random();
        ArrayList<String> doorList = new ArrayList<>();
        for(int i = 0; i < numberOfRuns; i++)
        {
            doorList.clear();

            //set random index in arraylist of len 3 to be Car, rest are Goat
            doorList.add("Goat");
            doorList.add("Goat");
            doorList.add("Goat");
            randint = rand.nextInt(3);
            doorList.set(randint, "Car");
            
            //Have Player Pick A Door, if they picked the car they win
            pickedDoor = rand.nextInt(3);
            if(doorList.get(pickedDoor) == "Car")
            {
                winCounter ++;
            }
        }
        return winCounter;
    }
}