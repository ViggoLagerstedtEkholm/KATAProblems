package com.company.solution_6kyu;

public class MexicanWave {
    public String[] wave(String str) {
        String[] waved = new String[str.replaceAll("\\s+","").length()];
        int index = 0;
        int pos = 0;
        while(index < str.length()){
            if (str.charAt(index) != ' ') {
                String updated = str.substring(0, index) + Character.toUpperCase(str.charAt(index)) + str.substring(index + 1);
                waved[pos] = updated;
            }
            index++;
        }

        return waved;
    }
}
