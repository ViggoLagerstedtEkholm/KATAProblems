package com.company.solution_6kyu;

public class DuplicateEncoder {
    public String encode(String word){
        String[] characters = word.toLowerCase().split("");

        StringBuilder finalString = new StringBuilder();

        for (String charAtIndex : characters) {
            boolean exists = isDuplicate(characters, charAtIndex);

            if(exists){
                finalString.append(")");
            }
            else{
                finalString.append("(");
            }
        }

        return finalString.toString();
    }

    private boolean isDuplicate(String[] characters, String character){
        int limit = 0;
        for (String characterInArray : characters) {
            if (characterInArray.equals(character)) {
                limit++;
            }

            if(limit >= 2){
                return true;
            }
        }
        return false;
    }
}
