
public class SortingAlgorithms {
	public static void bubbleSort(String [] list1)
	{
		int swapCount = 0;
		while(swapCount > 0)
		{
			int len = list1.length;
			for(int i = len; i >= 0; i++)
			{
				int var1 = list1[i].compareTo(list1[i+1]);
				if (var1 > 0)
				{
					SwapMethods.swapString(list1, i, i+1);
					swapCount--;
				}
			}
		}
	}
	
	
	public static void selectionSort(double[]list1)
	{
		
	}
	
	
	public static void insertionSort(int[]list1)
	{
		
	}
}
