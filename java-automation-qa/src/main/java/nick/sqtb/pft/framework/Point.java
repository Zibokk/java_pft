package nick.sqtb.pft.framework;

public class Point {

    public double x;
    public double y;


    public Point(double p1, double p2) {

       this.x = p1;
       this.y = p2;
    }

    public double distance() {
        return Math.sqrt(this.x + this.y);
//        return Math.sqrt(Math.pow(x-this.x, 2) + Math.pow(y-this.y, 2));
    }

}
