package eulerProj.problem46;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Problem46
{
    public static void main(String[] args) 
    {
        File myObj = new File("eulerProj/problem46/primes.txt");
        
        int currentPrime;
        boolean matchFound;
        for(int i = 9; i < 1000000; i+= 2)
        {
          try
          {
            Scanner myReader = new Scanner(myObj);
            matchFound = false;
          //Find the smallest prime greater than i
          currentPrime = 2;
          while(currentPrime < i)
          {
            currentPrime = Integer.valueOf(myReader.nextLine());
            for(int j = 1; 2 * Math.pow(j,2) + currentPrime <= i; j++)
            {
              if(i == 2 * Math.pow(j, 2) + currentPrime)
              {
                matchFound = true;
                break;
              }
            }
            if(matchFound)
            {
              break;
            }
          }
          if(!matchFound)
          {
            System.out.println(i);
          }
          }
          catch(FileNotFoundException e)
          {

          }
          
        }
        }
  }