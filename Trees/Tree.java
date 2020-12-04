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
	
	public void delete(int value) {
		root = delete(root, value);
	}
	
	private TreeNode delete(TreeNode subtreeRoot, int value) {
		
// 		there is no subtreeRoot, return the current value;
		
		if (subtreeRoot == null) {
			return subtreeRoot;
		}
		
//		if the value of the subtreeRoot is smaller than the current value, delete the left child value
//		from the tree.
		
		if (value < subtreeRoot.getData()) {
			subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
		}

//		if the value of the subtreeRoot is higher than the current value, delete the right child value
//		from the tree.
		
		else if (value > subtreeRoot.getData()) {
			subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
		}
		else {
			
//		Cases in which node to delete has 0 or 1 child / children;
//		if the right child is null meaning that this is a leaf, we don't need to set anything,
//		just leave it null.			
		
			if (subtreeRoot.getLeftChild() == null) {
				return subtreeRoot.getRightChild();
			}
			else if (subtreeRoot.getRightChild() == null) {
				return subtreeRoot.getLeftChild();
			}
		}
//		return the subtreeRoot with the new values set after the operations are done.
		
		return subtreeRoot;
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
