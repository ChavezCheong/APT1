
import java.util.*;

public class SimpleWordGame {
    public int points(String[] player,
                      String[] dictionary) {
        // you write code here
        HashSet<String> playerSet = new HashSet<>(Arrays.asList(player));

        ArrayList<String> dictionaryList = new ArrayList<>(Arrays.asList(dictionary));
        int scoreCounter = 0;
        for (String playerElement : playerSet) {
            if (dictionaryList.contains(playerElement)) {
                scoreCounter += playerElement.length() * playerElement.length();
            }
        }
    return scoreCounter;
    }

   public static void main(String[] args) {
        String[] player = {"apple", "orange", "strawberry"};
        String[] dictionary = {"strawberry", "orange", "grapefruit", "watermelon"};
        SimpleWordGame trial = new SimpleWordGame();
        int result = trial.points(player, dictionary);
        System.out.println(result);
   }

}
