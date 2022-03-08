package hwsort.taska;

import java.util.Comparator;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class NameComparator implements Comparator<DeptEmployee> {

	@Override
	public int compare(DeptEmployee o1, DeptEmployee o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
