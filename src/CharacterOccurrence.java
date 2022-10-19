import java.util.Scanner;

public class CharacterOccurrence
{
    public static void main(String[] args)
    {   // user input in main method

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Name : ");
        String string= scanner.nextLine();
        int  length=string.length();
        int count = 0;

        // use of for loop
        for(int i = 0; i < length; i++)
        {
            if(string.charAt(i) == 'a')
                count++;
        }

        // printing the msg
        System.out.println("Total number of 'a' characters in a string: " + count);
    }
}
