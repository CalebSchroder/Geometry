public class Square {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Square(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    public static double getSide(Point point1, Point point2) {
        return Point.calcDistance(point1, point2);
    }

    public double calcPerimeter() {
        double side1 = Point.calcDistance(point1, point2);
        double side2 = Point.calcDistance(point2, point3);
        double side3 = Point.calcDistance(point3, point4);
        double side4 = Point.calcDistance(point4, point1);
        return side1 + side2 + side3 + side4;
    }

    public double calcArea() {
        double area = Point.calcDistance(point1, point2) * Point.calcDistance(point2, point3);
        return area;        
    }
}