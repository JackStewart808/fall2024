package factorial;

public class Factorial
{
    public int findFact(int userInputNumber)
    {
        if(userInputNumber == 1)
        {
            return 1;
        }
        return findFact(userInputNumber - 1) * userInputNumber;
    }
}