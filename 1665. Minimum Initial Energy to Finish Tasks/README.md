You are given an array tasks where tasks[i] = [actuali, minimumi]:

actuali is the actual amount of energy you spend to finish the ith task.
minimumi is the minimum amount of energy you require to begin the ith task.
For example, if the task is [10, 12] and your current energy is 11, you cannot start this task. However, if your current energy is 13, you can complete this task, and your energy will be 3 after finishing it.

You can finish the tasks in any order you like.

Return the minimum initial amount of energy you will need to finish all the tasks.

 

Example 1:

Input: tasks = [[1,2],[2,4],[4,8]]
Output: 8
Explanation:
Starting with 8 energy, we finish the tasks in the following order:
    - 3rd task. Now energy = 8 - 4 = 4.
    - 2nd task. Now energy = 4 - 2 = 2.
    - 1st task. Now energy = 2 - 1 = 1.
Notice that even though we have leftover energy, starting with 7 energy does not work because we cannot do the 3rd task.
Example 2:

Input: tasks = [[1,3],[2,4],[10,11],[10,12],[8,9]]
Output: 32
Explanation:
Starting with 32 energy, we finish the tasks in the following order:
    - 1st task. Now energy = 32 - 1 = 31.
    - 2nd task. Now energy = 31 - 2 = 29.
    - 3rd task. Now energy = 29 - 10 = 19.
    - 4th task. Now energy = 19 - 10 = 9.
    - 5th task. Now energy = 9 - 8 = 1.
Example 3:

Input: tasks = [[1,7],[2,8],[3,9],[4,10],[5,11],[6,12]]
Output: 27
Explanation:
Starting with 27 energy, we finish the tasks in the following order:
    - 5th task. Now energy = 27 - 5 = 22.
    - 2nd task. Now energy = 22 - 2 = 20.
    - 3rd task. Now energy = 20 - 3 = 17.
    - 1st task. Now energy = 17 - 1 = 16.
    - 4th task. Now energy = 16 - 4 = 12.
    - 6th task. Now energy = 12 - 6 = 6.
 

Constraints:

1 <= tasks.length <= 105
1 <= actual​i <= minimumi <= 104

<h2>Algorithm</h2>
<ol>
  <li><strong>Greedy Approach</strong>: The goal is to minimize the initial energy required. To do this, we should prioritize tasks that require a high minimum energy but consume less actual energy. This way, we "unlock" the high-requirement tasks while we still have a lot of energy, and the leftover energy can be used for subsequent tasks.</li>
  <li><strong>Sorting</strong>: Sort the tasks in descending order based on the difference between their minimum energy required and actual energy spent (<code>minimum - actual</code>).</li>
  <li><strong>Simulation</strong>: Iterate through the sorted tasks:
    <ul>
      <li>Keep track of the current energy (<code>curr</code>) and the total initial energy required (<code>ans</code>).</li>
      <li>If the current energy is less than the minimum energy required for the current task, we need to add the difference to our initial energy (<code>ans += task[1] - curr</code>) and update our current energy to the task's minimum requirement (<code>curr = task[1]</code>).</li>
      <li>Subtract the actual energy spent on the task from the current energy (<code>curr -= task[0]</code>).</li>
    </ul>
  </li>
  <li><strong>Return</strong> the total initial energy (<code>ans</code>).</li>
</ol>