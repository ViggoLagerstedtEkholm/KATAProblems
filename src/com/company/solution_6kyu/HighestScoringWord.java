package com.company.solution_6kyu;

import java.util.Locale;

public class HighestScoringWord {
    public String high(String s) {
        String[] words = s.toLowerCase().split(" ");

        String highestScoring = "";
        int max = 0;

        //For every word...
        for (String wordAtIndex : words)
        {
            int sum = 0;
            //For every character in that word...
            for (int j = 0; j < wordAtIndex.length(); j++)
            {
                char charAtIndex = wordAtIndex.charAt(j);
                int value = GetWordSize(charAtIndex);

                //Add character value to the sum for the whole word.
                sum += value;
            }

            //Check if the new sum is more than the max.
            if(sum > max){
                max = sum;
                highestScoring = wordAtIndex;
            }
        }

        return highestScoring;
    }

    private int GetWordSize(char character){
        int value = 0;
        if(character >= 'A' && character <= 'Z')
            value = (int)character - 'A' + 1;
        if(character >= 'a' && character <= 'z'){
            value = (int)character - 'a'+ 1;
        }
        return value;
    }
}
