package DaisyChain;

public class JackDaisyChainConnector
{
    private Box head;
    private int size;

    public JackDaisyChainConnector()
    {
        size = 0;
        head = null;
    }

    public void addEnd(int inputValue)
    {
        if(head == null)
        {
            head = new Box(inputValue);
            return;
        }

        Box tempBox = head;
        while(tempBox.getNext() != null)
        {
            tempBox = tempBox.getNext();
        }

        tempBox.setNext(new Box(inputValue));
        
    }

    public void addStart(int inputValue)
    {
        Box newHead = new Box(inputValue);
        newHead.setNext(head);
        head = newHead;
    }

    public void add(int inputValue, int index)
    {
        if(index == 0)
        {
            addStart(inputValue);
        }

        Box previousBox = head;
        Box nextBox;
        for(int i = 0; i < index - 1; i++)
        {
            previousBox = previousBox.getNext();
        }
        nextBox = previousBox.getNext();
        Box newBox = new Box(inputValue);
        previousBox.setNext(newBox);
        newBox.setNext(nextBox);
    }

    public Box getHead()
    {
        return head;
    }

    public void setHead(Box inputHead)
    {
        head = inputHead;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int sizeInput)
    {
        size = sizeInput;
    }
}