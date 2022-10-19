import java.util.Scanner;

public class FactorialNumber
{
    public static void main(String[] args)
    {
        // Scanning the user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number :");
        int number = scanner.nextInt();
        int fact = number;

        // iterate the loop for printing the factorial
        for (int i = number-1; i >= 1; i--)
        {
             fact=fact*i;
        }
        System.out.println(fact);

    }
}
