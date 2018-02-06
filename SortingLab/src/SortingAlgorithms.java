
public class SortingAlgorithms {
	public static void bubbleSort(String [] list1)
	{
		int swapCount = 1;
		while(swapCount != 0)
		{
		
			swapCount = 0;
			for(int i = 0; i < list1.length-1 ; i++)
			{
				int var1 = list1[i].compareTo(list1[i+1]);
				if (var1 > 0)
				{
					SwapMethods.swapString(list1, i, i+1);
					swapCount++;
				}
			}
		}
	}
	
	
	public static void selectionSort(double[]list1)
	{
		int len = list1.length;
		for(int i = 0; i < len-1 ;i++)
		{
			int minPos = i;
			for (int j = i + 1; j < len; j++)
			{
				if(list1[minPos]>list1[j])
				{
					minPos = j;
				}
			SwapMethods.swapDouble(list1, minPos, i);	
			}
		}
			
	}
	
	
	public static void insertionSort(int[]list1)
	{
		int len = list1.length;
		for(int i = 1; i < len; i++)
		{
		        int j = i - 1;
		        while (j >= 0 && list1[j] > list1[i] )
		        {
		            SwapMethods.swapInt(list1, i, j);
		            i=j;
		            j--;

		        }		
		 }
	}
}
