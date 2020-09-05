package singleton;

/*
The synchronized logger singleton will force the threads to wait their turn to use getInstance().
 */
public class LoggerSync {
    private static LoggerSync uniqueInstance;

    private LoggerSync(){}

    public static synchronized LoggerSync getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new LoggerSync();
        }
        return uniqueInstance;
    }

    public static void log(String s){
        System.out.println(s);
    }
}
