import java.util.Scanner;

public class DivisibleBy
{
    public static void main(String[] args)
    {
        // user input in main method
        Scanner scanner=new Scanner(System.in);
        System.out.println("Divided by 3: ");
        for (int i=1; i<100; i++)
        {
            if (i%3==0)
                System.out.print(i +", ");
        }

        System.out.println("\n\nDivided by 5: ");
        for (int i=1; i<100; i++)
        {
            if (i%5==0) System.out.print(i +", ");
        }
    }

}
