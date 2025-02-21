package classwork46.ait.toDoList.dao;

import classwork46.ait.toDoList.model.Task;

import java.util.List;

public interface ToDoList {

    // add Task
    boolean addTask(Task task);

    // remove Task
    Task removeTask(int taskNumber);

    // print list of Tasks
    void viewTasks();

    // взять весь список
    List<Task> getAllTasks();

    // quantity of tasks
    int quantity();

    // сохранение
    void saveTasks(String fileName);

    // загрузка
    void loadTasks(String fileName);

}
