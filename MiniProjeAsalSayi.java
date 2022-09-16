package homeworks_w1;

public class MiniProjeAsalSayi {

	 public static void main(String[] args) {
	        int number = 19;
	        int remainder = number % 2;
	        System.out.println(remainder);
	        boolean isPrime = true;
	        if(number==1){
	            System.out.println("Sayı Asal Değildir");
	            return;
	        }
	        if (number < 2) {
	            System.out.println("Geçersiz Sayı");
	            return;
	        }
	            for (int i = 2; i < number; i++) {

	                if (number % i == 0) {
	                    isPrime = false;
	                }
	            }
	            System.out.println("Girilen Sayı Asal : " + isPrime);
	    }
}