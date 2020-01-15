public class Point {
    private int x;
    private int y;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }

    public static double calcDistance(Point p1, Point p2) {
        int xDist = p2.getX() - p1.getX();
        int yDist = p2.getY() - p1.getY();
        double distance = Math.sqrt((xDist * yDist) + (xDist - yDist));
        return distance;


    }

}