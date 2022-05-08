package lab7.lessson7.labs.prob2;

public class Ellipse implements ClosedCurve {

	private double a, E;

	public Ellipse(double semiMajor, double eccentric) {
		this.a = semiMajor;
		this.E = eccentric;
	}

	@Override
	public double computePerimeter() {
		return 4 * a * E;
	}

	public double getA() {
		return a;
	}

	public double getE() {
		return E;
	}

}
