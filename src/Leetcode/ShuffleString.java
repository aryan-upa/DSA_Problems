package Leetcode;

public class ShuffleString {

    public String restoreString(String s, int[] indices) {
        char[] ch = s.toCharArray();
        char[] shuffled = new char[s.length()];

        for(int i = 0; i < shuffled.length; i++)
            shuffled[indices[i]] = ch[i];

        return new String(shuffled);
    }

}
