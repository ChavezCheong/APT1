public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        // fill in code here
        StringBuilder s = new StringBuilder();
        for (int element : rights) {
            if (element < minPermission) {
                s = s.append("D");
            }
            else {
                s = s.append("A");
            }
        }
        return s.toString();
    }
    /*public static void main(String[] args) {
        int[] a = {5,3,2,10,0};
        AccessLevel acc = new AccessLevel();
        System.out.println(acc.canAccess(a, 3));
    }*/
}
