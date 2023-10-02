// https://practice.geeksforgeeks.org/problems/shortest-path-in-undirected-graph/1?page=1&difficulty[]=1&category[]=Graph&sortBy=submissions



class Solution {

	public int[] shortestPath(int N,int M, int[][] edges) {
		ArrayList<int[]>[] graph = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }
         for (int i = 0; i < M; i++) {
            int[] info = new int[3];
            info[0] = edges[i][0];
            info[1] = edges[i][1];
            info[2] = edges[i][2];
            graph[edges[i][0]].add(info);
        }
        
        int[] dist = new int[N];
        for (int i = 1; i < N; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(); 
        pq.add(0);
        while (!pq.isEmpty()) {
                int curr = pq.remove();
                for (int i = 0; i < graph[curr].size(); i++) {
                    int[] e = graph[curr].get(i);
                    int scr = e[0];
                    int dest = e[1];
                    int wt = e[2];
                    if (dist[scr] + wt < dist[dest]) {
                        dist[dest] = dist[scr] + wt;
                        pq.add(dest);
                    }
                }
            }
              for (int i = 0; i < N; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                dist[i] = -1;
            }
        }
        return dist;
        
	}
}


