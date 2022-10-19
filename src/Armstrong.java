import java.util.Scanner;

public class Armstrong
{
    public static void main(String[] args)
    {
        int number, temp, remainder, result;
        result = 0;

        // user input in main method
        System.out.println("Enter the number : ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        temp = number;

        // using while loop for the method
        while (temp != 0)
        {
            remainder = temp % 10;
            result += Math.pow(remainder, 3);
            temp /= 10;
        }

        // printing message
        if(result == number)
            System.out.println(number + " is an Armstrong number");
        else
            System.out.println(number + " is not an Armstrong number");
    }
}

