package firstqueue;

import java.util.Random;

public class ProgramLauncher
{
    Queue theQueue = new Queue(5);
    
    public void luncher()
    {
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
    }
    
    
    public void menu()
    {
        System.out.println("============================");
        System.out.println("Your Queue is currently ");
        System.out.println("Please select an action: ");
        System.out.println("============================");
        System.out.println("(1) - Generate random number into Queue");
        System.out.println("(2) - Check the front item");
        System.out.println("(3) - Remove the front item");
        System.out.println("(4) - Check if the queue is empty");
        System.out.println("(5) - Check if the queue is full");
        System.out.println("(6) - ");
        
    }
    
    // Execute option 1
    // Random generate a number into the Queue
    public void runGenerateNumber()
    {
        Random rand = new Random();
        int randInt = rand.nextInt(100);
        
        theQueue.insert(randInt);
    } // END runGenerateNumber()
    
    public void runCheckFront()
    {
        System.out.println("Currently in front " + theQueue.peekFront());
    }
}
