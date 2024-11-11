package homework35.calendar.test;

import homework35.calendar.dao.EventCalendarImpl;
import homework35.calendar.model.Event;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EventCalendarImplTest {

    @Test
    void testAddEvent() {
        EventCalendarImpl calendar = new EventCalendarImpl();
        Event event = new Event("Meeting", LocalDate.of(2023, 10, 12), "Project discussion");
        calendar.addEvent(event);
        assertEquals(1, calendar.getAllEvents().length);
        assertEquals("Meeting", calendar.getAllEvents()[0].getTitle());
    }

    @Test
    void testRemoveEvent() {
        EventCalendarImpl calendar = new EventCalendarImpl();
        Event event = new Event("Meeting", LocalDate.of(2023, 10, 12), "Project discussion");
        calendar.addEvent(event);
        calendar.removeEvent(event);
        assertEquals(0, calendar.getAllEvents().length);
    }

    @Test
    void testGetEvent() {
        EventCalendarImpl calendar = new EventCalendarImpl();
        Event event = new Event("Meeting", LocalDate.of(2023, 10, 12), "Project discussion");
        calendar.addEvent(event);
        Event retrievedEvent = calendar.getEvent("Meeting");
        assertNotNull(retrievedEvent);
        assertEquals("Project discussion", retrievedEvent.getDescription());
    }

    @Test
    void testGetAllEvents() {
        EventCalendarImpl calendar = new EventCalendarImpl();
        calendar.addEvent(new Event("Meeting", LocalDate.of(2023, 10, 12), "Project discussion"));
        calendar.addEvent(new Event("Conference", LocalDate.of(2023, 10, 15), "Annual conference"));
        assertEquals(2, calendar.getAllEvents().length);
    }

    @Test
    void testUpdateEvent() {
        EventCalendarImpl calendar = new EventCalendarImpl();
        Event event = new Event("Meeting", LocalDate.of(2023, 10, 12), "Project discussion");
        calendar.addEvent(event);
        Event updatedEvent = new Event("Updated Meeting", LocalDate.of(2023, 10, 13), "Updated discussion");
        boolean result = calendar.updateEvent("Meeting", updatedEvent);
        assertTrue(result);
        assertEquals("Updated Meeting", calendar.getEvent("Updated Meeting").getTitle());
        assertEquals("Updated discussion", calendar.getEvent("Updated Meeting").getDescription());
    }

    @Test
    void testGetEventsByDate() {
        EventCalendarImpl calendar = new EventCalendarImpl();
        LocalDate date = LocalDate.of(2023, 10, 12);
        Event event1 = new Event("Meeting", date, "Project discussion");
        Event event2 = new Event("Lunch", date, "Team lunch");
        calendar.addEvent(event1);
        calendar.addEvent(event2);
        Event[] eventsOnDate = calendar.getEventsByDate(date);
        assertEquals(2, eventsOnDate.length);
        assertEquals("Meeting", eventsOnDate[0].getTitle());
        assertEquals("Lunch", eventsOnDate[1].getTitle());
    }
}

