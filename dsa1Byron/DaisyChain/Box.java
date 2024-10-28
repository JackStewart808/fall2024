package DaisyChain;

public class Box
    {
        private int data;
        private Box next;

        public Box(int inputData)
        {
            data = inputData;
            next = null;
        }

        public boolean nextExists()
        {
            if(next == null)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        
        public void setNext(Box inputNext)
        {
            next = inputNext;
        }

        public Box getNext()
        {
            return next;
        }

        public void setData(int inputData)
        {
            data = inputData;
        }

        public int getData()
        {
            return data;
        }

    }