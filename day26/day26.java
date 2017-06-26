import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class day26
{
    public static int getFine(int[] a, int[] b)
    {
        int fine = 0;
        int actual[] = a;
        int expected[] = b;
        int actualDay = actual[0];
        int actualMonth = actual[1];
        int actualYear = actual[2];
        int expectedDay = expected[0];
        int expectedMonth = expected[1];
        int expectedYear = expected[2];
        int delayDay = actualDay - expectedDay;
        int delayMonth = actualMonth - expectedMonth;
        int delayYear = actualYear - expectedYear;

        if (delayYear <= 0 && delayMonth <= 0 && delayDay <= 0)
        {
            fine = 0;
        }

        else if (delayYear == 0 && delayMonth == 0 && delayDay > 0)
        {
            fine = 15 * delayDay;
        }

        else if (delayYear == 0 && delayMonth > 0)
        {
            fine = 500 * delayMonth;
        }

        else if (delayYear > 0)
        {
            fine = 10000;
        }

        return fine;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];

        for (int i = 0; i < 3; i++)
        {
            a[i] = sc.nextInt();
        }

        for (int j = 0; j < 3; j++)
        {
            b[j] = sc.nextInt();
        }

        sc.close();

        System.out.println(getFine(a, b));
    }
}