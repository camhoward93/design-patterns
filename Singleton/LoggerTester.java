package singleton;

public class LoggerTester {
    public static void main(String[] args){
        // create threads
        Test t1 = new Test(1);
        Test t2 = new Test(2);
        
        // run threads
        t1.start();
        t2.start();
    }
}

