package CodeStudio;

public class C3744737 {
    public static int countVowels(String str) {
        char[] chars = str.toLowerCase().toCharArray();
        String vowels = "aeiou";
        int count = 0;
        for(char c : chars)
            if (vowels.indexOf(c) != -1)
                count++;
        return count;
    }

    public static Boolean splitString(String str) {
        String s1 = str.substring(0, str.length()/2);
        String s2 = str.substring(str.length()/2);
        return countVowels(s1) == countVowels(s2);
    }
}
