package jackLine;

import java.util.LinkedList;

public class JackLine
{
    LinkedList<String> data;

    public JackLine()
    {
        data = new LinkedList<>();
    }

    public boolean isEmpty()
    {
        if(data.size() == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String toString()
    {
        String outString = "";
        for(int i = 0; i < data.size(); i++)
        {
            outString += data.get(i);
            if(i != data.size() - 1)
            {
                outString += ", ";
            }
        }
        return outString;
    }

    public boolean isFull()
    {
        if(data.size() >= 100)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void add(String newValue)
    {
        if(isFull())
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        data.add(newValue);

    }

    public String poll()
    {
        return data.get(0);
    }

    public void remove()
    {
        data.remove(0);
    }

    public void offer(String newValue)
    {
        data.add(newValue);
    }
}