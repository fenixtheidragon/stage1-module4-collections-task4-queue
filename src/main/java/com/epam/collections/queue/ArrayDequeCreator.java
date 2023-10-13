package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    private ArrayDeque<Integer> arrayDeque;

    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        this.arrayDeque = new ArrayDeque<>();

        this.addQueuePollToArrayDequeTwice(firstQueue);
        this.addQueuePollToArrayDequeTwice(secondQueue);
        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            firstQueue.add(arrayDeque.pollLast());
            this.addQueuePollToArrayDequeTwice(firstQueue);
            secondQueue.add(arrayDeque.pollLast());
            this.addQueuePollToArrayDequeTwice(secondQueue);
        }
        return arrayDeque;
    }

    private void addQueuePollToArrayDequeTwice(Queue<Integer> queue) {
        this.arrayDeque.add(queue.poll());
        this.arrayDeque.add(queue.poll());
    }
}
