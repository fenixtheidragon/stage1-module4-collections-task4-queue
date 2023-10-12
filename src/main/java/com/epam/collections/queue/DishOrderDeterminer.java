package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        System.out.println(numberOfDishes + "|||" + everyDishNumberToEat);
        LinkedList<String> dishes = new LinkedList<>();
        LinkedList<Integer> eatenDishes = new LinkedList<>();
        int nextDishToEat = everyDishNumberToEat;
        for (int a = 0; a < numberOfDishes; a++) {
            dishes.add(String.valueOf(a + 1));
        }
        dishes.forEach(a-> System.out.print(a + ", "));
        System.out.println();
        while (!dishes.isEmpty()) {
            if (dishes.contains(String.valueOf(nextDishToEat))) {
                eatenDishes.add(nextDishToEat);
                dishes.remove(String.valueOf(nextDishToEat));
                nextDishToEat += everyDishNumberToEat;
                System.out.print(nextDishToEat + ", ");
            } else {
                nextDishToEat++;
            }
            if (nextDishToEat > numberOfDishes) {
                nextDishToEat -= numberOfDishes;
            }
        }
        return eatenDishes;
    }
}
