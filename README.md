# Subsequence-Score-Maximizer
## Description
The Subsequence Score Maximizer is an algorithmic problem that aims to find the maximum score by selecting a subsequence from two given arrays of integers. The score is calculated by multiplying the sum of the selected subsequence from one array with with the minimum of the selected elements from the other array.
## Algorithm
The solution uses a priority queue to keep track of the largest elements from one of the arrays. It starts by sorting the arrays based on the elements from the other array in descending order. Then, it iterates over the sorted array and maintains a running sum of the selected subsequence elements and updates the maximum score accordingly.
## Approach
The algorithm follows these steps to maximize the subsequence score:

- Create a 2D array called total to store pairs of elements from the two input arrays, where the first element of the pair is from nums2 and the second element is from nums1.
- Sort the total array in descending order based on the first element of each pair.
- Initialize a priority queue called heap to store the largest elements from nums1.
- Initialize a variable called totalsum to keep track of the sum of the selected subsequence elements from nums1.
- Iterate over the first k elements of the sorted total array.
- Add the second element of each pair (from nums1) to the heap.
- Increment totalsum by adding the second element to the running sum.
- Calculate the initial maximum value by multiplying totalsum with the first element of the pair at index k-1 in the sorted total array.
- Iterate over the remaining elements of the total array, starting from index k.
- Update totalsum by subtracting the smallest element from the heap using poll() and adding the current second element from nums1.
- Add the current second element to the heap.
- Update the maximum value if the calculated score is higher.
- Return the maximum value as the result.
## Complexity Analysis
The time complexity of the algorithm is O(N log N), where N is the length of the input arrays. This complexity arises from sorting the arrays and performing operations on the priority queue. The space complexity is O(N) due to the use of additional data structures.

