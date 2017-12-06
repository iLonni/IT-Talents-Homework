import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {7, 1, 6, 2, 4};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	static void selectionSort(int[] array) {
		int start = 0, 
			end = array.length - 1;
		for (int i = 0; i < array.length/2; i++) {	
			int minIndex = start,
				maxIndex = start;
			for (int j = start; j <= end; j++) {
				if (array[j] > array[maxIndex]) {
					maxIndex = j;
				}
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}	
			}
			int temp = array[maxIndex];
			array[maxIndex] = array[end];
			array[end] = temp;
			if (minIndex == end) {
				minIndex = maxIndex;
			}
			temp = array[minIndex];
			array[minIndex] = array[start];
			array[start] = temp;
			end --;
			start ++;	
			
		}
		
		
		
	}

}
