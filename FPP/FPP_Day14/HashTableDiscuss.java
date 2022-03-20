package lesson14;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class HashTableDiscuss {

	/*
	 * Hashtable can implement with the help of array data structure. Array we
	 * follow index based approach to store and retrieve. Index is int value.
	 * 
	 * Hashtable concept -
	 * 
	 * index based approach - index identified using some hashcode
	 * 
	 * to store on hash table
	 * 
	 * 1.we need the key
	 * 
	 * 2.find the index to store hashcode of the key % table size
	 * 
	 * key is an object type
	 * 
	 * way to deal hash collision - probing and separate chaining
	 * 
	 * if key is an integer then you can directly apply key % table
	 * 
	 * if key is an Object, you can calculate the hashcode of the object by
	 * Math.abs(key.hashCode()) % tablesize
	 * 
	 * advantage of using hashtable is to perform fast insertion and deletion
	 * operation
	 * 
	 * disadvantage is you cannot do the sorting, always you need table size or
	 * capacity
	 * 
	 * rehasing - doubling hash table size
	 * 
	 * whenever you override equals() method you should also override the hashCode()
	 * method
	 * 
	 * Hash technique APIs
	 * 
	 * 1. HashSet - implements Set interface
	 * 
	 * 2. HashMap - implements Map interface
	 * 
	 * 3. HashTable - implements Map interface
	 */

	class Entry {

	}

	public static void main(String[] args) {
		Entry[] entries = new Entry[26];

	}
}
