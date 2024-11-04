package jackLine;

public class TestJackLine
{
    public static void main(String[] args)
    {
        JackLine tester = new JackLine();
        tester.add("Jack");
        tester.add("Byron");
        tester.add("Jackson");

        System.out.println(tester);
        System.out.println();

        System.out.println(tester.poll());
        tester.remove();
        System.out.println(tester.poll());
        tester.offer("James");
        tester.remove();
        System.out.println(tester.poll());
        tester.remove();
        System.out.println(tester.poll());
    }
    
}