package corejava.Labsessions.Today02;

import java.util.Arrays;

public class MultiThreadSorting {
	
	static class SortThread extends Thread {
        private int[] array;

        public SortThread(int[] array) {
            this.array = array;
        }

        public void run() {
            Arrays.sort(array);
        }

        public int[] getSortedArray() {
            return array;
        }
    }

    // Merge two sorted arrays
    public static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0, l = 0, r = 0;

        while (l < left.length && r < right.length) {
            if (left[l] <= right[r]) {
                merged[i++] = left[l++];
            } else {
                merged[i++] = right[r++];
            }
        }

        while (l < left.length) merged[i++] = left[l++];
        while (r < right.length) merged[i++] = right[r++];

        return merged;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] array = {42, 23, 4, 16, 8, 15, 9, 55};

        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

 
        SortThread t1 = new SortThread(left);
        SortThread t2 = new SortThread(right);

        t1.start();
        t2.start();

        
        t1.join();
        t2.join();

       
        int[] sortedArray = merge(t1.getSortedArray(), t2.getSortedArray());

        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }

}
