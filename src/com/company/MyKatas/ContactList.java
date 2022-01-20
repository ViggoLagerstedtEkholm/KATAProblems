package com.company.MyKatas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContactList {
    public static List<String> getSortedAndCategorised(String[] contacts){
        List<String> sortedAndCategorised = new ArrayList<>();
        Arrays.sort(contacts);
        String currentCategory = "";

        for (String contact : contacts) {
            String currentFirstLetter = contact.substring(0, 1).toUpperCase();
            if (!currentFirstLetter.equals(currentCategory)) {
                currentCategory = currentFirstLetter;
                sortedAndCategorised.add(currentCategory);
            }
            sortedAndCategorised.add(contact);
        }

        return sortedAndCategorised;
    }
}
