package com.company;

public class Reverse {
    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder newSentence = new StringBuilder();

        for (String word : words) {
            StringBuilder newWord = new StringBuilder();
            if(word.length() > 4){
                for (int j = word.length() - 1; j >= 0; j--) {
                    newWord.append(word.charAt(j));
                }
            }else{
                newWord.append(word);
            }

            newSentence.append(newWord).append(" ");
        }
        return newSentence.toString().trim();
    }
}
