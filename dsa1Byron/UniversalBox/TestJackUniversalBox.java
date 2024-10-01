public class TestJackUniversalBox
{
    public static void main(String[] args)
    {
        JackUniversalBox<Integer> test1 = new JackUniversalBox<Integer>(777); 
        JackUniversalBox<String> test2 = new JackUniversalBox<String>("Hello");
        System.out.println(test1.getT());
        System.out.println(test2.getT());
    }
}
