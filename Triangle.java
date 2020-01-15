public class Triangle {
    public static void main (String[] args) {
        Point point1 = new Point();
        Point point2 = new Point();
        Point point3 = new Point();

        int base = point1.calcDistance(point1, point2);
        int slantHeight = point2.calcDistance(point2, point3);
        int height = (slantHeight * slantHeight) - (base * base);
        
        int area = (base * height)/2;
        System.out.println("Area: " + area);
    }
}