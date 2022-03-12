package lesson8.prob1;

// Common task : Make sure to check your code should not throw any run time exception
public class MyPersonList {
	private final int INITIAL_LENGTH = 3;
	private Person[] PersonArray;
	private int size;

	// Default Constructor
	public MyPersonList() {
		PersonArray = new Person[INITIAL_LENGTH];
		size = 0;
	}

	// 1. Implement method to Add as last element, make sure you have enough room
	// else call resize()
	public void add(Person s) {

		if (s == null)
			return;
		if (size == PersonArray.length)
			resize();

		PersonArray[size] = s;
		size++;
	}

	// 2. get person information by passing index
	public Person get(int i) {

		if (i < 0 || i >= size)
			return null;

		return PersonArray[i];
	}

	// 3. Find the Person object using lastname
	public boolean find(String lastName) {

		if (lastName == null)
			return false;

		for (Person currentPerson : PersonArray) {
			if (currentPerson != null) {
				if (currentPerson.getLast().equals(lastName)) {
					return true;
				}
			}
		}

		return false;
	}

	// 4. Remove the person object by passing its lastname
	public boolean remove(String lastName) {

		if (size == 0)
			return false;
		if (lastName == null)
			return false;

		int foundIdx = -1;
		for (int i = 0; i < size; ++i) {
			if (PersonArray[i].getLast().equals(lastName)) {
				foundIdx = i;
				break;
			}
		}

		if (foundIdx == -1)
			return false;

		// left shift of object
		Person[] temp = new Person[PersonArray.length];
		System.arraycopy(PersonArray, 0, temp, 0, foundIdx);
		System.arraycopy(PersonArray, foundIdx + 1, temp, foundIdx, PersonArray.length - (foundIdx + 1));
		PersonArray = temp;

		size--;
		return true;
	}

	// 5. Resizing the list
	private void resize() {

		Person[] temp = new Person[PersonArray.length * 2];
		int idx = 0;
		for (Person currentPerson : PersonArray) {
			temp[idx++] = currentPerson;
		}

		// another way of copying object
//		System.arraycopy(PersonArray, 0, temp, 0, PersonArray.length);

		PersonArray = temp;
	}

	// To display all the persons list
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(PersonArray[i] + ", \n");
		}
		sb.append(PersonArray[size - 1] + "]");
		return sb.toString();
	}

	// Return the size
	public int size() {
		return size;
	}

	public static void main(String[] args) {
		MyPersonList list = new MyPersonList();
		list.add(new Person("Renuka", "Mohanraj", 36));
		list.add(new Person("Paul", "Corozza", 51));
		list.add(new Person("Joe", "Lermon", 53));
		list.add(new Person("Anne", "Dow", 55));
		System.out.println("Size() : " + list.size() + "\n" + list);
		list.remove("Mohanraj");
		System.out.println("\nSize() : " + list.size() + "\n" + list);
//	list.insert(new Person("Arun", "Jetlie", 32), 2);
		System.out.println("\n" + list.find("Dow"));
		System.out.println("\nSearching of Paul: " + list.find("Corozza"));
		System.out.println(list.get(2));
		System.out.println();
	}
}