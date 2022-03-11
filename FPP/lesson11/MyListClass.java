package lesson11;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class MyListClass implements MyADTList {

	String[] col;
	private int size;
	private final int IN_SIZE = 5;

	MyListClass() {
		col = new String[IN_SIZE];
		size = 0;
	}

	public void addLast(String str) {
		if (str == null)
			return;
		if (size == col.length)
			resize();
		col[size] = str;
		size++;
	}

	private void resize() {
		String[] newcol = new String[col.length * 2];
		int id = 0;

		for (String s : col) {
			newcol[id++] = s;
		}
//		 System.arraycopy(col, 0, newcol, 0, col.length);
// 		Arrays.copyOf(col, col.length * 2);

		col = newcol;
	}

	public boolean remove(String s) {
		if (size == 0)
			return false;
		if (col == null)
			return false;

		int index = -1;
		
		String[] temp = new String[col.length - 1];
		
		for(int i = 0; i < col.length; i++) {
			if (col[i].equals(s)) {
				index = i;
				break;
			}
		}
		int i;
		for (i = 0; i < index; i++) {
			temp[i] = col[i];
		}
		
		size--;
		return false;
	}

	public String get(int idx) {
		if (idx < 0 || idx > size) {
			System.out.println("invalid index");
			return null;
		}
		return col[idx];
	}

	public void addAll(String[] col) {

	}

	public boolean find(String s) {
		if (s == null)
			return false;

		for (String word : col) {
			if (word.equals(s))
				return true;
		}

		return false;
	}

	public void insert(int index, String item) {
		if (index < 0 || index > size - 1)
			return;
		if (item == null)
			return;
		if (index == col.length - 1 || size + 1 > col.length)
			resize();

		String[] temp = new String[col.length + 1];
		int i;
		for (i = 0; i < index; i++) {
			temp[i] = col[i];
		}
		temp[i] = item;
		for (int j = index + 1; j < temp.length; j++) {
			temp[j] = col[j];
		}

		col = temp; // pointing original array to newly made temp array
		size++;
	}

}
