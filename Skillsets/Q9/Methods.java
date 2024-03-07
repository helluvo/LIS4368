import java.util.Scanner;

public class Methods 
{
    public static void getRequirements() 
        {
            System.out.println(); // print blank line
            System.out.println("Developer: Hanna Rojo" );
            System.out.println("Program requirements:");
            System.out.println("1. Returns letter grade, based upon userentered numeric score.");
            System.out.println("2. Program checks for non-numeric and out of range values.");
            System.out.println("Note: Program is accurate to 6th fraction digit (i.e., 6 digits right of decimal point).");
            System.out.println(); // print blank line
        }

    public static void getScore() 
    {
        Scanner sc = new Scanner(System.in);
        double score = 0.0; //user-entered value

        //prompt user
        //hasNextDouble(): returns true if next token in scanner's input can be interpreted as doule value
        System.out.print("Please enter grade between 0 and 100, inclusive: ");
        while (!sc.hasNextDouble())
        {
            System.out.println("Not a valid number!\n");
            sc.next(); //Important: If omitted, will go into infinite loop on invalid input!
            System.out.print("Please try again. Enter grade between 0 and 100, inclusive: ");
        }
        score = sc.nextDouble();
        getGrade(score);

        sc.close();
    }

    public static void getGrade(double score) 
    {
        String grade ="";
        if(score <0 || score > 100)
        {
            System.out.println("\nOut of range!");
            //sc.next(); //Important: If omitted, will go into infinite loop on invalid input!
            getScore();
        }
        else 
        {
            //FSU grading scale:
            if(score <60 && score >= 0)
            grade = "F";

            else if(score <63 && score >= 60)
            grade = "D-";
            else if(score <67 && score >= 63)
            grade = "D";
            else if(score <70 && score >= 67)
            grade = "D+";

            else if(score <73 && score >= 70)
            grade = "C-";
            else if(score <77 && score >= 73)
            grade = "C";
            else if(score <80 && score >= 77)
            grade = "C+";

            else if(score <83 && score >= 80)
            grade = "B-";
            else if(score <87 && score >= 83)
            grade = "B";
            else if(score <90 && score >= 87)
            grade = "B+";

            else if(score <93 && score >= 90)
            grade = "A-";
            else
            grade = "A";

            //pfrintf():https://www.juery-az.com/10-examples-learn-java-string-formatting-pritf-method/
            System.out.printf("\nScore entered: %f%n", score);
            System.out.printf("Final grade: %s%n", grade);
        }
    }
}