package lesson7;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public abstract class ClosedCurve {

	abstract double computeArea();

	// dynamic binding happens at runtime

	// open-closed principle

	/*
	 * abstract - when you want to say what to do not how to do go with abstract
	 * 
	 * Rule - you cannot create object for the abstract class, you cannot
	 * instantiate abstract class else you will get the error
	 * "cannot instantiate the type"
	 * 
	 * don't make abstract class constructor as private
	 */
}
