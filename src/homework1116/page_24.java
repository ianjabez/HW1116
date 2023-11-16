package homework1116;

public class page_24 {

	public static void main(String[] args) {
		Car car1;
		car1 = new Car();
		
		car1.setCar(1234, 20.5);
		car1.show();
		System.out.println("只更變車號");
		car1.setCar(2345);
		car1.show();
		System.out.println("只更汽油量");
		car1.setCar(30.5);
		car1.show();
	}
}
