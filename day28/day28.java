import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class day28
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<String> myRegExNames = new LinkedList<String>();

        for (int a0 = 0; a0 < N; a0++)
        {
            String firstName = in.next();
            String emailID = in.next();
            Pattern p = Pattern.compile("\\w@gmail.com");
            Matcher m = p.matcher(emailID);

            if (m.find())
            {
                myRegExNames.add(firstName);
            }
        }

        Collections.sort(myRegExNames);

        for (String name: myRegExNames)
        {
            System.out.println(name);
        }

        in.close();
    }
}