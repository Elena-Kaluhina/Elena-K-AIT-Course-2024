package homework35.calendar.dao;

import homework35.calendar.model.Event;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventCalendarImpl implements EventCalendar {

    private List<Event> events;

    public EventCalendarImpl() {
        this.events = new ArrayList<>();
    }

    @Override
    public void addEvent(Event event) {
        events.add(event);
    }

    @Override
    public void removeEvent(Event event) {
        events.remove(event);
    }

    @Override
    public Event getEvent(String title) {
        for (Event event : events) {
            if (event.getTitle().equals(title)) {
                return event;
            }
        }
        return null;
    }

    @Override
    public Event[] getAllEvents() {
        return events.toArray(new Event[0]);
    }

    @Override
    public boolean updateEvent(String title, Event updatedEvent) {
        Event event = getEvent(title);
        if (event != null) {
            event.setTitle(updatedEvent.getTitle());
            event.setDate(updatedEvent.getDate());
            event.setDescription(updatedEvent.getDescription());
            return true;
        }
        return false;
    }

    @Override
    public Event[] getEventsByDate(LocalDate date) {
        List<Event> eventsOnDate = new ArrayList<>();
        for (Event event : events) {
            if (event.getDate().equals(date)) {
                eventsOnDate.add(event);
            }
        }
        return eventsOnDate.toArray(new Event[0]);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EventCalendarImpl{events=[");
        for (Event event : events) {
            sb.append(event).append(", ");
        }
        if (!events.isEmpty()) {
            sb.setLength(sb.length() - 2); // Убираем последнюю запятую и пробел
        }
        sb.append("]}");
        return sb.toString();
    }
}
