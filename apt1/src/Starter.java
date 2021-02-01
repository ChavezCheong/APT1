import java.util.Arrays;
import java.util.HashSet;

public class Starter {
    public int begins(String[] words, String first) {
        // replace this code
        int runningCount = 0;
        HashSet<String> set = new HashSet<>(Arrays.asList(words));
        for (String word : set) {
            String firstLetter = word.substring(0, 1);
            if (firstLetter.equals(first)) {
                runningCount++;
            }
        }
        return  runningCount;

        /*String[] checkrepeat = {};
        int runningcount = 0;
        for (String word : words) {
            if (word.substring(0, 1).equals(first)) {
                if (Arrays.asList(checkrepeat).contains(word)) {
                    runningcount += 0;
                }
                else {
                    runningcount += 1;
                    checkrepeat = Arrays.copyOf(checkrepeat, checkrepeat.length + 1);
                    checkrepeat[checkrepeat.length - 1] = word;
                }
            }
        }
        return runningcount;*/
    }
}
