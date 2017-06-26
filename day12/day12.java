import java.util.*;

class Person
{
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    Person(String firstName, String lastName, int identification)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    public void printPerson()
    {
        System.out.println(
                "Name: " + lastName + ", " + firstName
            +   "\nID: " + idNumber);
    }
}

class Student extends Person
{
    private int[] testScores;

    Student(String firstName, String lastName, int identification, int scores[])
    {
        super(firstName, lastName, identification);
        this.testScores = scores;
    }

    public char calculate()
    {
        float average = 0;
        float sum = 0;
        char grade = 'a';

        for(int i: testScores)
        {
            sum += i;
        }

        average = sum / testScores.length;

        if (average <= 100 && average >= 90)
        {
            grade = 'O';
        }
        else if (average < 90 && average >= 80)
        {
            grade = 'E';
        }
        else if (average < 80 && average >= 70)
        {
            grade = 'A';
        }
        else if (average < 70 && average >= 55)
        {
            grade = 'P';
        }
        else if (average < 55 && average >= 40)
        {
            grade = 'D';
        }
        else if (average < 40)
        {
            grade = 'T';
        }

        return grade;
    }
}

class day12
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];

        for(int i = 0; i < numScores; i++)
        {
            testScores[i] = scan.nextInt();
        }

        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}