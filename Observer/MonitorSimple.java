package observer;

public class MonitorSimple implements Observer, DisplayElement {
    private boolean crying;
    private Subject child;

    public MonitorSimple(Subject baby){
        this.child = baby;
        child.registerObserver(this);
    }

    @Override
    public void update(boolean status, int severity) {
        this.crying = status;
        display();
    }

    public void display(){
        System.out.println("Simple: Crying status: " + crying);
    }
}
