package observer;

public class MonitorAdvanced implements Observer, DisplayElement {
    private boolean crying;
    private int severity;
    private Subject child1, child2;

    public MonitorAdvanced(Subject baby1, Subject baby2){
        this.child1 = baby1;
        child1.registerObserver(this);

        this.child2 = baby2;
        child2.registerObserver(this);
    }

    @Override
    public void update(boolean status, int severity) {
        this.crying = status;
        this.severity = severity;
        display();
    }

    public void display(){
        System.out.println("Advanced: Crying status: " + crying + " with a severity of " + severity);
    }
}
