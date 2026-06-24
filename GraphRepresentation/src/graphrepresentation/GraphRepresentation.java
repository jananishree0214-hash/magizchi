package graphrepresentation;

import java.util.*;

public class GraphRepresentation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        int[][] matrix = new int[v][v];

        ArrayList<Integer>[] list = new ArrayList[v];

        for(int i=0;i<v;i++){
            list[i] = new ArrayList<>();
        }

        System.out.println("Enter edges:");

        for(int i=0;i<e;i++){
            int u = sc.nextInt();
            int w = sc.nextInt();

            matrix[u][w] = 1;
            matrix[w][u] = 1;

            list[u].add(w);
            list[w].add(u);
        }

        System.out.println("\nAdjacency Matrix:");

        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nAdjacency List:");

        for(int i=0;i<v;i++){
            System.out.print(i + " -> ");

            for(int n : list[i]){
                System.out.print(n + " ");
            }

            System.out.println();
        }
    }
}