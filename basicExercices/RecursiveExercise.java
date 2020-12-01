package basicExercices;

public class RecursiveExercise {

	public int nonRecursiveFactorialMethod(int num) {
			
		if ( num == 0) {
			return 1;
		}
		
		int factorial = 1;
		
		for ( int i = 1; i <= num; i++ ) {
			factorial *= i;
		}
		
		return factorial;
	}
	
	public int recursiveFactorialMethod( int num ) {
		if ( num == 0 ) {
			return 1;
		}
		return num * recursiveFactorialMethod(num - 1);
	}
	
}
