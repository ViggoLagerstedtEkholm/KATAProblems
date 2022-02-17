package com.company.solution_6kyu;

import java.util.List;

public class SmileFaces {
    public static int countSmileys(List<String> arr) {
        int validSmileys = 0;

        for(String smiley : arr){
            int len = smiley.length();
            boolean validSmiley = false;

            if(len == 2){
                String eyes = smiley.substring(0, 1);
                String mouth = smiley.substring(1, 2);

                if(validEyes(eyes) && validMouth(mouth)) validSmiley = true;
            }else if(len == 3){
                String eyes = smiley.substring(0, 1);
                String nose = smiley.substring(1, 2);
                String mouth = smiley.substring(2, 3);

                System.out.println("EYES: " + eyes);
                System.out.println("NOSE: " + nose);
                System.out.println("MOUTH: " + mouth);

                if(validEyes(eyes) && validNose(nose) && validMouth(mouth)) validSmiley = true;
            }

            if(validSmiley){
                validSmileys++;
            }
        }

        return validSmileys;
    }

    private static boolean validEyes(String eyes){
        return eyes.equals(":") || eyes.equals(";");
    }

    private static boolean validNose(String nose){
        return nose.equals("-") || nose.equals("~");
    }

    private static boolean validMouth(String mouth) {
        return mouth.equals(")") || mouth.equals("D");
    }
}
