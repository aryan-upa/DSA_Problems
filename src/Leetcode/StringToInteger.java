package Leetcode;

public class StringToInteger {

    public int convertNumToInt(StringBuilder builder, boolean isPos) {
            Long num = Long.parseLong(builder.toString());
            if (!isPos) num = -num;

            return num < Integer.MIN_VALUE ? Integer.MIN_VALUE : num > Integer.MAX_VALUE ? Integer.MAX_VALUE :
                            Integer.parseInt(String.valueOf(num));
    }

    public int myAToI(String s) {
        boolean isPos = true;

        StringBuilder builder = new StringBuilder();
        String trimmedS = s.trim();
        char[] ch = trimmedS.toCharArray();

        String digits = "0123456789";

        for(int i = 0; i < ch.length; i++) {
            if ((ch[i] < 48 || ch[i] > 57) && ch[i] != '+' && ch[i] != '-')
                return 0;

            else if (ch[i] == '-' || ch[i] == '+') {
                if (i + 1 >= ch.length || (ch[i+1] < 48 || ch[i+1] > 57))
                    return 0;
                // checking if the negative sign is followed by a number or not, if not then this -ive sign is useless.
                if (ch[i] == '-')
                    isPos = false;
            }

            else {
                while (i < ch.length) {
                    if (ch[i] < 48 || ch[i] > 57)
                        break;
                    builder.append(ch[i++]);
                }
                break;
            }
        }

        while (true) {
            if (builder.length() == 0)
                return 0;
            else if (builder.charAt(0) != '0')
                break;
            else
                builder.deleteCharAt(0);
        }

        if (builder.length() > 19)
            return isPos ? Integer.MAX_VALUE : Integer.MIN_VALUE;

        else if (builder.length() == 19)
            return !isPos && builder.toString().compareTo("9223372036854775808") >= 0 ? Integer.MIN_VALUE :
                    (builder.toString().compareTo("9223372036854775807") >= 0) ? Integer.MAX_VALUE :
                            convertNumToInt(builder, isPos);

        else
            return convertNumToInt(builder, isPos);
    }

}
