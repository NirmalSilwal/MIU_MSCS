package examPractice.lesson7;

public enum ConstantsEnumdDemo {

	COMPANY("MICROSOFT"), SALES_TARGET(10000000.0);

	private String svalue;
	private Double dvalue;

	ConstantsEnumdDemo(String com) {
		svalue = com;
	}

	ConstantsEnumdDemo(Double sales) {
		dvalue = sales;
	}

	public String getCompany() {
		return svalue;
	}

	public double getSalesTarget() {
		return dvalue;
	}
}
