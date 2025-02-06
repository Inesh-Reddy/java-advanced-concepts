package dev.inesh.Threads;

public class fibonnaci{
    int n;
    fibonnaci(int n) {
        this.n = n;;
    }
    public static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("The " + n + "th Fibonacci number is: " + fibo(n));
    }
}
