package homeworks_w1;

public class ArraysDemo {

	public static void main(String[] args) {
		
		String ogrenci1 = "Muhammed";
		String ogrenci2 = "Gökhan";
		String ogrenci3 = "Emirhan";
		String ogrenci4 = "Ahmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("----------------");
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Muhammed";
		ogrenciler[1] = "Gökhan";
		ogrenciler[2] = "Emirhan";
		ogrenciler[3] = "Ahmet";
		
		for(int i = 0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("-----------------");
		
		for(String ogr : ogrenciler) {
			System.out.println(ogr);
		}
	}

}
