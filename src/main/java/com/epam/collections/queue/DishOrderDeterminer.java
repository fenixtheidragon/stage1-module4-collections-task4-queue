package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        System.out.println(numberOfDishes + "|||" + everyDishNumberToEat);

        LinkedList<Integer> dishes = new LinkedList<>();
        LinkedList<Integer> eatenDishes = new LinkedList<>();

        for (int a = 1; a <= numberOfDishes; a++) {
            dishes.add(a);
        }
        int absoluteBreakCount = 0;
        int nextDishIndexLoop = 0;
        int nextDishIndex = 0;

        while (!dishes.isEmpty()) {
            absoluteBreakCount++;
            if (absoluteBreakCount >= 500) {
                System.out.println("Infinite loop");
                break;
            }
            System.out.println(nextDishIndex + "|" + nextDishIndexLoop);
            if (nextDishIndexLoop == everyDishNumberToEat - 1) {
                if (dishes.isEmpty()) {
                    break;
                }
                System.out.println(dishes.get(nextDishIndex));
                eatenDishes.add(dishes.remove(nextDishIndex));
                System.out.println(eatenDishes.getLast());
                System.out.println("nextDishIndexLoop rotation|");
                nextDishIndexLoop = 0;
                continue;
            }
            if (nextDishIndex >= dishes.size() - 1) {
                System.out.println("nextDishIndex rotation|" + dishes.size());
                nextDishIndex = 0;
                //nextDishIndexLoop++;
                continue;
            }
            nextDishIndexLoop++;
            nextDishIndex++;
        }
        return eatenDishes;
    }
}
