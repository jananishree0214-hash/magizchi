package graphtraversal;

import java.util.*;

public class GraphTraversal {

    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] vis = new boolean[graph.length];

        queue.add(start);
        vis[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int n : graph[node]) {
                if (!vis[n]) {
                    vis[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int n : graph[node]) {
            if (!visited[n]) {
                dfs(n);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        graph = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        System.out.println("Enter edges:");

        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int w = sc.nextInt();

            graph[u].add(w);
            graph[w].add(u);
        }

        System.out.print("Enter starting node: ");
        int start = sc.nextInt();

        System.out.println("BFS Traversal:");
        bfs(start);

        visited = new boolean[v];

        System.out.println("\nDFS Traversal:");
        dfs(start);
    }
}