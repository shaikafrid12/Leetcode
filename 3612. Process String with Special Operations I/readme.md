You are given a string `s` consisting of lowercase English letters and the special characters: `*`, `#`, and `%`.

Build a new string `result` by processing `s` according to the following rules from left to right:
* If the character is a lowercase English letter, append it to `result`.
* A `*` removes the last character from `result`, if it exists.
* A `#` duplicates the current `result` and appends it to itself.
* A `%` reverses the current `result`.

Return the final string `result` after processing all characters in `s`.

### Example 1:
**Input:** `s = "a#b%*"`  
**Output:** `"ba"`  
**Explanation:**  

| i | `s[i]` | Operation | Current result |
|---|---|---|---|
| 0 | `'a'` | Append `'a'` | `"a"` |
| 1 | `'#'` | Duplicate result | `"aa"` |
| 2 | `'b'` | Append `'b'` | `"aab"` |
| 3 | `'%'` | Reverse result | `"baa"` |
| 4 | `'*'` | Remove the last character | `"ba"` |

Thus, the final result is `"ba"`.

### Example 2:
**Input:** `s = "z*#"`  
**Output:** `""`  
**Explanation:**  

| i | `s[i]` | Operation | Current result |
|---|---|---|---|
| 0 | `'z'` | Append `'z'` | `"z"` |
| 1 | `'*'` | Remove the last character | `""` |
| 2 | `'#'` | Duplicate the string | `""` |

Thus, the final result is `""`.

### Constraints:
* `1 <= s.length <= 20`
* `s` consists of only lowercase English letters and special characters `*`, `#`, and `%`.

<h2>Algorithm</h2>
<ol>
  <li><strong>Simulation with StringBuilder</strong>: Since the length of the string is very small (<code>1 &lt;= s.length &lt;= 20</code>), we can simulate the operations step-by-step from left to right using a <code>StringBuilder</code>.</li>
  <li><strong>Character Processing</strong>: Loop through each character in the string:
    <ul>
      <li><strong>Lowercase Letter (a-z)</strong>: Append it to the <code>StringBuilder</code>.</li>
      <li><strong>Asterisk (<code>*</code>)</strong>: Remove the last character from the <code>StringBuilder</code> using <code>deleteCharAt(result.length() - 1)</code> if the builder is not empty.</li>
      <li><strong>Hash (<code>#</code>)</strong>: Duplicate the current result by getting its string representation and appending it to itself (<code>result.append(result.toString())</code>).</li>
      <li><strong>Percent (<code>%</code>)</strong>: Reverse the contents of the <code>StringBuilder</code> in-place using <code>result.reverse()</code>.</li>
    </ul>
  </li>
  <li><strong>Output</strong>: Return the final string representation of the <code>StringBuilder</code>.</li>
</ol>