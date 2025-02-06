package dev.inesh.Threads;

public class clientCallingThread {
    public static void main(String[] args) {
        Runnable runnable = new sumThread();
        System.out.println("Main: "+ Thread.currentThread().getName());
        Thread thread = new Thread(runnable);;
        thread.start();
//        new sumThread().sum();
        int input = 10;
        for (int i = 1; i <= input; i++) {
            Thread inLineThread  = new Thread(new nSumThread(i));
            inLineThread.start();
        }

        Runnable runnable1 = new nSumThread(100);
        Thread thread1 = new Thread(runnable1);
        thread1.start();
    }
}
