/*
 * FirstQueue
 * Version 1.0 , 24 July 2017 , me@martineng.info
 * This program is coded to demonstrate the implementation of Queue in Jave.
 */
package firstqueue;

import java.util.Random;

public class FirstQueue 
{
    public static void main(String[] args) throws InterruptedException 
    {
       Queue theQueue = new Queue(5);
       Random rand = new Random();
       int randInt;
       
       // Insert 4 entity
       for (int count = 0; count < 4; count++)
       {
           randInt = rand.nextInt(100);
           System.out.println("Insert " + randInt);
           theQueue.insert(randInt);
       } // END FOR
       
       System.out.print("\n");
       
       for (int count = 0; count < 3; count++)
       {
           System.out.println(theQueue.peekFront() + " will be deleted!");
           theQueue.remove();
       } // END FOR
       
       System.out.print("\n");
       
       for (int count = 0; count < 3; count++)
       {
           randInt = rand.nextInt(100);
           System.out.println("Insert " + randInt);
           theQueue.insert(randInt);
       } // END FOR
       
       System.out.println("\nPrinting the Queue: ");
       
       
       while (!theQueue.isEmpty())
       {
           long count = theQueue.remove();
           System.out.println(count);
       } // END while()
       
       System.out.println("");
    } // END main()
} // END class
