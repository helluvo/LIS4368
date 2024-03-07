import java.util.Scanner;

public class Methods 
{
    public static void getRequirements() 
    {
        System.out.println(); // print blank line
        System.out.println("Developer: Hanna Rojo" );
        System.out.println("Program requirements:");
        System.out.println("\t1. Write an application that displays integer equivalents of uppercase letters.");
        System.out.println("\t2. Display character equivalents of ASCII values 48-122.");
        System.out.println("\t3. Display the character equivalent of ASCII value user input.");

        System.out.println("\tNote: Compare answers to http://www.asciitable.com/");
        System.out.println(); // print blank line
    }

public static void getAscii() 
    {
    int num = 0;
    boolean isValidNum = false;
    Scanner sc = new Scanner (System.in);

    System.out.println("Printing characters A-Z as ASCII values:");
    for(char character = 'A'; character <= 'Z'; character++)
        {
            System.out.printf("Character %c has ascii value %d\n", character, ((int)character));
        }

    //Or typecasting:
    System.out.println("\nPrinting ASCII values 48-122 as characters:");
    for(num = 48; num <= 122; num++)
        {
            System.out.printf("Character %d has ascii value %c\n", num, ((char)num));
        }

    //allow user input
    System.out.println("\nAllowing user ASCII value input:");
    while(isValidNum == false)
        {
            //check num double
            System.out.print("Please enter ASCII value (32-127): ");
            if(sc.hasNextInt())
                {
                    num = sc.nextInt();
                    isValidNum = true;
                }
            else
                {
                    System.out.println("Invalid integer--ASCII value must be a numer.\n");
                }
            sc.nextLine(); //discard any other data entered on line

            // num data true, check num range
            if(isValidNum == true && num <32 || num > 127)
                {
                    System.out.println("ASCII value must be >= 32 and <= 127.\n");
                    isValidNum = false;
                }
            if (isValidNum == true)
                {
                    System.out.println();
                    //display result
                    System.out.printf("ASCII value %d has character value %c\n", num, ((char)num));
                }
        }
        sc.close();
    }
}