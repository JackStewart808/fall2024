package speedTester;

public class ArrayList
{
    private int[] data;
    private int size;

    public ArrayList()
    {
        data = new int[10];
        size = 0;
    }

    public void add(int inputValue)
    {
        if(data.length >= size)
        {
            int[] tempArray = new int[data.length * 2];
            for(int i = 0; i < size; i++)
            {
                tempArray[i] = data[i];
            }
            data = tempArray;
        }

        data[size] = inputValue;
        size++;
    }

    public int get(int index)
    {
        return data[index];
    }

    public void removeEnd()
    {
        data[size] = 0;
        size--;
    }

    public void remove(int index)
    {
        int[] tempArray = data;
        for(int i = 0; i < size; i++)
        {
            if(i < index)
            {
                tempArray[i] = data[i];
            }
            else if(i > index)
            {
                tempArray[i - 1] = data[i];
            }
        }
        data = tempArray;
        size--;
    }

    public String getOutput()
    {
        String output = "";

        for(int i = 0; i < size; i++)
        {
            if(i != 0)
            {
                output += ", ";
            }
            output += data[i];
        }


        return output;
    }
}