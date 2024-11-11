package homework35.calendar.model;

import java.time.LocalDate;

public class Event {
    private String title;
    private LocalDate date;
    private String description;

    public Event(String title, LocalDate date, String description) {
        this.title = title;
        this.date = date;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Event{")
                .append("title='").append(title).append('\'')
                .append(", date=").append(date)
                .append(", description='").append(description).append('\'')
                .append('}');
        return sb.toString();
    }
}
