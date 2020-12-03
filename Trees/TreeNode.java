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
	
// in-order traversal method	
	
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
	
	
}
