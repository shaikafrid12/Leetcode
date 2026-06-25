# 3737. Count Subarrays With Majority Element I

You are given an integer array `nums` and an integer `target`.

Return the number of subarrays of `nums` in which `target` is the majority element.

The majority element of a subarray is the element that appears strictly more than half of the times in that subarray.

## Example 1:

**Input:** `nums = [1,2,2,3]`, `target = 2`  
**Output:** `5`  
**Explanation:**  
Valid subarrays with target = 2 as the majority element:
* `nums[1..1] = [2]`
* `nums[2..2] = [2]`
* `nums[1..2] = [2,2]`
* `nums[0..2] = [1,2,2]`
* `nums[1..3] = [2,2,3]`  
So there are 5 such subarrays.

## Example 2:

**Input:** `nums = [1,1,1,1]`, `target = 1`  
**Output:** `10`  
**Explanation:**  
All 10 subarrays have 1 as the majority element.

## Example 3:

**Input:** `nums = [1,2,3]`, `target = 4`  
**Output:** `0`  
**Explanation:**  
`target = 4` does not appear in `nums` at all. Therefore, there cannot be any subarray where 4 is the majority element. Hence the answer is 0.

## Constraints:

* `1 <= nums.length <= 1000`
* `1 <= nums[i] <= 10^9`
* `1 <= target <= 10^9`

## Algorithm (Java)

1. **Iterate Through All Possible Subarrays:**
   * Use two nested loops: an outer loop with index `i` from `0` to `n - 1` (denoting the starting index of the subarray) and an inner loop with index `j` from `i` to `n - 1` (denoting the ending index of the subarray).
2. **Count Frequencies of the Target Element:**
   * Keep a running count `cnt` of the occurrence of `target` in the current subarray as the inner loop expands.
3. **Check the Majority Condition:**
   * Calculate the length of the current subarray: `len = j - i + 1`.
   * If `cnt * 2 > len`, the `target` is the majority element of the subarray. Increment the answer count.
4. **Return Results:**
   * Return the total count of valid subarrays.