/*
In this little assignment you are given a string of space separated numbers,
and have to return the highest and lowest number.
 */
public class Kata2 {
    public static String highAndLow(String numbers) {
        String numString[] = numbers.split(" ");
        int min = Integer.parseInt(numString[0]);
        int max = Integer.parseInt(numString[0]);

        for (int i = 0; i < numString.length; i++) {
            if (min > Integer.parseInt(numString[i])){
                min = Integer.parseInt(numString[i]);
            }
            if (max < Integer.parseInt(numString[i])){
                max = Integer.parseInt(numString[i]);
            }

        }
        return max + " " + min;
    }
}
