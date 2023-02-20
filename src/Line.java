public class Line {
    private Point p1;
    private Point p2;

    public Line() {
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * Gražinami linijos pradžios ir pabaigos taškai formatu: [x1;y1] -> [x2;y2]
     * @return String Linijos pradžios ir pabaigos taškai
     */
    @Override
    public String toString() {
        return "[" + p1.getX() + ";" + p1.getY() + "]" + " -> " + "[" + p2.getX() + ";" + p2.getY() + "]";
    }

    /**
     * Apskaičiuoja linijos ilgį
     * @return double Linijos ilgis
     */
    public double length() {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }
}
