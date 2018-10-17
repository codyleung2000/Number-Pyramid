/**
 ** Program Name: Pyramid
 ** Name: Cody Leung
 ** Course: CPSC 1150-003
 */

// The purpose of this program is to draw a pyramid when the user enters an integer from 1 to 9.

import java.util.Scanner;

public class Pyramid
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int integer;

        System.out.print("Enter the number of lines between 1 to 9: ");
        integer = input.nextInt();

        if ((integer < 1) || (integer > 9))
        {
            System.out.println("\nError: The number must be between 1-9.");
            System.exit(1);
        }
        for (int i = 1; i <= integer; i++)
        {
            // This centers all the rows.
            for (int y = 1; y <= (integer - i) * 2; y++)
            {
                System.out.print(" ");
            }

	    // This creates the left half of the pyramid.
            for (int x = i; x >= 1; x--)
            {
                System.out.print(" " + x);
            }

	    // This creates the right half of the pyramid.
            for (int x = 2; x <= i; x++)
            {
                System.out.print(" " + x);
            }
	    System.out.println();
        }
    }
}
