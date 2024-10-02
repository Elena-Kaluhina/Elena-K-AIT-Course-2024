package homework12;

public class WhileWithTernary {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int count = 0;

        while (count < 7){
            int max = (a > b) ? a: b;
            System.out.println("Max: " + max);
            count++;
        }
    }
}
