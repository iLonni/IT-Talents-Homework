package task1;

public class ComputerDemo {

	public static void main(String[] args) {
		
		Computer asus = new Computer();
		Computer lenovo = new Computer(2016, 1777, 1000, 700);
		Computer mac = new Computer(2014, 1777, 4000, 200);
		Computer hp = new Computer(2017, 1500, true, 1500, 100, "Linux Mint");
		
		System.out.println("We're going to compare the prices of HP and Lenovo. Result: ");
	
		switch(hp.comparePrice(lenovo)) {
			case -1: System.out.println("HP is more expensive than Lenovo.");
					break;
			case 0: System.out.println("Equal prices.");
					break;
			case 1: System.out.println("Lenovo is more expensive than HP.");
					break;		
			default: System.out.println("Invalid Prices.");
					break;
		}
		
		System.out.println();
		
		System.out.println("We're going to compare the prices of Lenovo and MAC. Result: ");
		
		switch(lenovo.comparePrice(mac)) {
			case -1: System.out.println("Lenovo is more expensive than MAC.");
					break;
			case 0: System.out.println("Equal prices.");
					break;
			case 1: System.out.println("MAC is more expensive than Lenovo.");
					break;		
			default: System.out.println("Invalid Prices.");
					break;
		}
		
	}

}