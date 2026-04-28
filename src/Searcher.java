public class Searcher {

    // Binary Search
    public int search(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            // Middle index
            int middle = left + (right - left) / 2;

            // Found target
            if (arr[middle] == target) {
                return middle;
            }

            // Search in right half
            if (arr[middle] < target) {
                left = middle + 1;
            }

            // Search in left half
            else {
                right = middle - 1;
            }
        }

        // Not found
        return -1;
    }
}