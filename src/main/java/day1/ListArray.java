package day1;

public class ListArray {
	public int[] initiliazeArray() {
		int[] array1 = {2,4,6,3,26,5};
		int[] array2 = {12,14,16,13,16,15};

		int[] array3 = new int[array1.length + array2.length];

		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i];
		}
		System.out.println(array1.length + " " + array3.length);

		int k = 0;
		for (int i = array1.length; i < array3.length; i++) {
			array3[i] = array2[k];
			k=k+1;
			if (k==array2.length) break;
		}
		return array3;
	}
}