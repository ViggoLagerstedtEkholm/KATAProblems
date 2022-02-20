package com.company.solution_8kyu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExpressionsMatter {
    public static int expressionsMatter(int a, int b, int c)
    {
        List<Integer> values = new ArrayList<>();
        values.add(a + b + c);
        values.add(a * b * c);
        values.add((a + b) + c);
        values.add(a + (b + c));

        Collections.sort(values);
        return values.get(values.size() - 1);
    }
}
