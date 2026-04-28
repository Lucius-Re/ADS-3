# ADS-3
# Assignment 3: Sorting and Searching Algorithm Analysis System

## Project Overview

This project analyzes and compares the performance of three algorithms:

- Bubble Sort (Basic Sorting)
- Quick Sort (Advanced Sorting)
- Binary Search (Searching)

The purpose of this experiment is to measure execution time using System.nanoTime() and compare algorithm efficiency across different array sizes and input types (random and sorted).

## Algorithm Descriptions

### Bubble Sort
Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order.
- Best Case: O(n)
- Average/Worst Case: O(n²)

### Quick Sort
Quick Sort uses divide-and-conquer by selecting a pivot and partitioning the array.
- Best/Average Case: O(n log n)
- Worst Case: O(n²)

### Binary Search
Binary Search repeatedly divides the sorted array in half.
- Time Complexity: O(log n)
- Requirement: Array must be sorted

## Experiment Design

The program evaluates algorithm performance using the following dataset sizes:

- Small: 10 elements
- Medium: 100 elements
- Large: 1000 elements

# Each test measures execution time in nanoseconds using:
- System.nanoTime()

## Experiment Results
# Sorting Performance Comparison
Array Size	Bubble Sort (ns)	Quick Sort (ns)
10	18500	14100
100	391600	61100
1000	26513300	1102700

# Searching Performance (Binary Search)
Array Size	Search Time (ns)
10	3800
100	2800
1000	2500

💡 Note: Binary Search is performed only on sorted arrays.

Algorithm Analysis
Bubble Sort Complexity

O(n2)

Bubble Sort has quadratic time complexity, which makes it inefficient for large datasets because the number of comparisons grows rapidly as input size increases.

Quick Sort Complexity

O(nlogn)

Quick Sort performs significantly better due to its divide-and-conquer strategy, which reduces the problem size at each recursive step.

Binary Search Complexity

O(logn)

Binary Search is highly efficient because it eliminates half of the remaining elements at each step, resulting in logarithmic growth.

Comparison Summary
Bubble Sort → simple but very slow for large inputs
Quick Sort → efficient and practical for real systems
Binary Search → fastest searching method but requires sorted data
Key Observations
Quick Sort significantly outperforms Bubble Sort as input size increases.
Bubble Sort becomes impractical for large datasets due to O(n²) complexity.
Binary Search demonstrates extremely fast performance compared to linear search alternatives.
Sorting is a mandatory preprocessing step before applying efficient search algorithms.
Conclusion / Reflection

In this project, I learned how algorithm efficiency directly impacts performance in real execution time. Even small differences in time complexity lead to significant performance gaps when working with larger datasets.

Main takeaways:
Time complexity is more important than raw code simplicity.
Efficient algorithms scale much better with large inputs.
Divide-and-conquer strategies (Quick Sort) are highly effective.
Preprocessing data (sorting) is necessary for efficient searching.
