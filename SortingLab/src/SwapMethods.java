
public class SwapMethods {

public static void swapInt(int[] list1, int index1, int index2)
{
	int x = list1[index1];
	list1[index1] = list1[index2];
	list1[index2] = x;
}

public static void swapString(String[]array, int index1, int index2)
{
	String hold = array[index1];
	array[index1]= array[index2];
	array[index2]= hold;
}

public static void swapDouble(double[]array, int index1, int index2)
{
	double x = array[index1];
	array[index1] = array[index2];
	array[index2] = x;
}
}
