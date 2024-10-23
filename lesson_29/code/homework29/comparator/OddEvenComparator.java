package homework29.comparator;

import java.util.Comparator;

public class OddEvenComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer num1, Integer num2) {
        // если оба числа четные или оба числа нечетные - сравниваем их по значению
        if ((num1 % 2 == 0 && num2 % 2 == 0) || (num1 % 2 != 0 && num2 % 2 != 0)) {
            return num1 - num2;
        }
        // если num1 четное, а num2 нечетное - четное должно идти первым
        if (num1 % 2 == 0 && num2 % 2 != 0) {
            return -1;
        }
        // если num1 нечетное, а num2 четное - нечетное должно идти после
        return 1;
    }
}
//Мне не нужно отдельно создавать интерфейс Comparator, так как я могу вызвать и импортировать его из Java
//Comparator — это интерфейс, встроенный в библиотеку Java, и его не нужно реализовывать. Мы просто создаём
//собственную реализацию метода compare() в нашем классе OddEvenComparator, который наследуется от этого интерфейса.