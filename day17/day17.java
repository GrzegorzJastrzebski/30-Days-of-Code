import java.util.*;
import java.io.*;

class Calculator
{
    private int answer;

    Calculator()
    {
        this.answer = answer;
    }

    int power(int n, int p) throws negativeNumberException
    {
        answer = (int)Math.pow(n, p);

        if (n < 0 || p < 0)
        {
            throw new negativeNumberException();
        }

        return answer;
    }
}

class negativeNumberException extends Exception
{
    private String message;

    public String getMessage()
    {
        this.message = message;
        message = "n and p should be non-negative";

        return message;
    }
}

class day17
{
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();

        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();

            try
            {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }

            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}