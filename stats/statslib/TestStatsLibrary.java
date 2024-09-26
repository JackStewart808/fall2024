package stats.statslib;
import java.util.ArrayList;

public class TestStatsLibrary
{
    public static void main(String[] args) {
        StatsLibrary tester = new StatsLibrary();
        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        listOfNumbers.add(1);
        listOfNumbers.add(3);
        listOfNumbers.add(45);
        listOfNumbers.add(3);
        listOfNumbers.add(4);

        

        System.out.println(tester.computeMode(listOfNumbers));

    }
}