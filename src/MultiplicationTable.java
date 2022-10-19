import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        // Scanning the user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = scanner.nextInt();

        // Iterate the for loop for printing the table
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}