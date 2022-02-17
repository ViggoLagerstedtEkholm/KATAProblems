package com.company.solution_8kyu;

public class AlternateCasing {
    public static String toAlternativeString(String string) {
        char[] characters = string.toCharArray();
        StringBuilder alternateCasing = new StringBuilder();

        for(char character : characters){
            if(Character.isUpperCase(character)){
                Character.toLowerCase(character);
            }else{
                Character.toUpperCase(character);
            }
            alternateCasing.append(character);
        }

        return alternateCasing.toString();
    }
}
