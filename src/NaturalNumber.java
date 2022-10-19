import java.util.Scanner;

public class NaturalNumber
{
    public static void main(String[] args)
    {
        // Scanning the user inpiut
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter natural number :");
        int number = scanner.nextInt();

        int add=0;

        //Iterate the for loop for printing the natural number
        for (int i = 1; i <= number; i++)
        {
            add=add+i;
        }

        System.out.println("Sum of given natural number is :"+ add);
    }
}
