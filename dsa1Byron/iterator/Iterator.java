package iterator;


public class Iterator
{
    int value;

    public Iterator(int inputValue)
    {
        value = inputValue;
    }

    public boolean hasNext()
    {
        if(value == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public void remove()
    {
        value--;
    }

    public int next()
    {
        remove();
        return 1;
    }

    
}