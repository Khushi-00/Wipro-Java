package corejava.Labsessions.Today31;

public class MissingNumber {

	int[] arr = {1, 2, 4, 5, 6};  

    int n = arr.length + 1; 
    int expectedSum = n * (n + 1) / 2;

    int actualSum = 0;
    {
    for (int num : arr) {
        actualSum += num;
    }

    int missingNumber = expectedSum - actualSum;
    System.out.println("Missing number is: " + missingNumber);
}

}
