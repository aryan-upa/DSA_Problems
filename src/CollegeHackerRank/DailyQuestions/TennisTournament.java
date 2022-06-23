package CollegeHackerRank.DailyQuestions;

import java.util.Scanner;

public class TennisTournament {

    public static void printRes(int numberofplayers, Scanner sc) {
        if(numberofplayers <= 2)
            System.out.println("NO");
        else {
            System.out.println("YES");
            String zeroString = "0";
            for (int i = 0; i < numberofplayers; i++) {
                StringBuilder resStr = new StringBuilder(zeroString.repeat(numberofplayers-1));
                resStr.insert((i+1)%numberofplayers,'1');
                System.out.println(resStr);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0) {
            int numberOfPlayer = sc.nextInt();
            printRes(numberOfPlayer, sc);
            T--;
        }
    }
} 