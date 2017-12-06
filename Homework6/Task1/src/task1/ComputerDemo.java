package task1;

public class ComputerDemo {

	public static void main(String[] args) {
		
		Computer asus = new Computer();
		Computer lenovo = new Computer();
		
		asus.year = 2017;
		asus.price = 1446.99;
		asus.hardDiskMemory = 1500;
		asus.freeMemory = 100;
		asus.isNotebook = false;
		asus.operationSystem = "Windows 10";
				
		lenovo.year = 2016;
		lenovo.price = 1777;
		lenovo.hardDiskMemory = 1000;
		lenovo.freeMemory = 700;
		lenovo.isNotebook = true;
		lenovo.operationSystem = "Linux Mint";
		
		lenovo.useMemory(100);

		asus.changeOperationSystem("Mac OS");
		
		System.out.println("Asus: ");
		System.out.println("Year: " + asus.year);
		System.out.println("Price: " + asus.price);
		System.out.println("Hard disk memory: " + asus.hardDiskMemory);
		System.out.println("Free memory: " + asus.freeMemory);
		System.out.println("Notebook? " + asus.isNotebook );
		System.out.println("Operation system: " + asus.operationSystem);
	
		System.out.println();
		
		System.out.println("Lenovo: ");
		System.out.println("Year: " + lenovo.year);
		System.out.println("Price: " + lenovo.price);
		System.out.println("Hard disk memory: " + lenovo.hardDiskMemory);
		System.out.println("Free memory: " + lenovo.freeMemory);
		System.out.println("Notebook? " + lenovo.isNotebook );
		System.out.println("Operation system: " + lenovo.operationSystem);

	}

}
