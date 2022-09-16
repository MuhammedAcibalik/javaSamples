package homeworks_w1;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Ankara";
		sehirler[0][2] = "İzmir";
		sehirler[1][0] = "Erzurum";
		sehirler[1][1] = "Çorum";
		sehirler[1][2] = "Amasya";
		sehirler[2][0] = "Tokat";
		sehirler[2][1] = "Adana";
		sehirler[2][2] = "Kayseri";
		
		for(int i = 0;i<3;i++) {
			for(int j = 0; j<3;j++) {
				System.out.println(sehirler[i][j]);
			}
			System.out.println("-------");
		}

	}

}
