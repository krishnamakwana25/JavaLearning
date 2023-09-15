package org.example.threads;

/**
 * print odd even using two threads
 */
class Odd extends Thread{
    public static final int MAX_NUMBER = 10;
    public void run(){
        try {
            printOdd();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public synchronized void printOdd() throws InterruptedException {
        int count =1;
        System.out.println("ODD NUMBERS");
//        synchronized (this){
            while (count<=MAX_NUMBER){
//                Thread.sleep(1000);
                if(count % 2 != 0){
                    System.out.println(count);
                }
                count++;
//            }
        }
    }
}
class Even extends Thread{
    public static final int MAX_NUMBER = 10;
    public void run(){
        try {
            printEven();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public synchronized void printEven() throws InterruptedException {
        int count =1;
        System.out.println("EVEN NUMBERS");
//        synchronized (this){
            while (count<=MAX_NUMBER){
//                Thread.sleep(2000);
                if(count % 2 == 0){
                    System.out.println(count);
                }
                count++;
            }
//        }
    }
}
public class OddEvenUsingThreads {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Odd t1 = Odd.class.newInstance();
        Even t2 = new Even();
        t1.start();

        t2.start();
    }
}
