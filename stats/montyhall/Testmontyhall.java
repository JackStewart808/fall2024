package stats.montyhall;

public class Testmontyhall
{
    public static void main(String[] args) {
        montyhall tester = new montyhall();
        int switchWins = tester.playWithSwitching(tester.desiredRunCount);
        int nonSwitchWins = tester.playWithoutSwitching(tester.desiredRunCount);
        System.out.println("\nThere Were " + switchWins + " Wins While Switching at a " + switchWins / (float) tester.desiredRunCount + " Success Rate And " + nonSwitchWins + " Wins Without Switching at a " + nonSwitchWins / (float) tester.desiredRunCount + " Success Rate.\n");
    }
}