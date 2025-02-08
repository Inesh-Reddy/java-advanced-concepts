package dev.inesh.addersubtractor;

import java.util.concurrent.Callable;

public class adder implements Callable<Void> {
    private value value;
    public adder(value value) {
        this.value = value;
    }

    @Override
    public Void call() throws Exception {
        for(long i=0; i<=100; i++){
            value.setX(value.getX()+1);
        }
        return null;
    }
}
