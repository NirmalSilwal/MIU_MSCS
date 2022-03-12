package lesson8.prob3;

import java.util.Comparator;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

// sorting on the basis of salesamount

public class MarketingComparator implements Comparator<Marketing> {

	/*
	 * without considering consistency between equals and compare x
	 * 
	 * @Override public int compare(Marketing m1, Marketing m2) { return
	 * Double.compare(m1.getSalesamount(), m2.getSalesamount()); }
	 */

	// making Comparator consistent with equals
	@Override
	public int compare(Marketing m1, Marketing m2) {

		if (Double.compare(m1.getSalesamount(), m2.getSalesamount()) != 0) {
			return Double.compare(m1.getSalesamount(), m2.getSalesamount());
		} else if (m1.getEmployeename().compareTo(m2.getEmployeename()) != 0) {
			return m1.getEmployeename().compareTo(m2.getEmployeename());
		} else {
			return m1.getProductname().compareTo(m2.getProductname());
		}
	}
}
