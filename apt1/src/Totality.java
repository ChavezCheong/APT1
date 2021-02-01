public class Totality {
    public int sum(int[] a, String stype) {
        int runningsum = 0;
        if (stype.equals("odd")) {
            for (int i = 1; i < a.length; i+= 2) {
                runningsum += a[i];
            }
        }    else if (stype.equals("even")) {
            for (int i = 0; i < a.length; i+= 2) {
                runningsum += a[i];
            }
        }
        else {
            for (int i = 0; i < a.length; i ++) {
                runningsum += a[i];
            }
        }
        return runningsum;
    }

     /*public static void main(String[] args) {
         Totality tot = new Totality();
         int[] a = {22, 23};
         System.out.println(tot.sum(a, "even"));
     }*/
}
