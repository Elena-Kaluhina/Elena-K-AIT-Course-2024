package homework35.calendar.dao;

import homework35.calendar.model.Event;

import java.time.LocalDate;

public interface EventCalendar {

    void addEvent(Event event);                 // Добавляет новое событие

    void removeEvent(Event event);              // Удаляет событие

    Event getEvent(String title);               // Получает событие по названию

    Event[] getAllEvents();                     // Возвращает все события

    boolean updateEvent(String title, Event updatedEvent);  // Обновляет событие по названию

    Event[] getEventsByDate(LocalDate date);    // Получает события по дате
}


