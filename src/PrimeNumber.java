import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {   // user input in main method
        int flag=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number=scanner.nextInt();

        // Iterate the for loop for checking the prime number
        for (int i=2;i<number;i++)
        {
            if (number%i!=0)
            {
                flag = 0;
            }
            else
            {
                flag=1;
                break;
            }
        }
        if (flag==0)
        {
            System.out.println(" Prime");
        }
        else
        {
            System.out.println("Not Prime");

        }


    }
}
