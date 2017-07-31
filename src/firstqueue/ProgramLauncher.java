package firstqueue;

import java.util.Random;
import java.util.Scanner;

public class ProgramLauncher
{
    Queue theQueue = new Queue(5);
    Scanner inputReader = new Scanner(System.in);
    
    // This function will be called in main.java
    public void run()
    {
        int input = 0;
        
        try
        {
            do
            {
                menu();
                System.out.print(">> ");
                input = inputReader.nextInt();
                executeMenu(input);
                System.out.println("Press any key to return...");
                System.in.read();
            } while(input != 0);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    // This function print out the User Interface/Menu
    public void menu()
    {
        System.out.println("============================");
        System.out.println("Your Queue current size: " + theQueue.size());
        runCheckQueue();
        System.out.println("Please select an action: ");
        System.out.println("============================");
        System.out.println("(1) - Generate random number into Queue");
        System.out.println("(2) - Remove the front item");
        System.out.println("(3) - Enlarge your queue");
        System.out.println("(4) - Minimize your queue");
        System.out.println("(5) - Print Queue");
    } // END menu()
    
    // This function is the logical operation
    public void executeMenu(int inInput)
    {
        switch (inInput)
        {
            case 1:
                runGenerateNumber();
                break;
            case 2:
                runRemoveQueue();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                runPrintQueue();
                break;
            case 0:
                
                break;
        }
    }
    
    // Execute option 1
    // Random generate a number into the Queue
    public void runGenerateNumber()
    {
        if (!(theQueue.isFull()))
        {
            Random rand = new Random();
            int randInt = rand.nextInt(100);
        
            theQueue.insert(randInt);
            System.out.println("Added " + randInt);
        }
        else
        {
            System.out.println("Your Queue is Full.");
        } // END IF
        
    } // END runGenerateNumber()
    
    // Execute option 2
    public void runRemoveQueue()
    {
        if (!(theQueue.isEmpty()))
        {
            System.out.println("Deleting " + theQueue.peekFront());
            theQueue.remove();
        }
        else
        {
            System.out.print("Operation failed.\nYour Queue is empty.");
        } // END IF
    } // END runRemoveQueue()
    
    // This function will return statement according to 
    // the state of the Queue.
    public void runCheckQueue()
    {
        if (theQueue.isEmpty())
        {
            System.out.println("Your Queue is [EMPTY]");
        }
        else if (theQueue.isFull())
        {
            System.out.println("Your Queue is [FULL]");
        }
        else
        {
            System.out.println("Your front item is: " + theQueue.peekFront());
        } // END IF
    }
    
    // This function print all entity in Queue
    public void runPrintQueue()
    {
        if (theQueue.isEmpty())
        {
            System.out.println("Your queue is empty, there's nothing to print.");
        }
        else
        {
            long count = 0;
        
            Queue tempQueue = theQueue;

            System.out.println("Outputing the Queue: ");

            while (!(tempQueue.isEmpty()))
            {
                count = tempQueue.remove();
                System.out.println(count);
            } // END WHILE
        } // END IF
        
    } // END runPrintQueue()

}
