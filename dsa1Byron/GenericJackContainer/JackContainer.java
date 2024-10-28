package GenericJackContainer;

public class JackContainer <T>
{

    private T[] data;
    private int size;

    public JackContainer()
    {
        size = 0;
        data = (T[]) new Object[10];
    }

    public void add(int value)
    {
        size += 1;
        if(size > data.length)
        {
            //Make a new array of double the length, and copy over the values
            T[] tempArray = new T[data.length * 2];
            for(int i = 0; i < data.length; i++)
            {
                tempArray[i] = data[i];
            }
            data = tempArray;
        }
        data[size - 1] = value;
    }

    public void add(int value, int index)
    {
        size += 1;
        int[] tempArray;
        if(size > data.length)
        {
            tempArray = new int[data.length * 2];
        }
        else
        {
            tempArray = new int[data.length];
        }

        for(int i = 0; i < size; i++)
        {
            if(i < index)
            {
                tempArray[i] = data[i];
            }
            else if(i > index)
            {
                tempArray[i] = data[i - 1];
            }
            else if(i == index)
            {
                tempArray[i] = value;
            }
        }
        data = tempArray;
    }

    public void addFirst(int value)
    {
        add(value, 0);
    }

    public void addAll(int[] values, int index)
    {
        size += values.length;
        int[] tempArray;
        tempArray = new int[data.length];
        while(size > tempArray.length)
        {
            tempArray = new int[tempArray.length * 2];
        }

        for(int i = 0; i < size; i++)
        {
            if(i < index)
            {
                tempArray[i] = data[i];
            }
            else if(i >= index + values.length)
            {
                tempArray[i] = data[i - values.length];
            }
            else if(i >= index && i < index + values.length)
            {
                tempArray[i] = values[i - index];
            }
        }
        data = tempArray;
    }

    public void replace(int value, int index)
    {
        data[index] = value;
    }

    public void remove(int index)
    {
        int[] tempArray = new int[data.length];
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
        size -= 1;
        data = tempArray;
    }

    public void removeFirst()
    {
        remove(0);
    }

    public void removeLast()
    {
        remove(size - 1);
    }

    public void removeAll(int index)
    {
        data = new int[data.length];
        size = 0;
    }

    public boolean isEmpty()
    {
        if(size == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int get(int index)
    {
        return data[index];
    }


    public int getSize()
    {
        return size;
    }

    public String toString()
    {
        String output = "";

        for(int i = 0; i < size; i++)
        {
            output += data[i];
            if(i < size - 1)
            {
                output += ", ";

            }
        }
        return output;
    }

}