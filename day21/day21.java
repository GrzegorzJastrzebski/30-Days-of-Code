import java.lang.reflect.Method;

class day21
{

    static <E> void printArray(E[] array)
    {
        for (E element: array)
        {
            System.out.println(element + " ");
        }
    }

    public static void main(String args[])
    {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};

        printArray(intArray );
        printArray(stringArray);

        if (day21.class.getDeclaredMethods().length > 2)
        {
            System.out.println("You should only have 1 method named printArray.");
        }
    }
}