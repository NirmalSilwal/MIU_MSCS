package lesson11;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public interface MyADTList {

	void addLast(String str);

	boolean remove(String str);

	String get(int idx);

	void addAll(String[] col);

	boolean find(String s);

	public void insert(int index, String item);
}
