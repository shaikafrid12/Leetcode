# 1833. Maximum Ice Cream Bars

It is a sweltering summer day, and a boy wants to buy some ice cream bars. At the store, there are `n` ice cream bars. You are given an array `costs` of length `n`, where `costs[i]` is the price of the `i`-th ice cream bar in coins. The boy initially has `coins` coins to spend, and he wants to buy as many ice cream bars as possible.

**Note:** The boy can buy the ice cream bars in any order.

Return the maximum number of ice cream bars the boy can buy with `coins` coins.

## Example 1:

**Input:** `costs = [1,3,2,4,1]`, `coins = 7`  
**Output:** `4`  
**Explanation:** The boy can buy ice cream bars at indices 0, 1, 2, and 4 for a total price of `1 + 3 + 2 + 1 = 7`.

## Example 2:

**Input:** `costs = [10,6,8,7,7,8]`, `coins = 5`  
**Output:** `0`  
**Explanation:** The boy cannot afford any of the ice cream bars.

## Example 3:

**Input:** `costs = [1,6,3,1,2,5]`, `coins = 20`  
**Output:** `6`  
**Explanation:** The boy can buy all the ice cream bars for a total price of `1 + 6 + 3 + 1 + 2 + 5 = 18`.

## Constraints:

* `costs.length == n`
* `1 <= n <= 10^5`
* `1 <= costs[i] <= 10^5`
* `1 <= coins <= 10^8`

## Algorithm (Java)

1. **Greedy Approach (Sorting):**
   * To maximize the number of ice cream bars we can purchase, we should always buy the cheapest ones first.
   * Sort the `costs` array in ascending order.
2. **Iterate and Spend:**
   * Iterate through the sorted `costs` array.
   * If the remaining `coins` are greater than or equal to the current cost, purchase the bar: deduct the cost from `coins` and increment the count.
   * If we cannot afford the current bar, terminate the loop early since all subsequent bars will be even more expensive.
3. **Return Count:**
   * Return the total count of purchased ice cream bars.