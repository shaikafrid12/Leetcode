# 2492. Minimum Score of a Path Between Two Cities

You are given a positive integer `n` representing `n` cities numbered from `1` to `n`. You are also given a 2D array `roads` where `roads[i] = [a_i, b_i, distance_i]` indicates that there is a bidirectional road between cities `a_i` and `b_i` with a distance equal to `distance_i`. The cities graph is not necessarily connected.

The score of a path between two cities is defined as the minimum distance of a road in this path.

Return the minimum possible score of a path between cities `1` and `n`.

Note:
- A path is a sequence of roads between two cities.
- It is allowed for a path to contain the same road multiple times, and you can visit cities `1` and `n` multiple times along the path.
- The test cases are generated such that there is at least one path between `1` and `n`.

### Example 1:
**Input:** `n = 4`, `roads = [[1,2,9],[2,3,6],[2,4,5],[1,4,7]]`  
**Output:** `5`  
**Explanation:** The path from city 1 to 4 with the minimum score is: 1 -> 2 -> 4. The score of this path is min(9,5) = 5.
It can be shown that no other path has less score.

### Example 2:
**Input:** `n = 4`, `roads = [[1,2,2],[1,3,4],[3,4,7]]`  
**Output:** `2`  
**Explanation:** The path from city 1 to 4 with the minimum score is: 1 -> 2 -> 1 -> 3 -> 4. The score of this path is min(2,2,4,7) = 2.

### Constraints:
- `2 <= n <= 10^5`
- `1 <= roads.length <= 10^5`
- `roads[i].length == 3`
- `1 <= a_i, b_i <= n`
- `a_i != b_i`
- `1 <= distance_i <= 10^4`
- There are no repeated edges.
- There is at least one path between `1` and `n`.

## Algorithm (Java)

1. **Build Adjacency List (Graph Construction):**
   * Construct an undirected graph using an adjacency list where each node points to a list of its neighbors and the respective road weights.
2. **Breadth-First Search (BFS) Initialization:**
   * Since there is at least one path between city `1` and city `n`, they belong to the same connected component.
   * To find the minimum score of any path between `1` and `n` (allowing visiting roads/cities multiple times), we only need to find the minimum road weight in the connected component containing city `1`.
   * Initialize a `visited` boolean array of size `n + 1` to track visited cities.
   * Initialize a `queue` for BFS, starting with city `1`. Mark city `1` as visited.
   * Initialize `ans = Integer.MAX_VALUE` to keep track of the minimum road weight seen.
3. **Traverse the Connected Component:**
   * While the `queue` is not empty, dequeue the current city.
   * Iterate through all roads connected to the current city:
     * Update `ans` with the minimum of `ans` and the road's weight.
     * If the neighbor city has not been visited yet:
       * Mark it as visited.
       * Enqueue the neighbor city.
4. **Return Results:**
   * Return the minimum road weight `ans`.