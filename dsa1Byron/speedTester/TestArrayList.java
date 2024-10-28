package speedTester;

public class TestArrayList
{
    public static void main(String[] args)
    {
        ArrayList testList = new ArrayList();
        testList.add(0);
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.remove(2);
        System.out.println(testList.getOutput());
    }
}