package com.company;

import com.company.solution_4kyu.ConnectFour;
import com.company.solution_4kyu.Factorial;
import com.company.solution_4kyu.PathFinder;
import com.company.solution_4kyu.Snail;
import com.company.solution_5kyu.DirectionReduction;
import com.company.solution_5kyu.EscapeWithYourBooty;
import com.company.solution_5kyu.HumanReadableTIme;
import com.company.solution_5kyu.SatNavDir;
import com.company.solution_6kyu.*;
import com.company.solution_7kyu.*;
import com.company.solution_8kyu.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Object[] result = LongestConsecutiveRepetition.longestRepetition("aaaabb");
        System.out.println("Key: " + result[0]);
        System.out.println("Value: " + result[1]);
    }

    private static void pathFinder(){
        String d = "......\n"+
                "......\n"+
                "......\n"+
                "......\n"+
                ".....W\n"+
                "....W.";

        String a = ".W.\n"+
                ".W.\n"+
                "...";

        boolean path = PathFinder.pathFinder(a);
        System.out.println("PATH: " + path);
    }

    private static void bouncyBalls(){
        int seen = BouncyBalls.bouncingBall(3.0, 0.66, 1.5);

        System.out.println(seen);
    }

    private static void escapeWithYourBooty(){
        char[][] map = new char[5][6];
        char[] line1 = {'0','0','0','0','N','0'};
        char[] line2 = {'0','0','0','0','0','0'};
        char[] line3 = {'X','0','0','0','0','0'};
        char[] line4 = {'0','0','0','0','0','0'};
        char[] line5 = {'0','0','0','0','0','0'};
        map[0] = line1;
        map[1] = line2;
        map[2] = line3;
        map[3] = line4;
        map[4] = line5;

        boolean success = EscapeWithYourBooty.checkCourse(map);
        System.out.println("RESULT: " + success);
    }

    private static void countingDuplicates(){
        CountingDuplicates.duplicateCount("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZReturnsTwentySix");
    }

    private static void snail(){
        int[][] array1
                = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[][] array2
                = {{44, 231, 552, 797, 955, 88},
                {832, 494, 953, 138, 18, 203},
                {662, 153, 47, 696, 24, 484},
                {934, 738, 113, 917, 970, 409},
                {971, 994, 215, 502, 773, 490},
                {746, 635, 543, 407, 100, 781}
        };

        int[][] array3
                = {{809}};

        int[][] array4
                = {{951, 247, 972},
                {132, 948, 981},
                {537, 838, 377},
        };

        int[] result = Snail.snail(array4);

        System.out.println(Arrays.toString(array3));
        for (int j : result) {
            System.out.print(j + " ");
        }
    }

    private static void aWolfInSheepsClothing(){
        String result = AWolfInSheepsClothing.warnTheSheep(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"});
        System.out.println("result: " + result);
    }

    private static void creditCardMask(){
        String result = CreditCardMask.maskify("test1234");
        System.out.println("result: " + result);
    }

    private static void sortArr(){
        SortTheOdd.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 });
    }

    private static void directionReduction(){
        DirectionReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"});
    }

    private static void yourOrderPlease(){
        YourOrderPlease.order("is2 Thi1s T4est 3a");
    }

    private static void isIsogram(){
        boolean isIsogram = Isogram.isIsogram("Dermatoglyphics");
        System.out.println("isIsogram: " + isIsogram);
    }

    private static void getMiddleCharacter(){
        String result1 = GetMiddleCharacter.getMiddle("test");
        System.out.println("R1. " + result1);

        String result2 = GetMiddleCharacter.getMiddle("testing");
        System.out.println("R2. " + result2);
    }

    private static void windComponentCalc(){
        String message = WindComponentCalc.message("18L", 170, 15);
        System.out.println(message);
    }

    private static void whichAreIn(){
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        WhichAreIn.inArray(a,b);
    }

    private static void dRoot(){
        SumOfDigits.digital_root(16);
    }

    private static void satNavDirections(){
        final String[] directions = new String[] {
                "Head SOUTH",
                "Go straight on for 1.2km",
                "Take the 5th RIGHT",

                "You have reached your destination"
        };

        SatNavDir satNavDir = new SatNavDir();
        Point point = satNavDir.satNav(directions);
        System.out.println("X: " + point.x);
        System.out.println("Y: " + point.y);
    }

    private static void scoringTests(){
        //ScoringTests.sol();
    }

    private static void mexicanWave(){
        MexicanWave mexicanWave = new MexicanWave();
        String[] waved = mexicanWave.wave("two words");

        for (String s : waved) {
            System.out.println("res: " + s);
        }
    }

    private static void disemvowelTrolls(){
        DisemvowelTrolls disemvowelTrolls = new DisemvowelTrolls();
        String censored = disemvowelTrolls.disemvowel("This website is for losers LOL!");
        System.out.println(censored);
    }

    private static void getCount(){
        VowelCount vowelCount = new VowelCount();
        int count = vowelCount.getCount("abracadabra");
        System.out.println(count);
    }

    private static void connectFour(){
        ConnectFour connectFour = new ConnectFour();
        List<String> myList = new ArrayList<>(Arrays.asList(
                "A_Red",
                "B_Yellow",
                "A_Red",
                "B_Yellow",
                "A_Red",
                "B_Yellow",
                "G_Red",
                "B_Yellow"
        ));
        String winner = connectFour.whoIsWinner(myList);
        System.out.println(winner);
    }

    private static void consonantValue(){
        ConsonantValue consonantValue = new ConsonantValue();
        int highest = consonantValue.solve("zodiacs");
        System.out.println("Highest scoring: " + highest);

    }

    private static void highestScoringWord(){
        HighestScoringWord highestScoringWord = new HighestScoringWord();
        String result = highestScoringWord.high("bb d");
        System.out.println("Result: " + result);
    }

    private static void restaurantProblem(){
        RestaurantProblem restaurantProblem = new RestaurantProblem();
        String order = restaurantProblem.getOrder("milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza");
        System.out.println("ORDER: " + order);
    }

    private static void streetFighter(){
        String[][] fighters = new String[][]{
                new String[] { "Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega" },
                new String[] { "Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison" },
        };

        String[] moves = new String[] { "up", "left", "right", "left", "left" };

        StreetFighter2Characters streetFighter2Characters = new StreetFighter2Characters();
        String[] characters = streetFighter2Characters.streetFighterSelection(fighters, new int[] {0,0}, moves);

        System.out.println("Visited: ");
        for (String character : characters) {
            System.out.println(character);
        }

    }

    private static void encode(){
        DuplicateEncoder duplicateEncoder = new DuplicateEncoder();
        String encoded = duplicateEncoder.encode("(( @");
        System.out.println(encoded);
    }

    private static void multiTap(){
        MultiTap multiTap = new MultiTap();
        int totalSteps = multiTap.presses("1");
        System.out.println(totalSteps);
    }

    private static void factorial(){
        Factorial factorial = new Factorial();
        String result = factorial.factorial(100);
        System.out.println(result);
    }

    private static void reverseSentence(){
        Reverse reverse = new Reverse();
        String reversed = reverse.spinWords("Hey fellow warriors");
        System.out.println("Reversed: " + reversed);
    }

    private static void humanReadableTime(){
        HumanReadableTIme humanReadableTIme = new HumanReadableTIme();
        String converted = humanReadableTIme.makeReadable(86399);
        System.out.println("HH:MM:SS - " + converted);

    }

    private static void perfectSquare(){
        PerfectSquare perfectSquare = new PerfectSquare();
        perfectSquare.findNextSquare(121);
    }

    private static void areTheyTheSame(){
        AreTheyTheyTheSame areTheyTheyTheSame = new AreTheyTheyTheSame();
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        boolean same = areTheyTheyTheSame.comp(a, b);
        System.out.println("isSame: " + same);

    }

    private static void pangram(){
        PangramCheck panagramCheck = new PangramCheck();
        boolean isPangram = panagramCheck.check("The quick brown fox jumps over the lazy dog");
        System.out.println("isPangram: " + isPangram);

    }

    private static void square(){
        Square square = new Square();
        int result = square.squareDigits(9119);
        System.out.println("result: " + result);

    }

    private static void orderInt(){
        OrderInt orderInt = new OrderInt();
        int order = orderInt.orderInt(145263);
        System.out.println("ORDER: " + order);
    }

    private static void uppercase(){
        JadenCase uppercase = new JadenCase();
        String newString = uppercase.toJadenCase("How can mirrors be real if our eyes aren't real");
        System.out.println(newString);
    }

    private static void testFlip(){
        Flip flip = new Flip();
        int[] sorted = flip.Flip('L', new int[]{ 1,2,2,3 });

        for (int j : sorted) {
            System.out.println(j);
        }
    }
}
