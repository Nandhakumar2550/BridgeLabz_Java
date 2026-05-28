package Mutlithreading;

import java.util.LinkedList;
import java.util.Queue;

class SharedQueue {

    private Queue<Integer> queue =
            new LinkedList<>();

    private int capacity = 5;

    public synchronized void produce(
            int value)
            throws InterruptedException {

        while (queue.size() == capacity) {

            wait();
        }

        queue.add(value);

        System.out.println(
                "Produced : " + value
        );

        notify();
    }

    public synchronized void consume()
            throws InterruptedException {

        while (queue.isEmpty()) {

            wait();
        }

        int value =
                queue.poll();

        System.out.println(
                "Consumed : " + value
        );

        notify();
    }
}

class Producer extends Thread {

    private SharedQueue sharedQueue;

    public Producer(
            SharedQueue sharedQueue) {

        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {

        try {

            for (int i = 1; i <= 10; i++) {

                sharedQueue.produce(i);

                Thread.sleep(500);
            }

        } catch (Exception e) {

            System.out.println(
                    "Producer Error"
            );
        }
    }
}

class Consumer extends Thread {

    private SharedQueue sharedQueue;

    public Consumer(
            SharedQueue sharedQueue) {

        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {

        try {

            for (int i = 1; i <= 10; i++) {

                sharedQueue.consume();

                Thread.sleep(800);
            }

        } catch (Exception e) {

            System.out.println(
                    "Consumer Error"
            );
        }
    }
}

public class ProducerConsumerDemo {

    public static void main(String[] args) {

        SharedQueue sharedQueue =
                new SharedQueue();

        Producer producer =
                new Producer(sharedQueue);

        Consumer consumer =
                new Consumer(sharedQueue);

        producer.start();
        consumer.start();
    }
}