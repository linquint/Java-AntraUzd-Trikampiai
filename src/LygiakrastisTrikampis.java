public class LygiakrastisTrikampis extends Triangle {
    public LygiakrastisTrikampis(Line a) {
        this.l1 = a;
        int x = a.getP1().getX() + (int) (Math.cos(60) * a.length());
        int y = a.getP1().getY() + (int) (Math.sin(60) * a.length());
        this.l2 = new Line(a.getP1(), new Point(x, y));
        this.l3 = new Line(new Point(x, y), a.getP2());
    }
}
