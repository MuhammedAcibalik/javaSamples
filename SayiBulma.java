package homeworks_w1;

public class SayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 3, 6, 7, 8, 9 };
		int aranacak = 9;
		boolean isTrue = false;
		for (int i = 0; i < sayilar.length; i++) {
			if (aranacak == sayilar[i]) {
				isTrue = true;
				break;
			}
		}
		if (isTrue) {
			System.out.println("Sayı mevcut");

		} else
			System.out.println("Sayı yok");
	}
}
