package Task;

public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return ( isDone ? "[X]" : "[ ]");
    }

    public void mark_done() {
        this.isDone = true;
        System.out.println("    OK I've marked this task as done: ");
        System.out.println("    " + this.toString());
    }

    public void mark_undone() {
        this.isDone = false;
        System.out.println("    OK I've marked this task as not done yet:");
        System.out.println("    " + this.toString());
    }

    @Override
    public String toString() {
        return this.getStatusIcon() + " " + this.description;
    }

    public String getCommand() {
        return this.description;
    }
}