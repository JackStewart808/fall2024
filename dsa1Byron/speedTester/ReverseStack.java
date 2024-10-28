package speedTester;

public class ReverseStack
{
    public static void main(String[] args)
    {
        String inputString = "ABCDEFGH";
        Stack testStack = new Stack();
        
        for(int i = 0; i < inputString.length(); i++)
        {
            testStack.push((String.valueOf(inputString.charAt(i))));
            
        }
        

        while(testStack.peek() != null)
        {
            System.out.print(testStack.pull());
        }
        System.out.println();
        
        /*
        Stack newStack = new Stack();
        while(testStack.getSize() != 0)
        {
            newStack.push(testStack.pull());
        }

        while(newStack.peek() != null)
        {
            System.out.println(newStack.pull());
        } */
        
    }
}