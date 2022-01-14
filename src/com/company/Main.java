package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        arrayDiff();
    }

    private static void arrayDiff(){
        ArrayDiff arrayDiff = new ArrayDiff();
        int[] result = arrayDiff.arrayDiff(new int[] {1, 2}, new int[] {1});

        //for (int j : result) {
            //System.out.println(j);
        //}
    }

    private static void getCount(){
        VowelCount vowelCount = new VowelCount();
        int count = vowelCount.getCount("abracadabra");
        System.out.println(count);
    }

    private static void removeDuplicates(){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        String res = removeDuplicates.removeConsecutiveDuplicates("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta");
        System.out.println(res);
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

    private static void ballUpwards(){
        BallUpwards ballUpwards = new BallUpwards();
        int height = ballUpwards.maxBall(37);
        System.out.println("Height: " + height);
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

    private static void getSum(){
        GetSum getSum = new GetSum();
        getSum.getSum(1, 5);
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

    private static void findEvenIndex(){
        FindEvenIndex findEvenIndex = new FindEvenIndex();
        findEvenIndex.findEvenIndex(new int[] {1,2,3,4,3,2,1});
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
        Uppercase uppercase = new Uppercase();
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
