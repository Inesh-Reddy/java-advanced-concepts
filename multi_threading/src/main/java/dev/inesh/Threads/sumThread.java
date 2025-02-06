package dev.inesh.Threads;

public class sumThread implements Runnable {


    public void sum(){
        int sum =0;
        for(int i = 0; i<100; i++){
            sum  = sum + i;
        }
        System.out.println(sum);
    }

    @Override
    public void run() {
//        System.out.println("SumThread: "+ Thread.currentThread().getName());
        sum();
    }
}
