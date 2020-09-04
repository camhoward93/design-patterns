package singleton;

public class LoggerEager {
    private static LoggerEager uniqueInstance = new LoggerEager();

    private LoggerEager(){}

    public static synchronized LoggerEager getInstance(){
        return uniqueInstance;
    }
}
