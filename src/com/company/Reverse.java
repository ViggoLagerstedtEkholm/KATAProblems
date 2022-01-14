package com.company;

public class Reverse {
    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder newSentence = new StringBuilder();

        //Go through all the words in the array.
        for (String word : words) {
            StringBuilder newWord = new StringBuilder();

            //If the current word has over 4 characters...
            if(word.length() > 4){
                //Reverse the string...
                for (int j = word.length() - 1; j >= 0; j--) {
                    newWord.append(word.charAt(j));
                }
            }else{
                //The current word is smaller than 4 characters... Just add it to the new sentence without reversing it.
                newWord.append(word);
            }

            //Add spaces after words.
            newSentence.append(newWord).append(" ");
        }

        //Trim the last space after the last word.
        return newSentence.toString().trim();
    }
}
