import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args)
    {
        // Scanning the user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number range");
        int number = scanner.nextInt();
        int newNum = 0, reminder, temp;
        temp = number;

        // Iterate the while loop
        while (temp != 0)
        {
            reminder = temp % 10;
            newNum = newNum * 10 + reminder;
            temp = temp / 10;
        }

        System.out.println("Numer after reverse process: " + newNum);
    }
}



