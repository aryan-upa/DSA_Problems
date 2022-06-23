// AC

package CodeChef.START25C;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class POLIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {

            int numberOfPoints = sc.nextInt();

            Set<Long> XSet = new HashSet<Long>();
            Set<Long> YSet = new HashSet<Long>();

            for (int i = 0; i < numberOfPoints; i++) {
                XSet.add(sc.nextLong());
                YSet.add(sc.nextLong());
            }

            long XLines = XSet.size();
            long YLines = YSet.size();

            System.out.println(XLines + YLines);

            T--;
        }
    }
}
