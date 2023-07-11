package threading.july11;

public class VolitileMain {
    volatile static int count = 0;
    public static void main(String[] args) {
        // Volatile
        // https://urvanov.ru/2017/07/20/%D0%B7%D0%B0%D1%87%D0%B5%D0%BC-%D0%BD%D1%83%D0%B6%D0%BD%D0%BE-volatile-%D0%B2-java/

        new WriteThread().start();
        new ReadThread().start();

    }

    static class WriteThread extends Thread {
        @Override
        public void run() {
            while (count < 5) {
                System.out.println("count: " + (++count));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class ReadThread extends Thread {
        @Override
        public void run() {
            int localValue = count;
            while (localValue < 5) {
                if (localValue != count) {
                    System.out.println("read from count " + count);
                    localValue = count;
                }
            }
        }
    }

}
