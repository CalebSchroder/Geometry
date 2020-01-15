public class Triangle {
    private Point point1;
    private Point point2;
    private Point point3;
    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;

        int base = point1.calcDistance(point1, point2);
        int slantHeight = point2.calcDistance(point2, point3);
        int height = (slantHeight * slantHeight) - (base * base);
        
        int area = (base * height)/2;
    }
}