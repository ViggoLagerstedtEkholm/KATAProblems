package com.company.solution_7kyu;

public class ComplementaryDNA {
    public static String makeComplement(String dna) {
        String[] chars = dna.split("");
        StringBuilder complementaryDNA = new StringBuilder();

        for(String seq : chars){
            switch (seq){
                case "A":
                    complementaryDNA.append("T");
                    break;
                case "T":
                    complementaryDNA.append("A");
                    break;
                case "C":
                    complementaryDNA.append("G");
                    break;
                case "G":
                    complementaryDNA.append("C");
                    break;
            }
        }

        return complementaryDNA.toString();
    }
}
