package com.robin.task;

import com.robin.model.Package;

/**
 * Created by Rober on 05.04.2016.
 */
public class PromotionCalculator {
    // zwraca procent promocji. Jesli nie ma to 0
    public static int calculate(Package pack) {
        if(pack.getItem().getName().equals("lustro")) {
            if(pack.getAmount() > 10) {
                return 8;
            } else if(pack.getAmount() > 20) {
                return 15;
            }
        }



        return 0;

    }
}
