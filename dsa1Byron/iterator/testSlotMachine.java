package iterator;

public class testSlotMachine
{
    public static void main(String[] args)
    {
        SlotMachine testSlotMachine;

        int sum = 0;
        int max = 0;
        int numberOfRuns;
        for(int i = 0; i < 100000; i++)
        {
            testSlotMachine = new SlotMachine(20);
            numberOfRuns = testSlotMachine.runSlotMachine();
            sum += numberOfRuns;
            if(numberOfRuns > max)
            {
                max = numberOfRuns;
            }
            
        }
        System.out.println("Running the slot machine averaged " + sum / 100000.0 + " runs with 20 starting coins.");
        System.out.println("With a maximum run of " + max + " runs from a 20 coin start.");
        
    }
}