package homeworks_w1;

public class RecapDemo2 {

	public static void main(String[] args) {
		double[] myList = {5.3, 6.4, 7.5, 8.6};
		double total = 0;
		double max = myList[0];
		for(double number : myList) {
			if(max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Toplam: " + total);
		System.out.println("En büyük: " + max);
	}
}
