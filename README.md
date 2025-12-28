# Binary Search in Java

## Description
This program demonstrates the implementation of **Binary Search** in Java.
Binary search efficiently finds an element in a **sorted array** by repeatedly dividing the search range into half.

## How It Works
- Reads the size of the array
- Stores elements in an array
- Sorts the array
- Reads the element to be searched
- Compares the search key with the middle element
- Narrows the search range to left or right half
- Returns the index if the element is found
- Returns `-1` if the element is not found

## Input Format
<array_size>
<array_elements>
<element_to_search>

## Sample Input
5
10 20 30 40 50
30

## Output
2

If the element is not found:
-1

## Time Complexity
- Best Case: O(1)
- Average Case: O(log n)
- Worst Case: O(log n)

## Space Complexity
O(1)

## Characteristics
- Faster than linear search
- Works only on sorted arrays
- Divide and conquer searching technique

## File Name
Bsearch.java
