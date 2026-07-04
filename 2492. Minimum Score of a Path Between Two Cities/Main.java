import java.util.*;
class Solution {

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
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        visited[1] = true;

        int ans = Integer.MAX_VALUE;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int[] edge : graph.get(node)) {
                int next = edge[0];
                int weight = edge[1];

                ans = Math.min(ans, weight);

                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }

        return ans;
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