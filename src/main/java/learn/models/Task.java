package learn.models;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.time.LocalDate;
import java.util.Objects;

public class Task {
    private static final Log log = LogFactory.getLog(Task.class);
    private int id;
    private String description;
    private int hours;
    private int minutes;
    private LocalDate date;
    private boolean isCompleted;

    public Task() {
    }

    public Task(int id, String description, int hours, int minutes, LocalDate date, boolean isCompleted){
        this.id = id;
        this.description = description;
        this.hours = hours;
        this.minutes = minutes;
        this.date = date;
        this.isCompleted = isCompleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id && hours == task.hours && minutes == task.minutes && isCompleted == task.isCompleted && Objects.equals(description, task.description) && Objects.equals(date, task.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, hours, minutes, date, isCompleted);
    }
}
