package threading.july11;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // synchronized
        Data data = new Data();
        data.setCount(5);
        MyThread m1 = new MyThread(data);
        MyThread m2 = new MyThread(data);
        m1.start();
        m2.start();

        m1.join();
        m2.join();

        System.out.println(data.getCount());

    }
}

class MyThread extends Thread {
    private Data data;

    public MyThread(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        data.changeCount();
    }
}

class Data {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void changeCount() {
        System.out.println("hello");

        synchronized (this) {
            int count = this.count;
            count++;
            this.count = count;
        }

    }
}


