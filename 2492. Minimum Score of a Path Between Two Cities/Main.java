import java.util.*;
class Solution {
    int ans = Integer.MAX_VALUE;

    public int minScore(int n, int[][] roads) {

        // Build adjacency list
        List<List<int[]>> graph = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] road : roads) {
            int u = road[0];
            int v = road[1];
            int w = road[2];

            graph.get(u).add(new int[]{v, w});
            graph.get(v).add(new int[]{u, w});
        }

        boolean[] visited = new boolean[n + 1];

        dfs(1, graph, visited);

        return ans;
    }

    private void dfs(int node, List<List<int[]>> graph, boolean[] visited) {

        visited[node] = true;

        for (int[] edge : graph.get(node)) {

            int next = edge[0];
            int weight = edge[1];

            // Update minimum edge seen so far
            ans = Math.min(ans, weight);

            if (!visited[next]) {
                dfs(next, graph, visited);
            }
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();

        int m=sc.nextInt();
        int[][] roads=new int[m][3];

        for(int i=0;i<m;i++){
            roads[i][0]=sc.nextInt();
            roads[i][1]=sc.nextInt();
            roads[i][2]=sc.nextInt();
        }

        Solution s=new Solution();
        System.out.println(s.minScore(n, roads));
        sc.close();    
    }
}