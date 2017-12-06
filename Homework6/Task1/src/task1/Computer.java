package task1;

public class Computer {
	
	int year = 0;
	double price = 0.00;
	boolean isNotebook = false;
	int hardDiskMemory = 0;
	int freeMemory = 0;
	String operationSystem = " ";
	
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
