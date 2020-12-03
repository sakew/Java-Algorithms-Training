import Trees.Tree;

public class Main {

	public static void main(String[] args) {
			
		Tree intTree = new Tree();
		
//		The values for the tree are: { 25, 20, 15, 27, 30, 29, 26, 22, 32 }
		
		intTree.insert(25);
		intTree.insert(20);
		intTree.insert(15);
		intTree.insert(27);
		intTree.insert(30);
		intTree.insert(29);
		intTree.insert(26);
		intTree.insert(22);
		intTree.insert(32);
		
		intTree.traverseInOrder();
		
	}			
}



