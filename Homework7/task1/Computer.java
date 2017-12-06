package task1;

public class Computer {
	
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;
		
	Computer() {
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}
	
	Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		if (year > 0) {
			this.year = year;
		}
		if (price > 0) {
			this.price = price;
		}
		if (hardDiskMemory > 0) {
			this.hardDiskMemory = hardDiskMemory;
		}
		if (freeMemory > 0 && freeMemory <= hardDiskMemory) {
			this.freeMemory = freeMemory;
		}
	}

	Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem) {
		if (year > 0) {
			this.year = year;
		}
		if (price > 0) {
			this.price = price;
		}
		this.isNotebook = isNotebook;
		if (hardDiskMemory > 0) {
			this.hardDiskMemory = hardDiskMemory;
		}
		if (freeMemory > 0 && freeMemory <= hardDiskMemory) {
			this.freeMemory = freeMemory;
		}
		if (operationSystem != null && !operationSystem.isEmpty()) {
			this.operationSystem = operationSystem;
		}
	}
	
	int comparePrice(Computer c) {
		if (this.price > c.price) {
			return -1;
		}
		else {
			if (this.price < c.price) {
				return 1;
			}	
			else {
				return 0;
			}
		}	
	}
	
	void changeOperationSystem(String newOperationSystem) {
		if (newOperationSystem != null && !newOperationSystem.isEmpty()) {
			operationSystem  = newOperationSystem;
		}
	}
	
	void useMemory(int memory) {
		if (memory < 0) {
			System.out.println("Invalid value of the argument.");
		}
		else {
			if(memory > freeMemory) {
				System.out.println("Not enough free memory!");
				freeMemory = 0;
			}
			else {
				freeMemory -= memory;
			}
		}
	}
		
}