# 1344. Angle Between Hands of a Clock

Given two numbers, `hour` and `minutes`, return the smaller angle (in degrees) formed between the hour and the minute hand.

Answers within $10^{-5}$ of the actual value will be accepted as correct.

## Example 1:

**Input:** `hour = 12, minutes = 30`  
**Output:** `165`  

## Example 2:

**Input:** `hour = 3, minutes = 30`  
**Output:** `75`  

## Example 3:

**Input:** `hour = 3, minutes = 15`  
**Output:** `7.5`  

## Constraints:

* `1 <= hour <= 12`
* `0 <= minutes <= 59`

## Algorithm (Java)

1. **Calculate the angle made by the hour hand from 12 o'clock:**
   * Each hour contributes $30^\circ$ ($360^\circ / 12$).
   * Each minute contributes an additional $0.5^\circ$ ($30^\circ / 60$) because the hour hand moves continuously as minutes pass.
   * **Formula:** `hourAngle = (hour % 12) * 30 + minutes * 0.5`

2. **Calculate the angle made by the minute hand from 12 o'clock:**
   * Each minute contributes $6^\circ$ ($360^\circ / 60$).
   * **Formula:** `minuteAngle = minutes * 6`

3. **Find the absolute difference between the two angles:**
   * `diff = |hourAngle - minuteAngle|`

4. **Return the smaller angle:**
   * Since the hands form a circle, the smaller angle is either `diff` or its complement `360 - diff`.
   * **Result:** `min(diff, 360 - diff)`