package homework1116;

public class page_05 {

	public static void main(String[] args) {
		Car car1;
		car1 = new Car();
	}
}

class Car{
	int num;
	double gas;
	public static int sum = 0;
	private String name;
	void show() {
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
		System.out.println("車名是" + name);
	}
	void showCar() {
		System.out.println("開始顯示車子資料");
		this.show();
	}
	void setNum(int n) {
		num = n;
		System.out.println("將車號設為" + num);
	}
	void setGas(double g) {
		gas = g;
		System.out.println("將汽油量設為" + gas);
	}
	void setNumGas0(int n,double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為" + num + ",將汽油量設為" + gas);
	}
	int getNum() {
		System.out.println("調查車號");
		return num;
	}
	double getGas() {
		System.out.println("調查汽油量");
		return gas;
	}
	public void setNumGas1(int n,double g) {
		if(g>0 && g<100) {
			num = n;
			gas = g;
			System.out.println("將車號設為" + num + ",將汽油量設為" + gas);
		}
		else {
			System.out.println(g + "不是正確的汽油量");
			System.out.println("無法更變汽油量");
		}
	}
	public void setCar(int n) {
		num = n;
		System.out.println("將車號設為" + num);
	}
	public void setCar(double g) {
		gas = g;
		System.out.println("將汽油量設為" + gas);
	}
	public void setCar(int n,double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為" + num + ",將汽油量設為" + gas);
	}
	public Car() {
		num = 0;
		gas = 0.0;
		sum++;
		name = "沒有名稱";
		System.out.println("生產了車子");
	}
	public Car(int n,double g) {
		this();
		num = n;
		gas = g;
		System.out.println("生產了車子車號為" + num + ",汽油量為" + gas + "的車子");
	}
	public static void showSum() {
		System.out.println("車子總共有" + sum + "台");
	}
	public void setName(String nm) {
		name = nm;
		System.out.println("將車名設為:" + name);
	}
}
