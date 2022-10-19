import java.util.Scanner;

public class Palindrome
{
    public static void main(String args[])
    {
        // Scanning the user ionput
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0, reverse;
        int temp = number;

        // Iterate the while loop for getting each digit
        while(number>0)
        {
            reverse = number % 10;
            sum = (sum*10)+reverse;
            number = number/10;
        }
        if(temp==sum)
            System.out.println("It is a Palindrome number.");
        else
            System.out.println("Not a palindrome");
    }
}
