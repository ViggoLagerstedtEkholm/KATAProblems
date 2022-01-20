package com.company.solution_7kyu;

import java.util.ArrayList;

public class NumberOfPeopleBus {
    public static int countPassengers(ArrayList<int[]> stops) {
        int peopleOnBusCount = 0;

        for(int[] people : stops){
            int peopleGetOn = people[0];
            int peopleGetOff = people[1];
            peopleOnBusCount += peopleGetOn;
            peopleOnBusCount -= peopleGetOff;
        }

        if(peopleOnBusCount < 0) return 0;

        return peopleOnBusCount;
    }
}
