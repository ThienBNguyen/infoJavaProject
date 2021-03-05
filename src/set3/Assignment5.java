package set3;

public class Assignment5 {
	public static int[] findNumbers(int num1, int num2) {
		int[] numbers = new int[6];

		if(num1> num2) {
			//do something
		}
		i < 6 for lopp
		create array
		biiger to starting numger 
		// Implement your code here
		//two digit number 
		// deviable by 3
		//multible by by 5
		
		return numbers;
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;

		int[] numbers = findNumbers(num1, num2);
		if (numbers[0] == 0) {
			System.out.println("There is no such number!");
		} else {
			for (int index = 0; index <= numbers.length - 1; index++) {
				if (numbers[index] == 0) {
					break;
				}
				System.out.println(numbers[index]);
			}
		}

	}
}
