package com.company.solution_6kyu;

public class PangramCheck {
    public boolean check(String sentence)
    {
        //26 characters in the English alphabet.
        boolean[] marks = new boolean[26];
        int index = 0;

        for(int i = 0; i < sentence.length(); i++)
        {
            char characterAtIndex = sentence.charAt(i);

            if(characterAtIndex >= 'A' && characterAtIndex <= 'Z')
            {
                index = characterAtIndex - 'A';
            }
            else if(characterAtIndex >= 'a' && characterAtIndex <= 'z')
            {
                index = characterAtIndex- 'a';
            }

            marks[index] = true;
        }

        for (boolean mark : marks) {
            if (!mark) return false;
        }

        return true;
    }
}
