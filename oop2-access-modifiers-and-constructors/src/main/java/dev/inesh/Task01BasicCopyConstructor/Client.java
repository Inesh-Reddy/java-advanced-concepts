package dev.inesh.Task01BasicCopyConstructor;

public class Client {
    public static void main(String[] args) {
        Car Benz = new Car("c220d",2023);
        System.out.println(System.identityHashCode(Benz));

        Car BenzCopy = Benz;
        System.out.println(System.identityHashCode(BenzCopy));

        Car BenzNewModel = new Car(Benz);
        System.out.println(System.identityHashCode(BenzNewModel));
    }
}
