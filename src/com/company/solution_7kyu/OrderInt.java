package com.company.solution_7kyu;

import java.util.Arrays;
import java.util.Collections;

public class OrderInt {
    public int orderInt(final int num){
        var n = Integer.toString(num).split("");
        Arrays.sort(n, Collections.reverseOrder());
        StringBuilder sortedString = new StringBuilder();
        for (String s : n) {
            System.out.println(s);
            sortedString.append(s);
        }

        return Integer.parseInt(sortedString.toString());
    }
}

