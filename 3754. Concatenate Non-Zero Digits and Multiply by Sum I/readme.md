# 3754. Concatenate Non-Zero Digits and Multiply by Sum I

You are given an integer `n`.

Form a new integer `x` by concatenating all the non-zero digits of `n` in their original order. If there are no non-zero digits, `x = 0`.

Let `sum` be the sum of digits in `x`.

Return an integer representing the value of `x * sum`.

## Example 1:

**Input:** `n = 10203004`  
**Output:** `12340`  
**Explanation:**  
The non-zero digits are 1, 2, 3, and 4. Thus, `x = 1234`.  
The sum of digits is `sum = 1 + 2 + 3 + 4 = 10`.  
Therefore, the answer is `x * sum = 1234 * 10 = 12340`.

## Example 2:

**Input:** `n = 1000`  
**Output:** `1`  
**Explanation:**  
The non-zero digit is 1, so `x = 1` and `sum = 1`.  
Therefore, the answer is `x * sum = 1 * 1 = 1`.

## Constraints:

* `0 <= n <= 10^9`

## Algorithm (Java)

1. **Initialize State:**
   * Keep a `long x = 0` to build the number from the non-zero digits.
   * Keep a `long place = 1` representing the base-10 positional multiplier.
   * Keep an `int sum = 0` to store the sum of the non-zero digits.
2. **Process Digits from Right to Left:**
   * Loop while `n > 0`.
   * Extract the last digit `d = n % 10`.
   * If `d != 0`:
     * Prepend `d` to `x` by adding `d * place` to `x`.
     * Multiply `place` by `10` to prepare for the next position.
     * Add `d` to `sum`.
   * Remove the last digit from `n` by dividing it by `10` (`n /= 10`).
3. **Calculate Result:**
   * Return `x * sum`.