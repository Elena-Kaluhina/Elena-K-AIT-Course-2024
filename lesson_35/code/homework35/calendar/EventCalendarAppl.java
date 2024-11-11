package homework35.calendar;

import homework35.calendar.dao.EventCalendarImpl;
import homework35.calendar.model.Event;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EventCalendarAppl {

    private static final Scanner scanner = new Scanner(System.in);
    private static final EventCalendarImpl calendar = new EventCalendarImpl();

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            printMenu();
            System.out.print("Enter your choice: ");
            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1 -> addEvent();
                    case 2 -> viewAllEvents();
                    case 3 -> getEventByTitle();
                    case 4 -> removeEvent();
                    case 5 -> updateEvent();
                    case 6 -> getEventsByDate();
                    case 7 -> {
                        System.out.println("Exiting the application.");
                        running = false;
                    }
                    default -> System.out.println("Invalid choice. Please enter a number between 1 and 7.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear invalid input
            }
            System.out.println(); // Blank line for spacing
        }
        scanner.close();
    }

    // Display menu
    private static void printMenu() {
        System.out.println("\nEvent Calendar Menu:");
        System.out.println("1 - Add event");
        System.out.println("2 - View all events");
        System.out.println("3 - Get event by title");
        System.out.println("4 - Remove event");
        System.out.println("5 - Update event");
        System.out.println("6 - Get events by date");
        System.out.println("7 - Exit");
    }

    // Add a new event
    private static void addEvent() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();

        LocalDate date = getDateFromUser("Enter date (YYYY-MM-DD): ");
        if (date == null) return;

        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        Event event = new Event(title, date, description);
        calendar.addEvent(event);
        System.out.println("Event added successfully.");
    }

    // View all events
    private static void viewAllEvents() {
        Event[] events = calendar.getAllEvents();
        if (events.length == 0) {
            System.out.println("No events found.");
        } else {
            for (Event event : events) {
                System.out.println(event);
            }
        }
    }

    // Get an event by title
    private static void getEventByTitle() {
        System.out.print("Enter event title: ");
        String title = scanner.nextLine();
        Event event = calendar.getEvent(title);
        if (event == null) {
            System.out.println("Event not found.");
        } else {
            System.out.println("Event details: " + event);
        }
    }

    // Remove an event
    private static void removeEvent() {
        System.out.print("Enter event title to remove: ");
        String title = scanner.nextLine();
        Event event = calendar.getEvent(title);
        if (event != null) {
            calendar.removeEvent(event);
            System.out.println("Event removed successfully.");
        } else {
            System.out.println("Event not found.");
        }
    }

    // Update an event
    private static void updateEvent() {
        System.out.print("Enter the title of the event to update: ");
        String title = scanner.nextLine();
        Event existingEvent = calendar.getEvent(title);
        if (existingEvent == null) {
            System.out.println("Event not found.");
            return;
        }

        System.out.print("Enter new title: ");
        String newTitle = scanner.nextLine();

        LocalDate newDate = getDateFromUser("Enter new date (YYYY-MM-DD): ");
        if (newDate == null) return;

        System.out.print("Enter new description: ");
        String newDescription = scanner.nextLine();

        Event updatedEvent = new Event(newTitle, newDate, newDescription);
        calendar.updateEvent(title, updatedEvent);
        System.out.println("Event updated successfully.");
    }

    // Get events by date
    private static void getEventsByDate() {
        LocalDate date = getDateFromUser("Enter date (YYYY-MM-DD) to view events: ");
        if (date == null) return;

        Event[] events = calendar.getEventsByDate(date);
        if (events.length == 0) {
            System.out.println("No events found for this date.");
        } else {
            for (Event event : events) {
                System.out.println(event);
            }
        }
    }

    // Helper method to get date input from user
    private static LocalDate getDateFromUser(String prompt) {
        System.out.print(prompt);
        try {
            return LocalDate.parse(scanner.nextLine());
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use YYYY-MM-DD.");
            return null;
        }
    }
}
