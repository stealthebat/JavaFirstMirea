public class TestClass {

    public static int testFunction(int a, int b)  {
        System.out.println("Test function working");
        if (a < 0) {
            throw new MyException("Exception is thrown");
        }

        return a * b;
    }
}
