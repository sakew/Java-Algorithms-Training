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
//		for inOrder traversal we visit leftChild, root, rightChild

//		leftChild
		
		if (leftChild != null) {
			leftChild.traverseInOrder();
		}
		
//		root
		
		System.out.print(data + ", ");

//		rightChild
		
		if (rightChild != null) {
			rightChild.traverseInOrder();
		}
	}
	
//		for PreOrder traversal we visit the root, leftChild, rightChild	
	public void traversePreOrder() {

// 		this is the root
		
		System.out.print(data + ", ");

//		this is the leftChild
		
		if (leftChild != null) {
			leftChild.traversePreOrder();
		}

//		this is the rightChild		
		
		if (rightChild != null) {
			rightChild.traversePreOrder();
		}
	}
	
//		for PostOrder traversal we visit the leftChild, rightChild, root	
	
	public void traversePostOrder() {		
		
		if (leftChild != null) {
			leftChild.traversePostOrder();
		}
		
		if (rightChild != null) {
			rightChild.traversePostOrder();
		}
		System.out.print(data + ", ");
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
