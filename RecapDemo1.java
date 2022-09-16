package homeworks_w1;

public class RecapDemo1 {

	public static void main(String[] args) {
		int number1 = 100;
		int number2 = 101;
		int number3 = 102;
		int enBuyuk = number1;
		if (enBuyuk < number2) {
			enBuyuk = number2;
		}
		if (enBuyuk < number3) {
			enBuyuk = number3;
		}
		System.out.println("En büyük = " + enBuyuk);
	}
}
