package lesson4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        int i = 0;
        while (i < 5) {
            Thread.sleep(1000);
            System.out.print(i + " ");
            i++;
        }
    }


}
