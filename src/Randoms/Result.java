package Randoms;

import java.io.*;
import java.util.*;

class Result {

    public static String getPhoneNumber(String s) {
        StringBuilder resultingString = new StringBuilder();
        StringTokenizer tokens = new StringTokenizer(s, " ");
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("one", 1);
        stringIntegerMap.put("two", 2);
        stringIntegerMap.put("three", 3);
        stringIntegerMap.put("four", 4);
        stringIntegerMap.put("five", 5);
        stringIntegerMap.put("six", 6);
        stringIntegerMap.put("seven", 7);
        stringIntegerMap.put("eight", 8);
        stringIntegerMap.put("nine", 9);
        stringIntegerMap.put("zero", 0);

        while(tokens.hasMoreTokens()) {
            String nextToken = tokens.nextToken();
            if(nextToken.equals("double")) {
                Integer inDigit = stringIntegerMap.get(tokens.nextToken());
                resultingString.append(inDigit.toString().repeat(2));
            }
            else if (nextToken.equals("triple")) {
                Integer inDigit = stringIntegerMap.get(tokens.nextToken());
                resultingString.append(inDigit.toString().repeat(3));
            }
            else
                resultingString.append(stringIntegerMap.get(nextToken));
        }

        return resultingString.toString();
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String result = Result.getPhoneNumber(line);
        System.out.println(result);
    }
}
