import java.util.Scanner;
import java.util.Properties;
import java.lang.*;

public class Methods 
{
    public static void getRequirements() 
    {
        System.out.println(); // print blank line
        System.out.println("Developer: Hanna Rojo" );
        System.out.println("Program uses methods to:\nadd, subtract, multiply, divide and power floating point numbers, rounded to two decimal places.");
        System.out.println("Note: Program checks for non-numeric values, and division by zero.");
        System.out.println(); // print blank line
    }

public static void calculateNumbers() {
    double num1 = 0.0, num2 = 0.0;
    char operation = ' '; //unlike empty string, must include character here, space character!
    //String operation = "";
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter mathematical operation (a=addition, s=subtraction, m=multiplication, d=division, e=exponentiation): ");
    
    operation = sc.next().toLowerCase().charAt(0);

while (operation !='a' && operation !='s' && operation !='m' && operation !='d' && operation !='e')
{
    System.out.print("\nIncorrect operation. Please enter correct operation: ");
    operation = sc.next().toLowerCase().charAt(0); //captures first character from token
}

System.out.print("Please enter first number: ");
while (!sc.hasNextDouble())
{
    System.out.println("Not a valid number!\n");
    sc.next(); //Important! If omitted, will go into infinite loop on invalid input
    System.out.print("Please try again. Enter first number: ");
}
num1 = sc.nextDouble();

System.out.print("Please enter second number: ");
while (!sc.hasNextDouble())
{
    System.out.println("Not a valid number!\n");
    sc.next(); //Important! If omitted, will go into infinite loop on invalid input
    System.out.print("Please try again. Enter second number: ");
}
num2 = sc.nextDouble();

//test operation
if(operation =='a')
{
    Addition(num1, num2);
}

else if(operation =='s')
{
    Subtraction(num1,num2);
}

else if(operation =='m')
{
    Multiplication(num1,num2);
}

else if(operation =='d')
{
    if (num2 == 0)
    {
        System.out.println("Cannot divide by zero!");
    }
    else
    {
        Division(num1,num2);
    }
}

else if(operation =='e')
{
    Exponentiation(num1,num2);
}

System.out.println(); //print blank line

sc.close(); //close scanner

}

public static void Addition(double n1, double n2)
{
    System.out.print(n1 + " + " + n2 + " = ");
    System.out.printf("%.2f", (n1 + n2));
}

public static void Subtraction(double n1, double n2)
{
    System.out.print(n1 + " - " + n2 + " = ");
    System.out.printf("%.2f", (n1 - n2));
}

public static void Multiplication(double n1, double n2)
{
    System.out.print(n1 + " * " + n2 + " = ");
    System.out.printf("%.2f", (n1 * n2));
}

public static void Division(double n1, double n2)
{
    System.out.print(n1 + " / " + n2 + " = ");
    System.out.printf("%.2f", (n1 / n2));
}

public static void Exponentiation(double n1, double n2)
{
    System.out.print(n1 + " to the power of " + n2 + " = ");
    System.out.printf("%.2f", (Math.pow(n1,n2)));
}

}