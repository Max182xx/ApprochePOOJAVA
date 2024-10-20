package fr.diginamic.recensement.comparer;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ComparerHabitants implements Comparator {

    Map mesClassementparhab;

    public ComparerHabitants(HashMap<String, Integer> mesRegionsparhab) {

        this.mesClassementparhab = mesRegionsparhab;

    }

    @Override
    public int compare(Object actuel, Object autre) {
        if ((Integer) mesClassementparhab.get(actuel) > (Integer) mesClassementparhab.get(autre)) {
            return -1;
        } else {
            return 1;
        }
    }

}
