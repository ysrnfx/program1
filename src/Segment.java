public class Segment {
    Point first;
    Point second;

    public Segment(Point first){
        this.first = first;

    }
    public void setFirst(Point first) {
        this.first = first;
    }

    public void setSecond(Point second) {
        this.second = second;
    }
    public Point getFirst() {
        return first;
    }

    public Point getSecond() {
        return second;
    }

    public double getDist(){
        return Math.hypot(first.x - second.x, first.y - second.y);
        //return Math.sqrt(Math.pow(first.x - second.x, 2) + Math.pow(first.y - second.y, 3));
    }

}
