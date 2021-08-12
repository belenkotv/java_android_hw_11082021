package org.example;

import java.util.ArrayList;

public class MainApp {

    static public int[] task1(int[] array) throws RuntimeException {
        ArrayList<Integer> calc = new ArrayList();
        int i = array.length - 1;
        for (; i>=0; i--) {
            if (array[i] == 4) {
                break;
            }
            calc.add(0, array[i]);
        }
        if (i < 0) {
            throw new RuntimeException();
        }
        int [] ret = new int[calc.size()];
        for (int j = 0; j < calc.size(); j++) {
            ret[j] = calc.get(j);
        }
        return ret;
    }

    static public boolean task2(int[] array) {
        boolean hasOne = false;
        boolean hasFour = false;
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case 1:
                    hasOne = true;
                    break;
                case 4:
                    hasFour = true;
                    break;
                default:
                    return false;
            }
        }
        return hasOne && hasFour;
    }

}
