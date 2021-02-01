public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r, int x1, int y1, int x2, int y2) {
    //check the number of circles surrounding point (x1,y1) and (x2,y2) and make sure they're not in the same circle
    int bordercount = 0;
    for (int i = 0; i< x.length; i++) {
        if ( isInside(x1, y1, x[i], y[i], r[i]) ^ isInside(x2, y2, x[i], y[i], r[i])) {
            bordercount += 1;
        }
    }
    return bordercount;
    }

    public boolean isInside(int x, int y, int cx, int cy, int r){
        double dist = (x-cx)*(x-cx) + (y-cy)*(y-cy);
        double radSquared = r*r;
        return dist < radSquared;
    }
}
