package lab5.problem3;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a BST that handles Integer data. The insert method has been modified
 * to allow duplicates.
 */
public class MyBST {
	/** The tree root. */
	private Node root;

	// start with an empty tree
	public MyBST() {
		root = null;
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order.
	 */
	public void printTree() {
		if (root == null)
			System.out.println("[]");
		else
			printTree(root);
	}

	private void printTree(Node t) {
		if (t != null) {
			printTree(t.left);
			System.out.println(t.element);
			printTree(t.right);
		}
	}

	// //// find methods
	public boolean find(Integer x) {
		if (x == null)
			return false;
		return find(x, root);
	}

	private boolean find(Integer x, Node n) {
		if (n == null)
			return false;
		if (n != null && n.element.equals(x))
			return true;
		return (x.compareTo(n.element) < 0) ? find(x, n.left) : find(x, n.right);
	}

	// returns null if root is null
	public Integer findMax() {
		return findMax(root).element;

	}

	// node will be stored in position 0; parent will be stored in position 1
	private Node[] findNodeWithParent(Integer x) {
		if (x == null)
			return null;
		return findNodeWithParent(x, root, null);
	}

	private Node[] findNodeWithParent(Integer x, Node n, Node parent) {
		if (n == null)
			return null;
		Node[] nodes = new Node[2];
		if (n != null && n.element.equals(x)) {
			nodes[0] = n;
			nodes[1] = parent;
			return nodes;
		}
		if (x.compareTo(n.element) < 0) {
			return findNodeWithParent(x, n.left, n);
		} else {
			return findNodeWithParent(x, n.right, n);
		}
	}

	// returns the Node with max value in the tree determined by Node node
	private Node findMax(Node node) {
		Node n = node;
		while (n != null) {
			if (n.right == null) {
				return n;
			} else {
				n = n.right;
			}
		}
		return null;
	}

	// returns null if root is null
	public Integer findMin() {
		return findMin(root).element;

	}

	private Node findMin(Node node) {
		Node n = node;
		while (n != null) {
			if (n.left == null) {
				return n;
			} else {
				n = n.left;
			}
		}
		return null;

	}

	// /////////// delete methods

	public boolean delete(Integer x) {
		Node[] toDeleteAndParent = findNodeWithParent(x);
		if (toDeleteAndParent != null) {
			Node node = toDeleteAndParent[0];
			Node parent = toDeleteAndParent[1];

			// node to delete has two children
			if (node.left != null && node.right != null) {
				return deleteNodeTwoChildren(node, parent);

				// node to delete is a leaf node
			} else if (node.left == null && node.right == null) {
				return deleteLeaf(node, parent);

				// node to delete has just one child
			} else { // exactly one of these is not null
				return deleteNodeOneChild(node, parent);
			}
		}
		return false;
	}

	private boolean deleteNodeOneChild(Node n, Node parent) {
		Node child = (n.right == null) ? n.left : n.right;
		if (parent == null) { // root is node to be deleted; it has one child;
								// this child now becomes the root
			root = child;
		} else {
			if (parent.right == n)
				parent.right = child;
			else if (parent.left == n)
				parent.left = child;
			else {
				throw new RuntimeException("Unable to locate node to be deleted in relation to its parent");
			}
			n = null;
		}
		return true;
	}

	private boolean deleteNodeTwoChildren(Node n, Node parent) {
		Node rightChild = n.right;
		Node minBelowRight = findMin(rightChild);
		Integer minBelowRightElement = minBelowRight.element;
		delete(minBelowRight.element);
		n.element = minBelowRightElement;
		return true;
	}

	private boolean deleteLeaf(Node n, Node parent) {
		if (parent != null) { // node is root in that case
			if (parent.left == n) {
				parent.left = null;
			} else if (parent.right == n) {
				parent.right = null;
			}
			n = null;
		} else { // Node n is the root; make tree empty
			root = null;
		}
		return true;
	}

	public boolean isLeaf(Integer x) {
		Node n = findNodeWithParent(x)[0];
		return isLeafNode(n);
	}

	private boolean isLeafNode(Node n) {
		if (n == null)
			return false;
		return n.left == null && n.right == null;
	}

	// /////insertion methods

	// This version allows duplicates
	public void insert(Integer x) {
		if (root == null) {
			root = new Node(x, null, null);
		} else {
			Node n = root;
			boolean inserted = false;
			while (!inserted) {
				if (x.compareTo(n.element) < 0) {
					// space found on the left
					if (n.left == null) {
						n.left = new Node(x, null, null);
						inserted = true;
					} else {
						n = n.left;
					}
				}

				else if (x.compareTo(n.element) >= 0) {
					// space found on the right
					if (n.right == null) {
						n.right = new Node(x, null, null);
						inserted = true;
					} else {
						n = n.right;
					}
				}

			}

		}
	}

	// ///////// testing

	public static void main(String[] args) {
		MyBST bst = new MyBST();
		for (int i = 15; i >= 0; --i) {
			bst.insert(new Integer(2 * i));
			bst.insert(new Integer(2 * i - 5));
		}
		bst.printTree();
		System.out.println("Is 24 in the tree? " + bst.find(new Integer(24)));
		System.out.println("Is 27 in the tree? " + bst.find(new Integer(27)));

		System.out.println("Min: " + bst.findMin());
		System.out.println("Is -5 a leaf? " + bst.isLeaf(-5));
		bst.delete(-5);
		bst.printTree();
		// bst2
		MyBST bst2 = new MyBST();
		System.out.println("\n\nNew tree:\n");
		populate(bst2);
		bst2.printTree();
		// delete a leaf
		bst2.delete(150);
		System.out.println("\nAfter deleting 150...\n");
		bst2.printTree();
		// delete node with one child
		bst2.delete(75);
		System.out.println("\nAfter deleting 75...\n");
		bst2.printTree();
		// delete node with two children
		bst2.delete(37);
		System.out.println("\nAfter deleting 37...\n");
		bst2.printTree();

	}

	private static void populate(MyBST tree) {
		tree.insert(50);
		tree.insert(25);
		tree.insert(75);
		tree.insert(12);
		tree.insert(37);
		tree.insert(28);
		tree.insert(100);
		tree.insert(150);
		tree.insert(48);
		tree.insert(45);
		tree.insert(43);
	}

	// //////// Node class

	private class Node {

		/////////////// Constructors

		@SuppressWarnings("unused")
		Node(Integer theElement) {
			this(theElement, null, null);
		}

		Node(Integer element, Node left, Node right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}

		private Integer element; // The data in the node
		private Node left; // Left child
		private Node right; // Right child
	}

	public List<Integer> toArray() {
		List<Integer> result = new ArrayList<>();
		return toArrayBis(root, result);
	}

	// we get sorted output by doing the inorder traversal in BST
	private List<Integer> toArrayBis(Node t, List<Integer> result) {
		if (t != null) {
			toArrayBis(t.left, result);
			result.add(t.element);
			toArrayBis(t.right, result);
		}
		return result;

	}
}