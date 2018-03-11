public class process {
    public static void main(String[] args) {
        System.out.println("Preparing to calculate");
        double sarea;
        double carea;
        double res;
        double bests = 0;
        double bestc = 0;
        double bestr = 10000000000.0;
        for(double s=0; s<100000; s+=.001) {  
            for (double r=0; r<100000; r+=.001) {
                sarea = Math.pow(s, 2);
                carea = Math.PI*Math.pow(r, 2);
                res = Math.abs(sarea-carea);
                if (res<bestr) {
                    bestr = res;
                    bests = sarea;
                    bestc = carea;
                    System.out.println("New best result found:");
                    System.out.println("Square Area: " + sarea);
                    System.out.println("Circle Area: " + carea);
                    System.out.println("Difference: " + res);
                    System.out.println();
                }
            }
            if (s%1000 == 0) {
                System.out.println(100*(s/100000) + "% complete");
            }
        }
        System.out.println();
        System.out.println("Mathematic operation complete");
        System.out.println("\nBest results:");
        System.out.println("Square Area: " + bests);
        System.out.println("Circle Area: " + bestc);
        System.out.println("Difference: " + bestr);
    }
}