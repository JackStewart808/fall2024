package stats.Birthday;

import java.util.Random;

import java.util.ArrayList;

public class Birthday
{
    private ArrayList<Person> classMates = new ArrayList<>();
    public double getProbabilityOfSharedBirthday(int numberOfRuns, int classSize)
    {

        Random rand = new Random();
        int DoubledBirthdays = 0;
        
        for(int k = 0; k < numberOfRuns; k++)
        {
            classMates.clear();
            for(int i = 0; i < classSize; i++)
            {
                classMates.add(new Person(rand.nextInt(365)));
            }

            for(int i = 1; i < classSize; i++)
            {
                for(int j = 0; j < i; j++)
                {
                    if(classMates.get(i).birthday == classMates.get(j).birthday)
                    {
                        DoubledBirthdays++;
                    }
                }
            }
        }
        

        return (float) DoubledBirthdays / numberOfRuns;
    }
}