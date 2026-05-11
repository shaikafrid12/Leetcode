# 2553. Separate the Digits in an Array

Given an array of positive integers `nums`, return an array `answer` that consists of the digits of each integer in `nums` after separating them in the same order they appear in `nums`.

To separate the digits of an integer is to get all the digits it has in the same order.

For example, for the integer `10921`, the separation of its digits is `[1,0,9,2,1]`.
 

## Example 1:

**Input:** `nums = [13,25,83,77]`
**Output:** `[1,3,2,5,8,3,7,7]`
**Explanation:** 
- The separation of 13 is `[1,3]`.
- The separation of 25 is `[2,5]`.
- The separation of 83 is `[8,3]`.
- The separation of 77 is `[7,7]`.

`answer = [1,3,2,5,8,3,7,7]`. Note that `answer` contains the separations in the same order.

## Example 2:

**Input:** `nums = [7,1,3,9]`
**Output:** `[7,1,3,9]`
**Explanation:** The separation of each integer in `nums` is itself.
`answer = [7,1,3,9]`.
 

## Constraints:

- `1 <= nums.length <= 1000`
- `1 <= nums[i] <= 10^5`

<h2>Algorithm (Java)</h2>

<ol>
    <li>Initialize a dynamic list <code>temp</code> (like <code>ArrayList</code>) to store the separated digits.</li>
    <li>Iterate through each integer <code>x</code> in the input array <code>nums</code>.</li>
    <li>For each integer <code>x</code>:
        <ul>
            <li>Create an empty <code>Stack</code>.</li>
            <li>Repeatedly take the last digit of <code>x</code> using the modulo operator (<code>x % 10</code>) and push it onto the <code>Stack</code>.</li>
            <li>Update <code>x</code> by removing the last digit using integer division (<code>x / 10</code>).</li>
            <li>Continue this until <code>x</code> becomes 0.</li>
        </ul>
    </li>
    <li>After the integer is fully broken down, pop all digits from the <code>Stack</code> one by one and append them to the <code>temp</code> list. Since a stack is Last-In-First-Out (LIFO), popping the digits out will reverse them back into their original left-to-right order.</li>
    <li>Once all integers in <code>nums</code> have been processed, convert the <code>temp</code> list into a primitive array.</li>
    <li>Return the resulting array.</li>
</ol>