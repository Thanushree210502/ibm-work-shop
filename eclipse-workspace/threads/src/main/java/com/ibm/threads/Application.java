package com.ibm.threads;

class Runner implements Runnable {
    public void run() {
        try {
            Thread.sleep(50); // Simulate work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread is running.");
    }
}

public class Application {
    public static void main(String[] args) {
        Runner runner = new Runner();
        Thread thread1 = new Thread(runner);
        
        System.out.println("State before start: " + thread1.getState());
        thread1.start();
        System.out.println("State after start: " + thread1.getState());
        
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("State after sleep: " + thread1.getState());
    }
}
