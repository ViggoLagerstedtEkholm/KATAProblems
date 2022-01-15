package com.company;

public class DisemvowelTrolls {
    public String disemvowel(String str) {
        String[] words = str.split(" ");
        StringBuilder censoredSentence = new StringBuilder();

        for (String word : words) {
            StringBuilder censoredWord = new StringBuilder();
            String[] segments = word.split("");

            for (String segment : segments) {
                if (!isVowel(segment)) {
                    censoredWord.append(segment);
                }
            }
            censoredSentence.append(censoredWord).append(" ");
        }
        return censoredSentence.toString().trim();
    }

    private boolean isVowel(String character){
        String[] vowels = "aeiou".split("");

        for (String vowel : vowels) {
            if (vowel.equals(character) || vowel.toUpperCase().equals(character)) return true;
        }
        return false;
    }
}
