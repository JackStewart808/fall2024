package DaisyChain;

public class testJackDaisyChainConnector
{
    public static void main(String[] args)
    {
        JackDaisyChainConnector test1 = new JackDaisyChainConnector();
        test1.addEnd(5);
        test1.addEnd(10);
        test1.addStart(50);
        System.out.println(test1.getHead().getData());
        System.out.println(test1.getHead().getNext().getData());
        System.out.println(test1.getHead().getNext().getNext().getData());
    }
}