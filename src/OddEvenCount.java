import java.util.Scanner;

public class OddEvenCount
{
    public static void main(String[] args)
    {

        // Scanning the User input
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number=scanner.nextInt();
        int even_count = 0;
        int odd_count = 0;

        // Iterate the while loop for getting odd and even number
        while (number > 0)
        {
            int rem = number % 10;
            if (rem % 2 == 0)
                even_count++;
            else
                odd_count++;
            number = number / 10;
        }
        System.out.println ( "Even count : " + even_count);
        System.out.println ( "Odd count : " + odd_count);
    }
}
