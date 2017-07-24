package firstqueue;

public class Queue 
{
    private int maxSize, front, back, nItem;
    private long[] queueArr;

    public Queue()
    {
        // Null Constructor
    }
    
    public Queue(int inMaxSize) // Constructor
    {
        maxSize = inMaxSize;
        queueArr = new long[maxSize];
        front = 0;
        back = -1;
        nItem = 0;
    }
    
    public void insert(long inBack) // Insert item at the back
    {
        if (back == maxSize -1)
        {
          back = -1;  
        } //END IF
        
        // Increment back and insert 1 item
        queueArr[++back] = inBack; 
        nItem++;
    } // END insert()
    
    public long remove() // Pop 1st item in queue
    {
        long temp = queueArr[front++]; // copy value and increment front
       
        // deal with wraparound
        if (front == maxSize)
        {
            front = 0;
        } // END IF
        
        nItem--; // remove 1 item
        return temp;
    } // END remove()
    
    public long peekFront() // Peek the front of queue (Retrive value)
    {
        return queueArr[front];
    } // END peekFront()
    
    public boolean isEmpty() // true if queueArr is Empty
    {
        return (nItem == 0);
    } // END isEmpty()
    
    public boolean isFull() // true if queue is Full
    {
        return (nItem==maxSize);
    } // end isFull()
    
    public long size()
    {
        return nItem;
    }

} // END class
