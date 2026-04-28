import java.util.Arrays;

public class Experiment {

    private Sorter sorter;
    private Searcher searcher;

    // Constructor
    public Experiment() {
        sorter = new Sorter();
        searcher = new Searcher();
    }

    // Measures sorting time
    public long measureSortTime(int[] arr, String type) {

        // Copy array so original is unchanged
        int[] copy = Arrays.copyOf(arr, arr.length);

        long startTime = System.nanoTime();

        if (type.equalsIgnoreCase("basic")) {
            sorter.basicSort(copy);
        }

        else if (type.equalsIgnoreCase("advanced")) {
            sorter.advancedSort(copy);
        }

        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    // Measures search time
    public long measureSearchTime(int[] arr, int target) {

        long startTime = System.nanoTime();

        searcher.search(arr, target);

        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    // Runs all experiments
    public void runAllExperiments() {

        // Different sizes
        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {

            System.out.println("\n===== ARRAY SIZE: " + size + " =====");

            // Random array
            int[] randomArray = sorter.generateRandomArray(size);

            // Sorted array
            int[] sortedArray = Arrays.copyOf(randomArray, randomArray.length);
            Arrays.sort(sortedArray);

            // BASIC SORT
            long basicRandomTime = measureSortTime(randomArray, "basic");
            long basicSortedTime = measureSortTime(sortedArray, "basic");

            // ADVANCED SORT
            long advancedRandomTime = measureSortTime(randomArray, "advanced");
            long advancedSortedTime = measureSortTime(sortedArray, "advanced");

            // SEARCH
            int target = sortedArray[size / 2];

            long searchTime = measureSearchTime(sortedArray, target);

            // Results
            System.out.println("Bubble Sort (Random): " + basicRandomTime + " ns");
            System.out.println("Bubble Sort (Sorted): " + basicSortedTime + " ns");

            System.out.println("Quick Sort (Random): " + advancedRandomTime + " ns");
            System.out.println("Quick Sort (Sorted): " + advancedSortedTime + " ns");

            System.out.println("Binary Search: " + searchTime + " ns");
        }
    }
}