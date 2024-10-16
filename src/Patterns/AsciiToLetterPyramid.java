package Patterns;

import java.util.*;
public class AsciiToLetterPyramid
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int inpu = scanner.nextInt();

        for(int i = inpu; i <= inpu+5; i++)
        {
            for(int j = inpu; j <= i; j++)
            {
//              System.out.print(i);
                System.out.print((char)i);
            }
            System.out.println();
        }
    }
}