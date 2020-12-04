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
		
//		Checking if everything works accordingly by inserting a new value in the tree.
		
		intTree.insert(17);
		
//		intTree.traverseInOrder();
//		
//		System.out.println();
//		
//		System.out.println(intTree.get(27));
//		System.out.println(intTree.get(17));
//		System.out.println(intTree.get(9));
		
		System.out.println(intTree.min());
		System.out.println(intTree.max());
	
	}			
}



