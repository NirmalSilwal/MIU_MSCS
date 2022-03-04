package lesson5.problem5;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class Computer {

	String manufacturer;
	String processor;
	int ramSize;
	double processorSpeed;

	Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.processorSpeed = processorSpeed;
	}

	public int getRamSize() {
		return this.ramSize;
	}

	public double getProcessorSpeed() {
		return this.processorSpeed;
	}

	public double computePower() {
		return this.ramSize * this.processorSpeed;
	}

	@Override
	public String toString() {
		return "RAM size: " + this.getRamSize() + ", Processor Speed: " + this.getProcessorSpeed() + ", Compute power: "
				+ this.computePower();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		if (obj == this)
			return true;

		if (obj.getClass() != this.getClass())
			return false;

		Computer com = (Computer) obj;

		boolean result = this.manufacturer.equals(com.manufacturer) 
				&& this.processor.equals(com.processor)
				&& this.getRamSize() == com.getRamSize() 
				&& this.computePower() == com.computePower();

		return result;
	}

}
