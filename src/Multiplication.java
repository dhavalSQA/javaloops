import java.util.Scanner;

public class Multiplication
{
    public static void main(String[] args)
    {
        int i=1;
        // SCanning the user input
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number=scanner.nextInt();

        // Iterate the do_while loop
        do
        {
                    System.out.printf("%d * %d = %d \n", number, i, number * i);
                    i++;
        }while (i<=10);
    }
}

