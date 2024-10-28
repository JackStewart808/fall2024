package eulerProj.problem46;
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;
import java.util.ArrayList;
import java.lang.Math;


public class GeneratePrimes
{
    public static void main(String[] args) 
    {
        try 
        {

            ArrayList<Integer> primes = new ArrayList<>();
            boolean isPrime = true;
            for(int i = 2; i < 1000000; i++)
            {
                isPrime = true;
                if(i % 2 == 1 || i == 2)
                {
                    for(int j = 3; j < Math.floor(Math.sqrt(i)) + 1; j++)
                    {
                        if(i % j == 0)
                        {
                            isPrime = false;
                            break;
                        }
                    }
                }
                else
                {
                    isPrime = false;
                }
                if (isPrime)
                {
                    primes.add(i);
                }
            }
            System.out.println(primes);

            FileWriter myWriter = new FileWriter("eulerProj/problem46/primes.txt");

            for(int i = 0; i < primes.size(); i++)
            {
                myWriter.write(primes.get(i) + "\n");
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");


          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}