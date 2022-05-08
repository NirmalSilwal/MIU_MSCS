package lab7.lessson7.labs.prob2;

public class EquilateralTriangle implements Polygon {

	private double side;

	public EquilateralTriangle(double side) {
		this.side = side;
	}

	public double getSide() {
		return this.side;
	}
	@Override
	public double[] getAllSides() {
		return new double[] { getSide(), getSide(), getSide() };
	}

}
