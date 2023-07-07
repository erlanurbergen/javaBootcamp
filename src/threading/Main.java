package threading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // что такое многопоточность
        // класс Thread
        // Runnable интерфейс
        // показать пример хаотичности потоков
        // что такое pool
        // жизненный цикл потоков
        // Thread yield scheduler
        // setPriority
        // join завершение выполнения текущего потока

//        Thread.yield(); // scheduler
//        System.out.println(Thread.currentThread().getName());
//        MyThread myThread = new MyThread(); // Thread 0
//        MyThread2 myThread2 = new MyThread2(); // Thread 1
//
//        myThread.start();
//        myThread.setPriority(Thread.MAX_PRIORITY);
//        myThread2.start();
//        System.out.println(myThread.getPriority());
//        myThread2.setPriority(Thread.MIN_PRIORITY);
//        System.out.println(myThread2.getPriority());

        ThreadEx t = new ThreadEx();
        Thread t2 = new Thread(t);
        t2.start();


        // pool - бассейн
        // race condition

    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread name is " + Thread.currentThread().getName() + " i " + i);
        }

    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread name is " + Thread.currentThread().getName() + " i " + i);
        }
    }
}

class ThreadEx implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread name is " + Thread.currentThread().getName() + " i " + i);
        }
    }
}