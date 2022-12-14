public class MyException extends RuntimeException {
    public MyException(String msg) {
        super("The first argument is negative");
    }
}
