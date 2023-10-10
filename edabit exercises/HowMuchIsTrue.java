public class HowMuchIsTrue {
    public static void main (String[] args) {
        boolean[] arr1 = {true, false, false, true, false};
        System.out.println(countTrue(arr1));
    }


	public static int countTrue(boolean[] arr) {
        int counter = 0;
		for (boolean element: arr) {
			if (element == true) {
				counter++;
			}
		}
		return counter;
	}
}