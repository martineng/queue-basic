/*
 * FirstQueue
 * Version 1.0 , 24 July 2017 , me@martineng.info
 * This program is coded to demonstrate the implementation of Queue in Jave.
 */
package firstqueue;

public class FirstQueue 
{
    public static void main(String[] args) throws InterruptedException 
    {
       Queue theQueue = new Queue(5);
       
       theQueue.insert(11);
       theQueue.insert(22);
       theQueue.insert(33);
       theQueue.insert(44);
       
       theQueue.remove();
       theQueue.remove();
       theQueue.remove();
       
       theQueue.insert(55);
       theQueue.insert(66);
       theQueue.insert(77);
       theQueue.insert(88);
       
       while (!theQueue.isEmpty())
       {
           long count = theQueue.remove();
           System.out.print(count);
           System.out.print(" ");
       } // END while()
       
       System.out.println("");
    } // END main()
} // END class
