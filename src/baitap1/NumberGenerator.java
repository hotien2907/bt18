package baitap1;

public class NumberGenerator implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("SỐ: " + i + ", Thread ID: " + Thread.currentThread().hashCode());

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }

        }
    }
}
