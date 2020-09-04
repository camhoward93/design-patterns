package singleton;

public class Test extends Thread {
    private int id;
    private int count = 0;

    public Test(int identifier){
        id = identifier;
        System.out.println("Creating new Test Thread with ID:"+id);
    }

    public void run(){
        while(count<10){
            try{
                sleep(100);
            } catch (InterruptedException e){}
            count++;
            LoggerEager.getInstance().log("Thread: "+id+"writes "+count+"message to log");
        }
    }
}
