import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day6
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        String s;
        char[] myCharArray;

        for (int i = 0; i < T; i++)
        {
            s = in.next();
            myCharArray = s.toCharArray();

            for (int j = 0; j < s.length(); j++)
            {
                if (j%2==0)
                {
                    System.out.print(myCharArray[j]);
                }
            }
            System.out.print(" ");

            for (int j = 0; j < s.length(); j++)
            {
                if (j%2==1)
                {
                    System.out.print(myCharArray[j]);
                }
            }
            System.out.println("");
        }
    }
}