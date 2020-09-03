package exercise3;

import java.util.ArrayList;

public class Baby implements Subject {
    private ArrayList<Observer> observers;
    private boolean crying;
    private int severity;

    public Baby() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(crying, severity);
        }
    }

    public void cryingChanged() {
        notifyObservers();
    }

    public void setCryingStatus(boolean cryState, int severityState) {
        this.crying = cryState;
        this.severity = severityState;
        cryingChanged();
    }
}
