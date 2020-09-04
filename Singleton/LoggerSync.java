package singleton;

public class LoggerSync {
    private static LoggerSync uniqueInstance;

    private LoggerSync(){}

    public static synchronized LoggerSync getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new LoggerSync();
        }
        return uniqueInstance;
    }
}
