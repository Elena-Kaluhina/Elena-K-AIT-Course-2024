package classwork46.ait.toDoList.test;

import classwork46.ait.toDoList.dao.ToDoList;
import classwork46.ait.toDoList.dao.ToDoListImpl;
import classwork46.ait.toDoList.model.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListImplTest {

    ToDoList toDoList;
    LocalDate now = LocalDate.now();


    // тестовый набор данных
    @BeforeEach
    void setUp() {

        toDoList = new ToDoListImpl();

        toDoList.addTask(new Task("Do homework", now.minusDays(2)));
        toDoList.addTask(new Task("Buy products", now.minusDays(1)));
        toDoList.addTask(new Task("Walk with pets", now.minusDays(3)));

        // System.out.println(toDoList); // распечатывает ссылку
    }

    @Test
    void addTask() {

        assertFalse(toDoList.addTask(null));
        assertFalse(toDoList.addTask(new Task("Do homework", now.minusDays(2))));
        Task task = new Task("Clean", now.minusDays(1));
        assertTrue(toDoList.addTask(task));
        assertEquals(4, toDoList.quantity());
    }

    @Test
    void removeTask() {
        toDoList.removeTask(1);
        assertEquals(2, toDoList.quantity());
        toDoList.viewTasks();
    }

    @Test
    void viewTasks() {
        toDoList.viewTasks();
    }

    @Test
    void getAllTasks() {
        toDoList.getAllTasks();
        toDoList.viewTasks();
    }

    @Test
    void quantity() {

        assertEquals(3, toDoList.quantity());
    }
}
