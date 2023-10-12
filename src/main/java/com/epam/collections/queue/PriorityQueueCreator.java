package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>(new ReverseAlphabeticalComparator());
        priorityQueue.addAll(firstList);
        priorityQueue.addAll(secondList);
        return priorityQueue;
    }
}

class ReverseAlphabeticalComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        return -s1.compareTo(s2);
    }
}

