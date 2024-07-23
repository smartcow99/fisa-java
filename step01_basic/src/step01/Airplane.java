package step01;

public class Airplane {
	String name;
	static int total = 0;

	public Airplane(String name) {
		this.name = name;
		total = total+1;
	}

	static void showTotalCars() {
		System.out.println("구매한 비행기 수: " + total);

	}

	public static void main(String[] args) {
		Airplane airplane1 = new Airplane("boeing486");
		System.out.println("비행기이름 : " + airplane1.name);

		Airplane.total = 2938;
		System.out.println(airplane1.name + "의 total : " + airplane1.total);

		Airplane airplane2 = new Airplane("airbus127");
		System.out.println("비행기이름 : " + airplane2.name);

		Airplane airplane3 = new Airplane("wooriair98");
		System.out.println("비행기이름 : " + airplane3.name);

		Airplane.showTotalCars();
	}

}