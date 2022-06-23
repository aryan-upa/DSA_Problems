package CollegeHackerRank;

import java.util.Scanner;

public class PasswordChecker {

    public static boolean checkLength(String s, int len) {
        return s.length() > len;
    }

    public static boolean doesItStartWithNumber(String s) {
        return !(48 <= (int) s.charAt(0) && (int) s.charAt(0) <= 57);
    }

    public static void isValidPassword() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        boolean isFourLong, has1Number, has1Capital, hasNoSpaceOrSlash, doesNotStartWithNumber;

        has1Number = has1Capital = false;
        hasNoSpaceOrSlash = true;

        isFourLong = checkLength(s, 4);
        doesNotStartWithNumber = doesItStartWithNumber(s);

        for (char c : s.toCharArray()) {
            if(65 <= (int) c && (int) c <= 90)
                has1Capital = true;
            if( 48 <= (int) c && (int) c <= 57)
                has1Number = true;
            if((int) c == 32 || (int) c == 47)
                hasNoSpaceOrSlash = false;
        }

        printRes(has1Number && has1Capital && hasNoSpaceOrSlash && isFourLong && doesNotStartWithNumber);
    }

    public static void printRes(boolean res) {
        if(res)
            System.out.println(1);
        else
            System.out.println(0);
    }

    public static void main(String[] args) {
        isValidPassword();
    }
}