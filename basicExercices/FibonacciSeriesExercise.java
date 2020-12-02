package basicExercices;

public class FibonacciSeriesExercise {

	int number1;
	int number2;
	int sum;
	int total;

	
		public void calculateFibonacci() {
		
			for (int i=1; i < total; ++i) {
		
				sum = number1 + number2;
				System.out.print(", " + number2);
				number1 = number2;
				number2 = sum;
		
			}
		}
		public int recursiveFibonacci(int total) {
			if (total <= 1) {
				return total;
			}
			return recursiveFibonacci(total - 1) + recursiveFibonacci(total - 2);
		}
}
