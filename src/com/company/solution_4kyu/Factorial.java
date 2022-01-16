package com.company.solution_4kyu;

import java.math.BigInteger;

public class Factorial {
    public String factorial(int number) {
        if(number < 0) return null;

        //Use long datatype, factorial numbers gets massive very fast.
        BigInteger fact = BigInteger.ONE;

        //Calculate the factorial for the number n.
        for(int i = 1 ; i <= number; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
            System.out.println(fact);
        }

        //Return String datatype.
        return fact.toString();
    }
}
