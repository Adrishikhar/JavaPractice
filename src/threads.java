class Count implements Runnable{

    static int counter = 0;

    public synchronized void run() {
        for(int i=0; i<1000; i++) {
            counter++;
        }
    }
}


public class threads {

    public static void main(String[] args) throws InterruptedException {

        Runnable c = new Count();
        Runnable d = new Count();

        Thread tC = new Thread(c);
        Thread tD = new Thread(d);

        tC.start();
        tD.start();

        tC.join();
        tD.join();

        System.out.println(Count.counter);

    }

}
