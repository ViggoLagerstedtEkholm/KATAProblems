package com.company;

public class Main {

    public static void main(String[] args) {
        reverseSentence();
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

        for(int i = 0; i < sorted.length; i++){
            System.out.println(sorted[i]);
        }
    }
}
