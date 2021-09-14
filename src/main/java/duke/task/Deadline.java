package duke.task;

public class Deadline extends Task{
    protected String endDate;

    public Deadline(String description, String endDate) {
        super(description);
        this.endDate = endDate;
    }

    @Override
    public String listTask() {
        return "[D]" + super.listTask() + " (by: " + endDate + ")";
    }

    @Override
    public String getIcon() {
        return "D";
    }

    public String getDate() {
        return endDate;
    }
}