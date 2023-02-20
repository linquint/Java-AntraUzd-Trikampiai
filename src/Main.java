public class Main {
    public static void main(String[] args) {
        // 1d.4 - testuojama klasė
        Point p = new Point();
        Point p2 = new Point(5, 3);
        p.setX(3);
        p.setY(5);
        System.out.printf("Point: %f\n", p.distanceFromOrigin());
        System.out.printf("Point 2: %f\n", p2.distanceFromOrigin());

        // 2d.6
        Line l = new Line(p, p2);
        System.out.println("Linijos tarp taškų " + l + " ilgis = " + l.length());

        // 3 dalis
        Line l1 = new Line(new Point(1, 2), new Point(1, 6));
        Line l2 = new Line(new Point(1, 2), new Point(3, 2));
        Line l3 = new Line(new Point(3, 2), new Point(8, 4));
        Line l4 = new Line(new Point(1, 6), new Point(8, 4));
        Line l5 = new Line(new Point(1, 6), new Point(3, 2));

        System.out.println("\nStatusis trikampis");
        StatusisTrikampis st = new StatusisTrikampis(l1, l2);
        System.out.println("Pirma krastine: " + st.l1);
        System.out.println("Antra krastine: " + st.l2);
        System.out.println("Trecia krastine: " + st.l3);
        System.out.println("Plotas: " + st.area());

        System.out.println("\nLygiakraštis trikampis 1");
        LygiakrastisTrikampis lt = new LygiakrastisTrikampis(l1);
        System.out.println("Pirma krastine: " + lt.l1);
        System.out.println("Antra krastine: " + lt.l2);
        System.out.println("Trecia krastine: " + lt.l3);
        System.out.println("Plotas: " + lt.area());

        System.out.println("\nTrikampis");
        Triangle t1 = new Triangle(l3, l4, l5);
        System.out.println("Pirma krastine: " + t1.l1);
        System.out.println("Antra krastine: " + t1.l2);
        System.out.println("Trecia krastine: " + t1.l3);
        System.out.println("Plotas: " + t1.area());

        System.out.println("\nLygiakraštis trikampis 2");
        Triangle t2 = new LygiakrastisTrikampis(l4);
        System.out.println("Pirma krastine: " + t2.l1);
        System.out.println("Antra krastine: " + t2.l2);
        System.out.println("Trecia krastine: " + t2.l3);
        System.out.println("Plotas: " + t2.area());

        System.out.println("\nTrikampių plotų suma: " + Triangle.areaSum(new Triangle[]{st, lt, t1, t2}));
    }
}