package lab7.lessson7.labs.prob2;

public interface Polygon extends ClosedCurve {

	public double[] getAllSides();

	default double computePerimeter() {

		double total = 0.0;

		for (double side : getAllSides()) {
			total += side;
		}

		return total;
	}

}
