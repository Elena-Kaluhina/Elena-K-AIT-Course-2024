package classwork46.ait.toDoList.dao;

import classwork46.ait.toDoList.ToDoListAppl;
import classwork46.ait.toDoList.model.Task;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ToDoListImpl implements ToDoList {

    // хранилище
    private List<Task> tasks;
    private int quantity;

    private LocalDate time;


    // constructor
    public ToDoListImpl() {
        this.tasks = new ArrayList<>(); // резиновый список, который будет разъезжаться под количество задач
        this.quantity = 0;
    }

    @Override
    public boolean addTask(Task task) {
        if (task == null || tasks.contains(task)){
            return false;
        }
        tasks.add(task); // метод add из ArrayList
        quantity = tasks.size();
        return true;
    }

    @Override
    public Task removeTask(int taskNumber) {
        if (taskNumber >= 1 && taskNumber <= quantity){
            Task victim = tasks.get(taskNumber - 1);
            tasks.remove(victim);
            System.out.println("Task: " + victim.getTask() + " is removed.");
            quantity--;
            return victim;
        }
        System.out.println("Wrong number of task.");
        return null;
    }

    @Override
    public void viewTasks() {
//        for (Task t : tasks){
//            System.out.println(t);
//        }
        IntStream.range(0, tasks.size())
                .forEach(i -> System.out.println((i + 1) + ". " + tasks.get(i)));
    }

    @Override
    public List<Task> getAllTasks() {
        return tasks;
    }

    @Override
    public int quantity() {
        return quantity;
    }

    @Override
    public void saveTasks(String fileName) {
        List<Task> taskList = getAllTasks();
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ToDoListAppl.FILE_NAME))){
            oos.writeObject(taskList);
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }

    @Override
    public void loadTasks(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ToDoListAppl.FILE_NAME))) {
            List<Task> readTask = (List<Task>) ois.readObject();
            quantity = readTask.size();
            System.out.println("List of tasks.");
            int taskNumber = 0;
            for (Task t : readTask) {
                System.out.println((taskNumber++ + 1) + ". " + t.getTask() + ", data: " + t.getDate());

            }
            tasks = readTask;
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
