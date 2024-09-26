package stats.statslib;

import java.util.ArrayList;
import java.util.Collections;
public class StatsLibrary
{
    public double computeMean(ArrayList<Integer> listOfNumbers) {
        int sum = 0;

        for(int singleNumber : listOfNumbers) {
            sum += singleNumber;

        }
        return sum / (double) listOfNumbers.size();
    }

    public double computeMedian(ArrayList<Integer> listOfNumbers) {
        int size = listOfNumbers.size();
        Collections.sort(listOfNumbers);
        if(size % 2 == 1){
            return (double) listOfNumbers.get(size / 2);
        }
        else {
            return ((double) listOfNumbers.get(size / 2) + (double) listOfNumbers.get((size / 2) - 1)) / 2;
        }
    }
    public double computeMode(ArrayList<Integer> listOfNumbers) {
        Collections.sort(listOfNumbers);
        int currentChainLength = 0;
        int currentChainValue = 0;
        int longestChain = 0;
        int currentMostSeenNumber = -1;
        for(int i = 0; i < listOfNumbers.size(); i++)
        {
            if(listOfNumbers.get(i) == currentChainValue)
            {
                currentChainValue ++;
            }
            else 
            {
                if(currentChainLength > longestChain)
                {
                    currentMostSeenNumber = currentChainValue;
                    longestChain = currentChainLength;
                    currentChainValue = listOfNumbers.get(i);
                    currentChainLength = 1;
                }
                else
                {
                    currentChainValue = listOfNumbers.get(i);
                    currentChainLength = 1;
                }
            }
        }
        return (double) currentMostSeenNumber;
    }
}