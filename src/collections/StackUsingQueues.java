package collections;

import java.util.*;

public class StackUsingQueues {

    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    // push operation
    static void push(int x) {
        q2.add(x);

        while(!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // pop operation
    static int pop() {
        return q1.remove();
    }

    public static void main(String[] args) {

        push(1);
        push(2);
        push(3);

        System.out.println(pop()); // 3
    }
}
