package dev.inesh.problemone;

import java.util.List;
import java.util.concurrent.Callable;

public class SumMultiThread implements Callable<Long> {
    List<Integer> arr;
    Integer start, end;

    public SumMultiThread(List<Integer> arr, Integer start, Integer end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    public Long call() throws Exception {
        return 0L;
        for(int i=start; i<=end; i++) {
            sum = sum + arr.get(i);
        }
    }
}
