package Trees;

public class TreeNode {

	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;
	

//	TreeNode constructor for object initialization.	
	
	public TreeNode(int data) { this.data = data; }
	
//	node insertion method	
	
	public void insert(int value) {
		if (value == data) {
			return;
		}
		
		if (value < data) {
			if (leftChild == null) {
				leftChild = new TreeNode(value);
			}
			else {
				leftChild.insert(value);
			}
		}
		else {
			if (rightChild == null) {
				rightChild = new TreeNode(value);
			}
			else {
				rightChild.insert(value);
			}
		}
	}
	
	public TreeNode get(int value) {
		
// if value = data --> we found the item we wanted
		
		if (value == data) {
			return this;
		}

// if value smaller than data return the value from the left child		
		
		if (value < data) {
			if (leftChild != null) {
				return leftChild.get(value);
			}
		}
		
// if the value is not in the leftChild then we search and return the rightChild.		
		else {
			if (rightChild != null) {
				return rightChild.get(value);
			}
		}
// if we didn't find the value we were looking for return null.		
		return null;
	}
	
// in-order traversal method	
	
	public int min() {
// we traverse the entire left side to reach the outermost leaf with the smallest value.
		if (leftChild == null) {
			return data;
		}
		else {
			return leftChild.min();
		}
	}
	
	public int max() {
// we traverse the entire right side to reach the outermost leaf with the biggest value.		
		if (rightChild == null) {
			return data;
		}
		else {
			return rightChild.max();
		}
	}
	
	public void traverseInOrder() {
		// visit leftChild, root, rightChild
		if (leftChild != null) {
			leftChild.traverseInOrder();
		}
		System.out.print(data + ", ");
		if (rightChild != null) {
			rightChild.traverseInOrder();
		}
	}
	
//	getters and setters for the Node.
	
	public int getData() { return data; }
	
	public void setData(int data) { this.data = data; }
	
	public TreeNode getLeftChild() { return leftChild; }
	
	public void setLeftChild(TreeNode leftChild) { this.leftChild = leftChild; }
	
	public TreeNode getRightChild() { return rightChild; }
	
	public void setRightChild(TreeNode rightChild) { this.rightChild = rightChild; }

	@Override
	public String toString() {
		return "Data= " + data;
	}
	
	
}
