public class Gravity {
    public double falling(double time, double velo){
        // fill in code here
        return velo * time + 0.5* 9.8 * Math.pow(time, 2);
    }
}
