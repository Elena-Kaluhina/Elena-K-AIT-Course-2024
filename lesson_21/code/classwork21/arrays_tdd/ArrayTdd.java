package classwork21.arrays_tdd;

import java.util.Arrays;
import java.util.Objects;

public class ArrayTdd {

    //field
    private int[] array;

    //constructor
    public ArrayTdd(int[] array) {
        this.array = array;
    }

    //getter and setter
    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    //toString
    @Override
    public String toString() {
        return "ArrayTdd{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    //equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArrayTdd arrayTdd)) return false;
        return Objects.deepEquals(array, arrayTdd.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    //method
    //count positive numbers in array
    public int countPositive(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        return count;
    }
}