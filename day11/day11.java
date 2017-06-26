import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day11
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int sum = 0;
        int maxSum = -1000;

        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }

        for (int k = 0; k < 4; k++)
        {
            for (int l = 0; l < 4; l++)
            {
                sum = arr[k][l] + arr[k][l+1] + arr[k][l+2] +
                      arr[k+1][l+1] +
                      arr[k+2][l] + arr[k+2][l+1] + arr[k+2][l+2];

                if (sum > maxSum)
                {
                    maxSum = sum;
                }
                sum = 0;
            }
        }
        System.out.println(maxSum);
    }
}