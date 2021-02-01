import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class BigWord {
    public String most(String[] sentences) {
        // you write code here
    // Convert to a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        // Fill the HashMap
        for (String sentence : sentences) {
            ArrayList<String> words = new ArrayList<>(Arrays.asList(sentence.split(" ")));
            for (String word: words) {
                map.putIfAbsent(word.toLowerCase(),0);
                map.put(word.toLowerCase(), map.get(word.toLowerCase())+1);
            }
        }
        int countWords = 0;
        String finalWord = "";
        for (String s : map.keySet()) {
/*            System.out.println(s);
            System.out.println(map.get(s).toString());*/
            int value = map.get(s);
            if (value > countWords) {
                countWords = value;
                finalWord = s;
            }
        }
        return finalWord;
    }

    public static void main(String[] args) {
        String [] sentences = {"one fish two", "fish red fish blue", "fish this fish is black"};
        BigWord trial = new BigWord();
        String result = trial.most(sentences);
        System.out.println(result);
    }
}
