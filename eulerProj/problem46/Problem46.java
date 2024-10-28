package eulerProj.problem46;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Problem46
{
    public static void main(String[] args) 
    {
        try {
          File myObj = new File("eulerProj/problem46/primes.txt");
          Scanner myReader = new Scanner(myObj);
          for(int i = 9; i < 1000000; i+= 2)
        {
            //TODO check each problem
        }


          myReader.close();
        } catch (FileNotFoundException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
    }
}