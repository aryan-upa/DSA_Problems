package CodeStudio.recursionContest2ByMohammadFraz;


// TLE: Unsolved
public class C10555 {
    public static String kthValueHelper(int n, String string) {
        if(n-- == 0)
            return string;

        StringBuilder stringNew = new StringBuilder();

        for (char c : string.toCharArray()) {
            if (c == '1')
                stringNew.append("10");
            else
                stringNew.append("01");
        }

        return kthValueHelper(n, stringNew.toString());
    }

    public static int kthValue(int n, int k) {
        String finalString = kthValueHelper(n, "1");
        return Integer.parseInt(String.valueOf(finalString.charAt(k-1)));
    }

    public static void main(String[] args) {
        System.out.println(kthValue(4, 5));
    }
}
