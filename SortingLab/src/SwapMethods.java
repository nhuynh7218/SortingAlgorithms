
public class SwapMethods {

public static void swapInt(int[]array, int index1, int index2)
{
	int x = array[index1];
	array[index1] = array[index2];
	array[index2] = x;
}

public static void swapString(String[]array, int index1, int index2)
{
	String hold = array[index1];
	array[index1].equals(array[index2]);
	array[index2].equals(hold);
}

public static void swapDouble(double[]array, int index1, int index2)
{
	double x = array[index1];
	array[index1] = array[index2];
	array[index2] = x;
}
}
