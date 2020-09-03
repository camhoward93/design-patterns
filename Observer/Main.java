package observer;

public class Main {
    public static void main(String[] args){
        Baby baby1 = new Baby();
        Baby baby2 = new Baby();
        MonitorSimple monitor1 = new MonitorSimple(baby1);
        MonitorAdvanced monitor2 = new MonitorAdvanced(baby1, baby2);

        baby1.setCryingStatus(false, 0);
        baby1.setCryingStatus(true, 1);
        baby1.setCryingStatus(true, 2);
        baby1.setCryingStatus(false, 0);
        baby2.setCryingStatus(false, 0);
        baby2.setCryingStatus(true, 1);
    }
}
