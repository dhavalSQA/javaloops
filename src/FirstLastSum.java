import java.util.Scanner;

public class FirstLastSum
{
        public static void main(String args[])
        {
            // scanning the user input
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number : ");
            int number = scanner.nextInt();

            System.out.println("Given number is: "+ number);
            int firstDigit = 0;
            int lastDigit = 0;
            lastDigit = number % 10;
            System.out.println("Last Digit is: " + lastDigit);

            // Iterate the while loop for taking each digit
            while(number != 0)
            {
                firstDigit = number % 10;
                number = number / 10;
            }
            System.out.println("First Digit is: " + firstDigit);
            int sum=lastDigit+firstDigit;
            //printing the output of first and last digit of the number
            System.out.println("The sum of first and last digit is : "+sum);
        }
}
