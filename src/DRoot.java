/*
Given n, take the sum of the digits of n.
If that value has more than one digit,
continue reducing in this way until a single-digit number is produced.
The input will be a non-negative integer.
 */
public class DRoot {
    public static int digital_root(int n) {
        int sum = 0;
        int numberDigit = 0;
        int nTemp = n;

        while (true) {
            if (nTemp / 10 > 0) {
                nTemp = nTemp / 10;
                numberDigit++;
            } else {
                break;
            }
        }

        for (int i = 0; i <= numberDigit; i++) {
            sum = sum + (n % 10);
            n = n / 10;
        }

        if (sum >= 10) {
            return digital_root(sum);
        } else {
            return sum;
        }

    }
}
