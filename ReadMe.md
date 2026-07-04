# 🚀 LeetCode DSA in Java

This repository tracks my daily progress in mastering Data Structures and Algorithms (DSA) through LeetCode. 
The focus here is on writing clean, efficient, and optimized solutions using Core Java, building the foundational logic needed for robust backend development.

## 🗂️ Repository Structure

All solutions are implemented in Java and organized into folders by algorithmic pattern under `src/`.

### 📁 `src/arrays_and_hashings/`
| # | Problem | Pattern / Concept Used | Difficulty | File |
|:---:|:---|:---|:---:|:---|
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | Arrays, HashMap | 🟢 Easy | `1_Two_Sum.java` |
| 136 | [Single Number](https://leetcode.com/problems/single-number/) | Arrays, HashMap | 🟢 Easy | `136_Single_Number.java` |
| 169 | [Majority Element](https://leetcode.com/problems/majority-element/) | Arrays, HashMap | 🟢 Easy | `169_Majority_Element.java` |
| 217 | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) | Arrays, HashSet | 🟢 Easy | `217_Contain_Duplicate.java` |

### 📁 `src/two_pointers/`
| # | Problem | Pattern / Concept Used | Difficulty | File |
|:---:|:---|:---|:---:|:---|
| 27 | [Remove Element](https://leetcode.com/problems/remove-element/) | Arrays, Two Pointers (Reader/Writer) | 🟢 Easy | `27_Remove_Element.java` |
| 167 | [Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) | Arrays, Two Pointers | 🟡 Medium | `167_Two_Sum_II_Input_Array_Sorted.java` |
| 283 | [Move Zeroes](https://leetcode.com/problems/move-zeroes/) | Arrays, Two Pointers | 🟢 Easy | `283_Moves_Zeros.java` |
| 344 | [Reverse String](https://leetcode.com/problems/reverse-string/) | Two Pointers, In-Place Manipulation | 🟢 Easy | `344_Reverse_String.java` |
| 392 | [Is Subsequence](https://leetcode.com/problems/is-subsequence/) | Strings, Two Pointers | 🟢 Easy | `392_Is_Subsequence.java` |
| 844 | [Backspace String Compare](https://leetcode.com/problems/backspace-string-compare/) | Two Pointers (Reverse) | 🟢 Easy | `844_Backspace_string_compare.java` |
| 977 | [Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/) | Arrays, Two Pointers | 🟢 Easy | `977_Squares_of_sorted_Array.java` |
### 📁 `src/sliding_window/`
| # | Problem | Pattern / Concept Used | Difficulty | File |
|:---:|:---|:---|:---:|:---|
| 643 | [Maximum Average Subarray I](https://leetcode.com/problems/maximum-average-subarray-i/) | Sliding Window (Fixed) | 🟢 Easy | `643_Maximum_Avg_SubArray_1.java` |

### 📁 `src/prefix_sum/`
| # | Problem | Pattern / Concept Used | Difficulty | File |
|:---:|:---|:---|:---:|:---|
| 238 | [Product of Except Self](https://leetcode.com/problems/product-of-array-except-self/) | Prefix & Suffix Product (Two Pass) | 🟡 Medium | `238_Product_Except_Self.java` |
| 1480 | [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/) | Arrays, Prefix Sum | 🟢 Easy | `1480_Runnning_Sum_of_1d_Array.java` |

### 📁 `src/math/`
| # | Problem | Pattern / Concept Used | Difficulty | File |
|:---:|:---|:---|:---:|:---|
| 268 | [Missing Number](https://leetcode.com/problems/missing-number/) | Arrays, Math | 🟢 Easy | `268_Missing_Number.java` |

### 📁 `src/binary_search/`
| # | Problem | Pattern / Concept Used | Difficulty | File |
|:---:|:---|:---|:---:|:---|
| 704 | [Binary Search](https://leetcode.com/problems/binary-search/) | Binary Search | 🟢 Easy | `704_Binary_Search.java` |

## 🧠 Core Patterns Being Mastered
Currently focusing on mastering these foundational patterns:
- **HashMaps & HashSets:** Trading memory for speed to drop O(n²) time complexity down to O(n).
- **Two Pointers:** Manipulating arrays in-place from both ends to achieve O(1) extra space complexity.
- **Sliding Window:** Maintaining a dynamic or fixed-size window over a sequential data structure to optimize redundant calculations down to O(n).
- **Math & Arithmetic Sequences:** Leveraging mathematical formulas to optimize spatial complexity to O(1).
- **Prefix Sums:** Maintaining a running cumulative total to avoid recalculating overlapping elements.
- **Binary Search:** Repeatedly halving the search space on sorted data to cut time complexity down to O(log n).