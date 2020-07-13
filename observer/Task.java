
import java.util.ArrayList;

class Task implements TaskObserver {

    private String name;
    private int minutes;
    private ArrayList<TaskObserver> observers;
    private ArrayList<Task> prereqs;
    private boolean isComplete;

    public Task(String name, int minutes) {
        this.name = name;
        this.minutes = minutes;
        this.observers = new ArrayList<TaskObserver>();
        this.prereqs = new ArrayList<Task>();
        this.isComplete = false;
    }

    public void register(TaskObserver t) {
        this.observers.add(t);
    }

    public void unregister(TaskObserver t) {
        this.observers.remove(t);
    }

    public void startIfStartable() {
        if (!this.isStartable() || this.isComplete) {
            return;
        }
        System.out.println(name + "...");
        try {
            Thread.sleep(minutes * 100);
        } catch (Exception e) {}
        this.isComplete = true;
        for (TaskObserver t: observers) {
            t.update(this);
        }
    }

    private boolean isStartable() {
        for (Task p : prereqs) {
            if (!p.isComplete) {
                return false;
            }
        }
        return true;
    }

    public void update(Task t) {
        this.startIfStartable();
    }

    public void addPrereq(Task t) {
        this.prereqs.add(t);
        t.register(this);
    }
}
