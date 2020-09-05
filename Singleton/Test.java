package singleton;

public class Test extends Thread {
    private int id;
    private int count = 0;

    public Test(int identifier){
        id = identifier;
        System.out.println("Creating new Test Thread with ID:"+id);
    }

    public void run(){
        // Test the synchronized logger
        System.out.println("Testing Synchronized Logger in thread: " + id );
        while(count<10){
            try{
                sleep(100);
            } catch (InterruptedException e){}
            count++;
            LoggerSync.getInstance().log("Thread: " + id + " writes " + "message " + count + " to synchronized logger log.");
        }

        // Reset count
        count = 0;

        // Test the eager logger
        System.out.println("Testing Eager Logger in thread: " + id );
        while(count<10){
            try{
                sleep(100);
            } catch (InterruptedException e){}
            count++;
            LoggerEager.getInstance().log("Thread: " + id + " writes " + "message " + count + " to eager logger log.");
        }

        // Reset count
        count = 0;

        // Test the volatile logger
        System.out.println("Testing volatile Logger in thread: " + id );
        while(count<10){
            try{
                sleep(100);
            } catch (InterruptedException e){}
            count++;
            LoggerVolatile.getInstance().log("Thread: " + id + " writes " + "message " + count + " to volatile logger log.");
        }
    }
}
