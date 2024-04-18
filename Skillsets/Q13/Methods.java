import java.util.Scanner;
import java.io.*; //provides input/output streams used to read/write data to input/output sources

public class Methods 
{
    public static void getRequirements() 
    {
        System.out.println(); // print blank line
        System.out.println("Developer: Hanna Rojo" );
        System.out.println("Program Requirements:");
        System.out.println("Program captures user input, writes to and reads from same file, and counts number of words in file.");
        System.out.println("Hint: use hasNext() method to read number of words (tokens).");
        System.out.println(); // print blank line
    }

public static void getWriteRead() {
    String myFile = "filecountwords.txt";
    try {
        //create file object
        File file = new File(myFile); //takes file name as argument

        //create PrintWriter object
        PrintWriter writer = new PrintWriter(file); //takes file as argument

        //create Scanner object for user input\
        Scanner input = new Scanner(System.in);

        //create String object to store user input
        String str = "";

        System.out.print("Please enter line of text: ");
        str = input.nextLine();

        //write to file using PrintWriter write() method
        writer.write(str);

        System.out.println("Saved to file\"" + myFile +"\"");

        //close input Scanner object
        input.close();
        //close input file--otherwise, open PrintWriter stream
        writer.close();

        Scanner read = new Scanner(new FileInputStream(file));
        int count = 0;
        while(read.hasNext())
            {
                read.next();
                count++;
            }
        System.out.println("Number of words: " + count);

    //close read Scanner object
    read.close();
    }

    catch(IOException ex)
        {
            System.out.println("Error writing to or reading from file '" + myFile + "'");
        }

    }

}