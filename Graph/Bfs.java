import java.util.*;
public class Bfs {
    public static class Edge{
        int src;
        int dest;

        public Edge(int src, int dest){
            this.src=src;
            this.dest=dest;
        }    
    }
    public static void createGraph(ArrayList<Edge>[] graph){
     for(int i=0; i<graph.length; i++){
        graph[i]=new ArrayList<>();
     }

     // vertex 0
     graph[0].add(new Edge(0, 1));
     graph[0].add(new Edge(0, 2));
     // vertex 1
     graph[1].add(new Edge(1, 3));
     graph[1].add(new Edge(1, 0));
     //vertex 2
     graph[2].add(new Edge(2, 4));
     graph[2].add(new Edge(2, 0));
     // vertes 3
     graph[3].add(new Edge(3, 5));
     graph[3].add(new Edge(3, 1));
     graph[3].add(new Edge(3, 4));
     // vertex 4
     graph[4].add(new Edge(4, 5));
     graph[4].add(new Edge(4, 2));
     graph[4].add(new Edge(4, 3));
     // vertex 5
     graph[5].add(new Edge(5, 6));
     graph[5].add(new Edge(5, 3));
     graph[5].add(new Edge(5, 4));
     // vertex 6
     graph[6].add(new Edge(6, 5));
    }

// graph traversal using bfs

    public static void bfs(ArrayList<Edge>[] graph){
      boolean vis[]=new boolean[graph.length];

      for(int i=0; i<graph.length; i++){
        if(!vis[i]){
            bfsUtil(graph,vis);
        }
      }
    }
    public static void bfsUtil(ArrayList<Edge>[] graph,boolean []vis){
        Queue<Integer>q=new LinkedList<>();
        q.add(0);  // starting source

        while(!q.isEmpty()){
            int curr=q.remove();

            if(!vis[curr]){
              System.out.print(curr+" ");
              vis[curr]=true;
              for(int i=0; i<graph[curr].size(); i++){
                Edge e=graph[curr].get(i);
                q.add(e.dest);
              }
            }
        }
    }

// graph traversal using dfs
     public static void dfs(ArrayList<Edge>[] graph){
      boolean [] vis=new boolean[graph.length];
      for(int i=0; i<graph.length; i++){
        if(!vis[i]){
            dfsUtil(graph,i, vis);
        }
      }
     }
    public static void dfsUtil(ArrayList<Edge>[] graph,int curr,boolean []vis){
        System.out.print(curr+" ");
        vis[curr]=true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfsUtil(graph, e.dest, vis);
            }
        }
    }    
 // Has Path -> check path from src to dest
 
    public static boolean hasPath(ArrayList<Edge>[]graph, int src, int dest, boolean []vis){
        if(src==dest){
            return true;
        }
        vis[src]=true;
        for(int i=0; i<graph[src].size(); i++){
            Edge e=graph[src].get(i);

            if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge>[] graph=new ArrayList[v];
        createGraph(graph);
        //bfs(graph);
       // dfs(graph, 0, new boolean[v]);
        System.out.println(hasPath(graph, 0, 5, new boolean[v]));
    }
}
