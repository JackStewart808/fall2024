package algorithms.singlyLinkedLists;

public class SinglyLinkedList
{
    private Node head;
    private int size;
    private static class Node
    {
        // data: String, integer, float, another class
        int data;
        // next a reference to node
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
        }
        public int size()
        {
            return size;
        }

        public boolean isEmpty()
        {
            return size == 0;
        }

        public void add(int data)
        {
            Node newNode = new Node(data);
            //How to handle if newNode is the first node
            if(isEmpty())
            {
                head = newNode;
            }
            else
            {
                // head next until end.
                Node current = head;
                while(current.next != null)
                {
                    current = current.next;
                }
                current.next = newNode;
            }
            size++;
        }
        public void printList()
        {
            Node current = head;
            while(current != null)
            {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
        public int get(int idx)
        {
        // get the data(value) at idx (from 0)
        if(idx >= size())
        {
        System.out.println("out of range");
        return 0;
        }
        Node current = head;
        for(int i = 0; i < idx; i++)
        {
        current = current.next;
        }
        return current.data;
        }
        public void addFirst(int data)
        {
        // Add a node with value data to the first position of the linked list.
        Node ToAddFirst = new Node(data);
        // How to make it head?
        ToAddFirst.next = head; // Key point
        head = ToAddFirst;
        size++;
    }


    public static void main(String[] args)
    {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(16); // idx 0
        list.add(4); // idx 1
        list.add(1);
        list.addFirst(100);
        list.printList();
        //System.out.println(list.get(10)); // Expect 16
    }
}