import java.util.Scanner;

public class FibonacciNumber
{
    public static void main(String[] args)
    {
        int fibo, n1 = 0, n2 = 1;

        // Scanning the user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Fibonacci number : ");
        int number = scanner.nextInt();

        System.out.print(n1 + "\t");
        System.out.print(n2 + "\t");

        // iterate the loop for fibonacci series
        for (int i = 2; i < number; i++)
        {
            fibo = n1 + n2;
            System.out.print(fibo + "\t");
            n1 = n2;
            n2 = fibo;
        }
    }
    }