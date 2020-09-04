package singleton;

public class LoggerVolatile {
    private volatile static LoggerVolatile uniqueInstance;

    private LoggerVolatile(){}

    public static synchronized LoggerVolatile getInstance(){
        if(uniqueInstance == null){
            synchronized (LoggerVolatile.class){
                if(uniqueInstance == null){
                    uniqueInstance = new LoggerVolatile();
                }
            }
        }
        return uniqueInstance;
    }
}
