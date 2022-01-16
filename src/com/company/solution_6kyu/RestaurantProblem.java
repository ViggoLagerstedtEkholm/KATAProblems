package com.company.solution_6kyu;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RestaurantProblem {
    public String getOrder(String input) {
        String[] menu = new String[]{"Burger", "Fries", "Chicken", "Pizza", "Sandwich", "Onionrings", "Milkshake", "Coke"};
        StringBuilder finalOrder = new StringBuilder();

        System.out.println("OCCURRENCES");
        for (String s : menu) {
            String itemAtIndex = s.toLowerCase();

            Pattern p = Pattern.compile(itemAtIndex);
            Matcher m = p.matcher(input);

            while (m.find()) {
                finalOrder.append(s).append(" ");
                System.out.println(itemAtIndex);
            }
        }

        return finalOrder.toString().trim();
    }
}
