package licao06;

public class TesteCarta {

	public static void main(String[] args) {
		Carta ct;
		try {
			ct = new Carta(4, 15);
			System.out.println(ct.toString());
		}catch (Exception e) {
			System.out.println(e.getMessage());	
		}
	}

}
