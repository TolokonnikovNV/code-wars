import java.util.Arrays;
import java.util.Comparator;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String strNum = Integer.toString(num);
        String sortedNum = "";
        int digitsNum = strNum.length();
        Integer[] n = new Integer[digitsNum];
        int nunTemp = num;

        for (int i = 0; i < digitsNum; i++) {
            n[i] = nunTemp % 10;
            nunTemp = nunTemp / 10;
        }

        Arrays.sort(n, Comparator.reverseOrder());

        for (int i = 0; i < digitsNum; i++) {
            sortedNum = sortedNum + n[i];
        }

        return  Integer.parseInt(sortedNum);
    }
}
