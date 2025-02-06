package dev.inesh.Threads;

public class nSumThread implements Runnable {
    int input;

    public nSumThread(int input) {
        this.input = input;
    }

    public void sum(int input){
        int sum = 0;
        for(int i=0; i<=input; i++){
            sum = sum + i;
        }
        System.out.println("Sum: " + sum + " Thread: " + Thread.currentThread().getName());
    }
    @Override
    public void run() {
       sum(input);
    }
}
