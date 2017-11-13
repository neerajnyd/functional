package com.ny.timing.functional;

public class Example {

    public static void main(String[] args) throws InterruptedException {

        Double value = Timing.timed("Returns my Double", Example::doSomeWork, System.out::println);
        System.out.println("Value returned is: " + value);

    }

    private static Double doSomeWork(){

        pretendToDoHardWork();

        return 3.14;

    }

    private static void pretendToDoHardWork() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
