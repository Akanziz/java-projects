
class Line {

    private final Point point;

    private final Vector direction;

    public Line(Point point, Vector direction) {
        this.point = point;
        this.direction = direction;
    }

    private String formatTerm(double coefficient, String variable) {
        if (coefficient == 0) {
            return "";
        } else if (coefficient == 1) {
            return " + " + variable;
        } else if (coefficient == -1) {
            return " - " + variable;
        } else if (coefficient > 0) {
            return " + " + coefficient + variable;
        } else {
            return " - " + Math.abs(coefficient) + variable;
        }
    }

    public String paramX() {
        double x0 = point.getX();
        double a = direction.getA();
        return "x = " + x0 + formatTerm(a, "t");
    }

    public String paramY() {
        double y0 = point.getY();
        double b = direction.getB();
        return "y = " + y0 + formatTerm(b, "t");
    }

    public String paramZ() {
        double z0 = point.getZ();
        double c = direction.getC();
        return "z = " + z0 + formatTerm(c, "t");
    }

    public double[][] parameterize() {
        double x0 = point.getX();
        double y0 = point.getY();
        double z0 = point.getZ();
        double a = direction.getA();
        double b = direction.getB();
        double c = direction.getC();

        return new double[][] {
                {x0, a},
                {y0, b},
                {z0, c}
        };
    }
}
