package com.company.solution_7kyu;

import java.util.ArrayList;
import java.util.List;

public class ListFiltering {

    // Return the List with the Strings filtered out.
    public static List filterList(final List list) {
        List<Object> items = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) instanceof Integer){
                items.add(list.get(i));
            }
        }
        return items;
    }
}
