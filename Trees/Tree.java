package Trees;

public class Tree {

	private TreeNode root;
	
	public void insert(int value) {
		if (root == null) {
			root = new TreeNode(value);
		}
		else {
			root.insert(value);
		}
	}
	
	public TreeNode get(int value) {
// if the root is not empty, search for the value here and return it.		
		
		if (root != null) {
			return root.get(value);
		}
// if we don't find the value, return null.		
		
		return null;
	}
	
	public int min() {
// if root is null, meaning this is an empty tree,
//		return smallest value in an integer.		
		
		if ( root == null ) {
			return Integer.MIN_VALUE;
		}
		
// else continue searching using the min() method we just created in the TreeNode class.		
		else {
			return root.min();
		}
	}
	
	public int max() {
		if ( root == null ) {
			return Integer.MAX_VALUE;
		}
		else {
			return root.max();
		}
	}
	
	
	
	public void traverseInOrder() {
		if (root != null) {
			root.traverseInOrder();
		}
	}
	
}
