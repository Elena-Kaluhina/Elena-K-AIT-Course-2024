package classwork50.exceptions.exception_handling;

public class NoSolutionException extends Exception{

    // empty constructor
    public NoSolutionException() {
    }

    // constructor with String
    public NoSolutionException(String message) {
        super(message);
    }
}
