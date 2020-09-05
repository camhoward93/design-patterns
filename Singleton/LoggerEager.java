package singleton;

/*
The eager logger singleton will rely on the JVM to create the unique instance when the class is loaded.
 */
public class LoggerEager {
    private static LoggerEager uniqueInstance = new LoggerEager();

    private LoggerEager(){}

    public static LoggerEager getInstance(){
        return uniqueInstance;
    }

    public static void log(String s){
        System.out.println(s);
    }
}
