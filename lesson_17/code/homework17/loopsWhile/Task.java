package homework17.loopsWhile;

//Распечатать 10 строк: "Task1". "Task2". … "Task10". Использовать цикл while

public class Task {
    public static void main(String[] args) {

        int taskNumber = 1;

        while (taskNumber <= 10){
            System.out.println("Task" + taskNumber);
            taskNumber ++;
        }
    }
}
