public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        long spaceCounter = 0;
        for (int fileSize: sizes) {
            if (fileSize != 0) {
                if (fileSize % clusterSize != 0) {
                    spaceCounter += (fileSize / clusterSize) + 1;
            } else {
                spaceCounter += fileSize / clusterSize;
            }
        }
        }
        return  spaceCounter * clusterSize;
    }

    public static void main(String[] args) {
        int[] files = {1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000};
        int clusterSize = 1;
        TrueSpace test = new TrueSpace();
        long spaceRequired = test.calculateSpace(files, clusterSize);
        System.out.println(spaceRequired);
    }
}
