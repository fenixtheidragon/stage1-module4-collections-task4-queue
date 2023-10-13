package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        LinkedList<Integer> dishes = new LinkedList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            dishes.add(i);
        }
        LinkedList<Integer> eatenDishes = new LinkedList<>();
        //int totalCountOfIterationsBeforeAutoBreak = 0;
        int countForDishLoop = 1;
        while (!dishes.isEmpty()) {
            /*totalCountOfIterationsBeforeAutoBreak++;
            if (totalCountOfIterationsBeforeAutoBreak > 100) {
                break;
            }*/
            for (int i = 0; i < dishes.size(); i++) {
                //System.out.println(countForDishLoop + "|" + i + "|" + dishes.get(i) + "||1");
                if (countForDishLoop == 4) {
                    eatenDishes.add(dishes.remove(i));
                    //System.out.println(eatenDishes.getLast());
                    countForDishLoop = 1;
                    if (i == dishes.size()) {
                        countForDishLoop = 0;
                    }
                }
                countForDishLoop++;
                //System.out.println(countForDishLoop + "|" + i + "|" + dishes.get(i) + "||2");
            }
        }
        return eatenDishes;
    }
}
