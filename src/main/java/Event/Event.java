package Event;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import Task.Task;

public class Event extends Task {
    protected DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HHmm");
    protected String from;
    protected String to;
    protected LocalDateTime fromDate;
    protected LocalDateTime toDate;
    protected String displayFrom;
    protected String displayTo;

    public Event(String description, String from, String to) {
        super(description);
        this.from = from;
        this.to = to;
        fromDate = LocalDateTime.parse(from, FORMAT);
        toDate = LocalDateTime.parse(to, FORMAT);
        displayFrom = this.fromDate.toString().replace("T", " ");
        displayTo = this.toDate.toString().replace("T", " ");
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + "(from: " + this.displayFrom + " to: " + this.displayTo + ")";
    }
    
}
