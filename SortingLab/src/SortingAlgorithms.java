
public class SortingAlgorithms {
	public static void bubbleSort(String [] list1)
	{
		int swapCount = 0;
		while(swapCount > 0)
		{
			for(int i = 0; i<= list1.length-1;i++)
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
}
