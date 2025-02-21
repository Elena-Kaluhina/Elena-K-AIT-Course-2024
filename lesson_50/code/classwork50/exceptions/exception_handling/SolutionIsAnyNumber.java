package classwork50.exceptions.exception_handling;

public class SolutionIsAnyNumber extends RuntimeException {

    // empty constructor

    public SolutionIsAnyNumber() {
    }

    // constructor with message "constructor with String"
    public SolutionIsAnyNumber(String message) {
        super(message);
    }
}
