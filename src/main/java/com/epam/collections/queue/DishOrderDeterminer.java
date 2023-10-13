package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        ArrayList<Integer> dishes = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            dishes.add(i);
        }
        LinkedList<Integer> eatenDishes = new LinkedList<>();
        //int totalCountOfIterationsBeforeAutoBreak = 0;
        int countForDishLoop = 1;
        while (eatenDishes.size() != dishes.size()) {
        /*totalCountOfIterationsBeforeAutoBreak++;
            if (totalCountOfIterationsBeforeAutoBreak > 100) {
                break;
            }*/
            for (int i = 0; i < dishes.size(); i++) {
                //System.out.println(countForDishLoop + "|" + i + "|" + dishes.get(i) + "||1");
                if (dishes.get(i) == 0) {
                    continue;
                }
                if (countForDishLoop == 4) {
                    countForDishLoop = 0;
                    //for (int a = 0; a < 100; a++) {
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
                    //}
                    //System.out.println(eatenDishes.getLast());
                    /*if (i == dishes.size()) {
                        countForDishLoop = 0;
                    }*/
                }
                countForDishLoop++;
                //System.out.println(countForDishLoop + "|" + i + "|" + dishes.get(i) + "||2");
            }
        }
        return eatenDishes;
    }
}
