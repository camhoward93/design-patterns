package singleton;

/*
The volatile logger singleton will only synchronize upon the first creation of the uniqueInstance.
 */
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

    public static void log(String s){
        System.out.println(s);
    }
}
