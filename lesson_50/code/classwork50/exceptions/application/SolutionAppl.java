package classwork50.exceptions.application;

import classwork50.exceptions.exception_handling.NoSolutionException;
import classwork50.exceptions.exception_handling.SolutionIsAnyNumber;

public class SolutionAppl {

    // a * x = b

    // деление является целочисленным, так как у нас участвуют Integer
    // solution: x = b / a

    // a = 0 && b != 0 => "Делить на ноль нельзя!!!", продолжить работу

    // a = 0 && b == 0 => "то X любое число"

    public static void main(String[] args) {


        int a = 100;
        int b = 40;

        int x = 0;
        try {
            x = solution(a, b);
            System.out.print("X = " + x);

        } catch (NoSolutionException e) {
            System.out.print("Division by zero!" + e.getMessage());
           // throw new RuntimeException(e);
        }  catch (SolutionIsAnyNumber e){
            System.out.print("Any number is solution!" + e.getMessage());
        }
        finally {
            System.out.println("\nBey, bey)))");
        }

    }

    private static int solution(int a, int b) throws NoSolutionException {
        if (a == 0 && b != 0){
            throw new NoSolutionException("\nNo possible solution, division by 0 is impossible!!!");
        }
        if (a == 0 && b == 0){
            throw new SolutionIsAnyNumber("\nX - is any number!");
        }
        return b/a; // деление целочисленное
    }
}
