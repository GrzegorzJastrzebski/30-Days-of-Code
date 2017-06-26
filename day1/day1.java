import java.util.Scanner;

public class day1
{
    public static void main(String[] args)
    {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int j;
        double e;
        String t;

        j = scan.nextInt();
        e = scan.nextDouble();
        t = scan.next() + scan.nextLine();

        System.out.println(i + j);
        System.out.println(d + e);
        System.out.println(s + t);

        scan.close();
    }
}