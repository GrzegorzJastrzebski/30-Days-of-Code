import java.io.*;
import java.util.*;

interface AdvancedArithmetic
{
   int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic
{
    int n;
    int result = 0;
    int sum = 0;

    public int divisorSum(int n)
    {
        this.n = n;

        for (int i = 1; i <= n; i++)
        {
            result = n / i;

            if (n % i == 0)
            {
                sum += result;
            }
        }

        return sum;
    }
}

class day19
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}