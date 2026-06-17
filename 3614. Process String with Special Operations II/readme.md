You are given a string `s` consisting of lowercase English letters and the special characters: `*`, `#`, and `%`, and an integer `k`.

Build a new string `result` by processing `s` according to the following rules from left to right:
* If the character is a lowercase English letter, append it to `result`.
* A `*` removes the last character from `result`, if it exists.
* A `#` duplicates the current `result` and appends it to itself.
* A `%` reverses the current `result`.

Return the character at index `k` (0-indexed) of the final string `result`. If `k` is out of bounds, return `'.'`.

### Example 1:
**Input:** `s = "a#b%*"`, `k = 1`  
**Output:** `"a"`  
**Explanation:**  

| i | `s[i]` | Operation | Current result | Length |
|---|---|---|---|---|
| 0 | `'a'` | Append `'a'` | `"a"` | 1 |
| 1 | `'#'` | Duplicate result | `"aa"` | 2 |
| 2 | `'b'` | Append `'b'` | `"aab"` | 3 |
| 3 | `'%'` | Reverse result | `"baa"` | 3 |
| 4 | `'*'` | Remove the last character | `"ba"` | 2 |

The character at index `k = 1` in `"ba"` is `"a"`.

### Example 2:
**Input:** `s = "cd%#*#"`, `k = 3`  
**Output:** `"d"`  
**Explanation:**  

| i | `s[i]` | Operation | Current result | Length |
|---|---|---|---|---|
| 0 | `'c'` | Append `'c'` | `"c"` | 1 |
| 1 | `'d'` | Append `'d'` | `"cd"` | 2 |
| 2 | `'%'` | Reverse result | `"dc"` | 2 |
| 3 | `'#'` | Duplicate result | `"dcdc"` | 4 |
| 4 | `'*'` | Remove the last character | `"dcd"` | 3 |
| 5 | `'#'` | Duplicate result | `"dcddcd"` | 6 |

The character at index `k = 3` in `"dcddcd"` is `"d"`.

### Example 3:
**Input:** `s = "z*#"`, `k = 0`  
**Output:** `"."`  
**Explanation:**  

| i | `s[i]` | Operation | Current result | Length |
|---|---|---|---|---|
| 0 | `'z'` | Append `'z'` | `"z"` | 1 |
| 1 | `'*'` | Remove the last character | `""` | 0 |
| 2 | `'#'` | Duplicate result | `""` | 0 |

The final string is empty, so index `k = 0` is out of bounds. We return `'.'`.

### Constraints:
* `1 <= s.length <= 10^5`
* `s` consists only of lowercase English letters and special characters `*`, `#`, and `%`.
* `0 <= k <= 10^15`
* The length of the final `result` string will not exceed `10^15`.

<h2>Algorithm</h2>

Since the result string can grow exponentially (up to $10^{15}$) due to the `#` (duplication) operation, we cannot simulate the process forward to build the string. Instead, we must track the target index `k` backwards from the end of the operations.

### 1. Forward Pass: Compute Lengths
We iterate through the string `s` from left to right and calculate the length of the intermediate string after each step:
* **Lowercase Letter**: `len[i + 1] = len[i] + 1`
* **Asterisk (`*`)**: `len[i + 1] = max(0, len[i] - 1)`
* **Hash (`#`)**: `len[i + 1] = len[i] * 2` (safely capped to avoid overflow)
* **Percent (`%`)**: `len[i + 1] = len[i]`

### 2. Out-of-bounds Check
If `k >= len[n]`, the index is out of bounds. We return `'.'`.

### 3. Backward Pass: Index Tracing
We traverse the string `s` in reverse from `n - 1` down to `0`. At each index `i`:
* **Lowercase Letter**:
  The character `ch` was appended at index `prev = len[i]`. If our target index `k == prev`, it means `ch` is the character at our target index. We return `ch` immediately.
* **Asterisk (`*`)**:
  Undoing the removal of a character at the end of the string does not change the position of the character at index `k` (since `k` is always less than the current length `curr = len[i + 1]`, and `curr = prev - 1`, we must have `k < prev - 1`, which means `k` is safely before the deleted character). So `k` remains unchanged.
* **Hash (`#`)**:
  The duplication doubled the string. If `k >= prev` (where `prev = len[i]`), the target index falls in the duplicated second half. We subtract `prev` from `k` (`k -= prev`) to map it back to the original string. Otherwise, it lies in the first half and remains unchanged.
* **Percent (`%`)**:
  Reversing the string maps the target index `k` to its symmetric index in the original string: `k = curr - 1 - k` (where `curr = len[i + 1]`).