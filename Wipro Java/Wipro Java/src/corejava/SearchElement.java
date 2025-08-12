package corejava;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50};
		int target = 30; // Element to search for
		boolean found = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				System.out.println("Element " + target + " found at index " + i);
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("Element " + target + " not found in the array.");
		}

	}

}
