public class Square {

    private Point p1;
    private Point p2;
 

    public Square (Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
       
    }

    public calcPerim(Point p1, Point p2) {
        double distance = calcDistance(p1, p2);
        perimiter =  distance * 4;
        return perimiter;
    }

    public calcArea(Point p1, Point p2) {
        double distance = calcDistance(p1, p2);
        area =  distance * distance;
        return area;
    }

    

}