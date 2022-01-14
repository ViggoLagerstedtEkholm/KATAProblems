package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConsonantValue {
    public int solve(final String string) {
        String[] val = Arrays.stream(string.split("[aeiou]")).toArray(String[]::new);


        int max = 0;
        for (String wordAtIndex : val) {
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
            }
        }

        return max;
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
