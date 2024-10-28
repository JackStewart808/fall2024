package speedTester;

public class Node
{
    private int data;
    private Node next;

    public Node(int inputData)
    {
        data = inputData;
        next = null;
    }

    public int getData()
    {
        return data;
    }

    public void setData(int inputData)
    {
        data = inputData;
    }

    public Node getNext()
    {
        return next;
    }

    public void setNode(Node inputNode)
    {
        next = inputNode;
    }
}