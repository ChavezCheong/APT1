import java.lang.reflect.Array;
import java.util.Arrays;

public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        // change this code
        int[] occurrenceList = new int[words.length];
        String[] strArray = str.split(" ");
        int arrayMarker = 0;
        for (String word : words) {
            int counter = 0;
            for (String testString : strArray) {
                if (testString.equals(word)) {
                    counter ++;
                }
            }
            occurrenceList[arrayMarker] = counter;
            arrayMarker ++;
        }
        return occurrenceList;
    }

    /*public static void main(String[] args) {
        String testStr = "a a a b b c";
        String[] words = {"d", "c", "b", "a"};
        int[] occurrenceCount = analyze(testStr, words);
        System.out.println(Arrays.toString(occurrenceCount));
    }*/

}
