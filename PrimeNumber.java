package week_1;

public class PrimeNumber {
	void isPrimeNumber(int input) {
		boolean isPrimeNumber = false;
		for (int i = 2; i <= input / 2; i++) {
			if (input % i == 0) {
				isPrimeNumber = true;
			}
			break;
		}

		if (!isPrimeNumber) {
			System.out.println("Input is a prime number");
		} else {
			System.out.println("Input is not a prime number");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber pn = new PrimeNumber();
		pn.isPrimeNumber(5);
		pn.isPrimeNumber(4);
		pn.isPrimeNumber(7);

	}

}
