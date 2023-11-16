package homework1116;

public class page_22 {

	public static void main(String[] args) {
		Car car1;
		car1 = new Car();
		
		car1.setNumGas1(1234, 20.5);
		car1.show();
		
		System.out.println("指定不正確的汽油量(-10.0)看看");
		car1.setNumGas1(1234, -10.0);
		car1.show();
	}
}
