public class Triangle {
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public int findBase() {
        int base = point1.calcDistance(point1, point2);
        return base;
    }

    public double () {
        
    }

    public double area() {
        return ( * findBase())/2;
    }
}