package dev.inesh.problemone;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        int n = 1_000_000;
        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            arr.add(i%100);
        }

        int numOfThreads = Runtime.getRuntime().availableProcessors();

        int chunkSize = n/numOfThreads;

        ExecutorService executor = Executors.newFixedThreadPool(numOfThreads);



    }
}
