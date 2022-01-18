package com.company.solution_8kyu;

import java.util.List;

public class MixedArray {
    public int sum(List<?> mixed) {
        int sum = 0;

        for(Object obj : mixed){
            if(obj instanceof String){
                sum += Integer.parseInt((String) obj);
            }else{
                sum += (int) obj;
            }
        }

        return sum;
    }
}
