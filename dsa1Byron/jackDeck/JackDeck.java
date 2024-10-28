package jackDeck;

public class JackDeck
{
    private String[] data;
    private int size;

    public JackDeck()
    {
        data = new String[10];
    }

    public void push(String inputString)
    {
        if(size == data.length)
        {
            String[] tempStringList = new String[data.length * 2];
            for(int i = 0; i < size; i++)
            {
                tempStringList[i] = data[i];
            }
            data = tempStringList;
        }

        data[size] = inputString;
        size++;
    }

    public String pull()
    {
        String desiredString = data[size - 1];
        size--;
        return desiredString;
    }

    public String peek()
    {
        return data[size - 1];
    }

    public int contains(String desiredString)
    {
        String[] storeData = data;
        int storeSize = size;
        int index = 0;
        while(size > 0)
        {
            index++;
            if(pull().equals(desiredString))
            {
                System.out.println("test");
                data = storeData;
                size = storeSize;
                return index;
            }
        }
        return -1;
    }

}