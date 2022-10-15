/*
Trolls are attacking your comment section!
A common way to deal with this situation is to remove all of the vowels from the trolls' comments,
neutralizing the threat.
Your task is to write a function that takes a string and return a new string with all vowels removed.
For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
Note: for this kata y isn't considered a vowel.
 */
public class Troll {
    public static String disemvowel(String str) {
        char vowels[] = {'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u',};
        String trollString = "";
        boolean isVowel = false;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                isVowel = false;
                if (str.charAt(i) == vowels[j]) {
                    isVowel = true;
                    break;
                }
            }
                if (!isVowel){
                    trollString = trollString + str.charAt(i);
                }

        }
        // Code away...
        return trollString;
    }
}
