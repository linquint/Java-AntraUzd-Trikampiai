public class Point {
    private int x;
    private int y;

    public Point() {}
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Apskaičiuoja ir grąžina taško atstumą nuo koordinačių pradžios taško (0; 0)
     * @return double Atstumas iki taško (0; 0)
     */
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    /**
     * Pastumamios taško x ir y koordinatės
     * @param dx int Per kiek vienetų pastumti x koordinatę
     * @param dy int Per kiek vienetų pastumti y koordinatę
     */
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    /**
     * Gražinamos taško koordinatės [x;y] formatu
     * @return String Taško koordinatės
     */
    @Override
    public String toString() {
        return "[" + x + ";" + y + "]";
    }

    /**
     * Patikrina, taškas yra lygus duotam taškui
     * @param p Point Taškas su kuriuo lyginama
     * @return boolean true, jei taškai vienodi, kitu atveju - false
     */
    public boolean equals(Point p) {
        return p.x == x && p.y == y;
    }

    /**
     * Atstumas tarp dviejų taškų
     * @param p Point Taškas, iki kurio skaičiuojamas atstumas
     * @return double Atstumas tarp taškų
     */
    public double distance(Point p) {
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }

    /**
     * Pakeičiamos taško koordinatės
     * @param x int Nauja taško x koordinatė
     * @param y int Nauja taško y koordinatė
     */
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
