public class StatusisTrikampis extends Triangle {
    public StatusisTrikampis(Line a, Line b) {
        this.l1 = a;
        this.l2 = b;
        this.l3 = (a.getP1().equals(b.getP1())) ? new Line(a.getP2(), b.getP2()) :
                (a.getP1().equals(b.getP2())) ? new Line(a.getP2(), b.getP1()) :
                        (a.getP2().equals(b.getP1())) ? new Line(a.getP1(), b.getP2()) : new Line(a.getP1(), b.getP1());
    }
}
