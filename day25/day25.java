import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class day25
{
    public static boolean isPrime(int number)
    {
        if (number == 1)
        {
            return false;
        }

        if (number == 2)
        {
            return true;
        }

        if (number % 2 == 0)
        {
            return false;
        }

        for (int i = 3; i * i <= number; i+=2)
        {
            if (number % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] a = new int[T];

        for (int i = 0; i < T; i++)
        {
            a[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i < T; i++)
        {
            if(isPrime(a[i]))
            {
                System.out.println("Prime");
            }

            else
            {
                System.out.println("Not prime");
            }
        }
    }
}