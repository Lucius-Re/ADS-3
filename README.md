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
| Array Size | Bubble Sort (ns) | Quick Sort (ns) |
|------------|------------------|------------------|
| 10         | 18500            | 14100            |
| 100        | 391600           | 61100            |
| 1000       | 26513300         | 1102700          |

# Searching Performance (Binary Search)
| Array Size | Search Time (ns) |
|------------|------------------|
| 10         | 3800             |
| 100        | 2800             |
| 1000       | 2500             |

<img width="609" height="754" alt="image" src="https://github.com/user-attachments/assets/e086f52c-9fc2-42da-8e87-889a8a9b75fe" />


# Note

Binary Search is performed only on sorted arrays.


# Algorithm Analysis

## Bubble Sort Complexity

- Bubble Sort has quadratic time complexity  
- Inefficient for large datasets  
- Number of comparisons grows rapidly with input size  


## Quick Sort Complexity


- Uses divide-and-conquer approach  
- Splits array using pivot element  
- Much faster than Bubble Sort in practice  
- Average complexity: O(n log n)  


## Binary Search Complexity


- Works only on sorted arrays  
- Eliminates half of the search space each step  
- Extremely efficient for large datasets  


# Comparison Summary

- Bubble Sort → simple but very slow for large inputs  
- Quick Sort → efficient and widely used in real systems  
- Binary Search → fastest searching algorithm but requires sorted data  


# Key Observations

- Quick Sort significantly outperforms Bubble Sort as input size grows  
- Bubble Sort becomes impractical for large datasets due to O(n²) complexity  
- Binary Search shows stable and very fast performance  
- Sorting is required before efficient searching can be applied  



# Conclusion / Reflection

In this project, I learned how algorithm efficiency directly impacts real execution performance.

Even small differences in complexity lead to large performance changes when dataset size increases.



## Main Takeaways

- Time complexity matters more than simple implementation  
- Efficient algorithms scale better with large inputs  
- Divide-and-conquer (Quick Sort) is highly effective  
- Preprocessing (sorting) is necessary for fast searching  



# Final Insight

- Algorithm choice is more important than code length  
- Real performance depends on complexity, not just logic  
- Understanding Big-O is essential for scalable software design  
