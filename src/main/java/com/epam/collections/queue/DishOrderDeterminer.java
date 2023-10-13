package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        ArrayList<Integer> dishes = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            dishes.add(i);
        }
        LinkedList<Integer> eatenDishes = new LinkedList<>();
        int countForDishLoop = 1;
        while (eatenDishes.size() != dishes.size()) {
            for (int i = 0; i < dishes.size(); i++) {
                if (dishes.get(i) == 0) {
                    continue;
                }
                if (countForDishLoop == everyDishNumberToEat) {
                    countForDishLoop = 0;
                    while (true) {
                        if (dishes.get(i) != 0) {
                            eatenDishes.add(dishes.get(i));
                            dishes.set(i, 0);
                            break;
                        } else {
                            i++;
                            if (i >= dishes.size() - 1) {
                                i = 0;
                            }
                        }
                    }
                }
                countForDishLoop++;
            }
        }
        return eatenDishes;
    }
}
