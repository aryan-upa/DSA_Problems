// Project Euler 254

package Randoms;

import java.util.Scanner;

public class SumsOfDigitFactorial {

    // this stores the values of the factorial from 0 to 9 for faster access.
    static int[] factVal = new int[]{1,1,2,6,24,120,720,5040,40320,362880};

    public static int digVal(char c) {
        return Integer.parseInt("" + c);
    }

    public static int doDigitSum(String s) {
        int sum = 0;
        for (char c: s.toCharArray()) {
            sum += digVal(c);
        }
        return sum;
    }

    public static String factorialValue(long factorialValue) {
        String factorialNumString = String.valueOf(factorialValue);
        long value = 0;
        for (char c: factorialNumString.toCharArray()){
            value += factVal[digVal(c)];
        }
        return String.valueOf(value);
    }

    public static long whatFactor(int valueOfEachN) {
        boolean notFoundThatFactorial = true;
        long factorialValue = 0;
        while(notFoundThatFactorial) {
            String number = factorialValue(factorialValue);
            int digitSum = doDigitSum(number);
            if(digitSum == valueOfEachN) {
                notFoundThatFactorial = false;
                System.out.println("Factorial number for " + valueOfEachN + " is : " + factorialValue +
                        " having sum of factorials sum as : " + number + " So digit sum is -> " + digitSum);
            }
            else
                factorialValue++;
        }
        return factorialValue;
    }

    public static long doOperation(long N, long M) {
        long result = 0;
        for (int i = 1; i <= N; i++) {
            long factor = whatFactor(i);
            String factorString = String.valueOf(factor);
            result += doDigitSum(factorString);
            if(result > M)
                result -= M;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases > 0) {
            long Q = sc.nextInt();
            long M = sc.nextInt();
            System.out.println(doOperation(Q,M));
            testCases--;
        }
    }
}
