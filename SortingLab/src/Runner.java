import java.util.Arrays;

public class Runner {
	public static void main(String[] args)
	{
		//testng arrays
		int[] test1 = {1, 4, 4, 5, 2, 4, 3, 17, 0};
		double[]test2 = {1.1, 4.1, 4.2, 5.0, 2.0, 4.0, 4.0, 3.0, 17.0, 0.0};
		String[] test3 = {"zebra","tortilla", "abba","foo", "bar", "aba"};
		
		//Insertion Sort test
		long start = System.nanoTime();
		SortingAlgorithms.insertionSort(test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Test1 took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(test1));
		
		start = System.nanoTime();
		SortingAlgorithms.selectionSort(test2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test1 took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(test2));
		
		start = System.nanoTime();
		SortingAlgorithms.bubbleSort(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test1 took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(test3));
	}
}
