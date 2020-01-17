public class Square {

    private Point p1;
    private Point p2;
  
 

    public Square (Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        
    }

    public double perimeter(Point p1, Point p2) {
        double distance = Point.calcDistance(p1, p2);
        perimiter =  distance * 4;
        return perimiter;
    }

    public double area(Point p1, Point p2) {
        double distance = Point.calcDistance(p1, p2);
        area =  distance * distance;
        return area;
    }

    public static boolean isOverlap(Square sq1, Square sq2) {
        yBound1 = sq1.p1.getY();
        yBound2 = sq1.p2.getY();
        xBound1 = sq1.p1.getX();
        xBound2 = sq1.p2.getX();

        y2Bound1 = sq2.p1.getY();
        y2Bound2 = sq2.p2.getY();
        x2Bound1 = sq2.p1.getX();
        x2Bound2 = sq2.p2.getX();

        if (y2Bound1 > yBound1 && y2Bound1 < yBound2 && x2Bound1 > xBound1 && x2Bound1 < xBound2) {
            return true;
        } 
        if (y2Bound2 > yBound1 && y2Bound2 < yBound2 && x2Bound2 > xBound1 && x2Bound2 < xBound2 ) {
            return true;
        }
        if (y2Bound2 > yBound1 && y2Bound2 < yBound2 && x2Bound1 > xBound1 && x2Bound1 < xBound2 ) {
            return true;
        }
        if (y2Bound1 > yBound1 && y2Bound1 < yBound2 && x2Bound2 > xBound1 && x2Bound2 < xBound2 ) {
            return true;
        }
        return false;


    }

    

}