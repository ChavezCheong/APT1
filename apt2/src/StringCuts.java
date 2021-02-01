import java.util.ArrayList;
import java.util.Arrays;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        // replace this with your code
        ArrayList<String> holdingset = new ArrayList<>();
        for (String str : list) {
            if (str.length() >= minLength) {
                if (! holdingset.contains(str)) {
                    holdingset.add(str);
                }
            }
        }
        int arraylength = holdingset.size();
        String[] finalarray = holdingset.toArray(new String[arraylength]);

        return finalarray;
    }

    /*public static void main(String[] args) {
        String[] list = {"over", "and", "over", "and", "over"};
        int minLength = 3;
        StringCuts trial = new StringCuts();
        String[] output = trial.filter(list, minLength);
        System.out.println(Arrays.toString(output));
    }*/
}
