import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day10
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int remainder = 0;
        int counter = 0;
        int max = 0;

        while (n > 0)
        {
            remainder = n % 2;
            n = n / 2;
            if (remainder == 1)
            {
                counter++;
                if (counter >= max)
                {
                    max = counter;
                }
            }

            else
            {
                counter = 0;
            }
        }
        System.out.println(max);
    }
}