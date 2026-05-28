package Mutlithreading;

import java.util.Scanner;

class CounterThread extends Thread {

    private int start;
    private int end;

    private static final Object lock =
            new Object();

    public CounterThread(
            int start,
            int end) {

        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {

        try {

            for (int i = start; i <= end; i++) {

                synchronized (lock) {

                    System.out.println(
                            Thread.currentThread().getName()
                                    + " : "
                                    + i
                    );
                }

                Thread.sleep(100);
            }

        } catch (InterruptedException e) {

            System.out.println(
                    "Thread Interrupted"
            );
        }
    }
}

public class ThreadedCounter {

    public static void main(String[] args) {

        Scanner scanner =
                new Scanner(System.in);

        try {

            System.out.print(
                    "Enter counting limit : "
            );

            int limit =
                    scanner.nextInt();

            if (limit <= 0) {

                System.out.println(
                        "Enter positive integer"
                );

                return;
            }

            int mid =
                    limit / 2;

            CounterThread thread1 =
                    new CounterThread(
                            1,
                            mid
                    );

            CounterThread thread2 =
                    new CounterThread(
                            mid + 1,
                            limit
                    );

            thread1.setName("Thread-1");
            thread2.setName("Thread-2");

            thread1.start();
            thread2.start();

            thread1.join();
            thread2.join();

            System.out.println(
                    "Counting Completed"
            );

        } catch (Exception e) {

            System.out.println(
                    "Invalid Input"
            );
        }

        scanner.close();
    }
}