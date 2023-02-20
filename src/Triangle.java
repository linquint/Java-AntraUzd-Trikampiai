public class Triangle {
    protected Line l1;
    protected Line l2;
    protected Line l3;

    public Triangle() {
    }

    public Triangle(Line l1, Line l2, Line l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    /**
     * Apskaičiuoja trikampio plotą pagal Herono formulę
     * @return double Trikampio plotas
     */
    public double area() {
        double s = (l1.length() + l2.length() + l3.length()) / 2;
        return Math.sqrt(s * (s - l1.length()) * (s - l2.length()) * (s - l3.length()));
    }

    /**
     * Apskaičiuoja duotų trikampių plotų sumą
     * @param triangles Triangle[] Trikampių masyvas
     * @return double Trikampių plotų suma
     */
    static double areaSum(Triangle[] triangles) {
        double sum = 0;
        for (Triangle t:triangles) {
            sum += t.area();
        }
        return sum;
    }
}