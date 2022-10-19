import java.util.Scanner;

public class SumofDigits
{
    public static void main(String arg[])
    {
        int number, sum;

        // Scanning the user input
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        number=scanner.nextInt();

        // Iterate the for loop for the remainder of number and then sum of it
        for(sum=0; number!=0; number=number/10)
        {
            sum = sum + number % 10;
        }
        System.out.println("Sum of digits: "+sum);
    }
}

