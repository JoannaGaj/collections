package collections_examples;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuesExamples {
    public static void main(String [] args) {
        Queue<String> usersQueue = new PriorityQueue<>();

        usersQueue.add("user11");
        usersQueue.add("user3");
        usersQueue.add("admin");
        usersQueue.add("zeroUser");
        usersQueue.add("dev");
        System.out.println(usersQueue);

        System.out.println(usersQueue.poll());
        // 1 2 3 4 ------> 1 ------> 2 3 4
        System.out.println(usersQueue);
    }
}
