package classwork21.string_numbers_tdd;

public class StringWithNumbers {

    //FIELDS
    private String string;

    //METHODS
    //constructor
    public StringWithNumbers(String string) {
        this.string = string;
    }

    //setters and getters
    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    //toString
    @Override
    public String toString() {
        return "StringWithNumbers{" +
                "string='" + string + '\'' +
                '}';
    }


    //123 456 987 333
    public int sumOfNumbersInString(String string){
        int sum = 0;
        String[] numbers = string.split(" ");
        for (int i = 0; i < numbers.length; i++) {
            sum += Integer.parseInt(numbers[i]);
        }
        return sum;
    }
}
