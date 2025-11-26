import java.util.*;
import java.util.LinkedList;

public class GraphList {
    private Map<Integer,List<Integer>> map;

    GraphList(){
        map = new HashMap<>();
    }
    public void addVertex(int vertex ){
        map.put(vertex,new LinkedList<>());
    }
    public void addEdge(int source , int destination){
        map.get(source).add(destination);
        map.get(destination).add(source);
    }
    public void removeEdge(int source , int destination){
        map.get(source).remove(destination);
        map.get(destination).remove(source);
    }
    public void bfs(int v){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visit = new boolean[map.size()+1];
        q.add(v);
        visit[v]=true;
        while(q.size() != 0){
            int vertex = q.remove();
            System.out.print(vertex+" ");

            for(int i=0;i<map.get(vertex).size();i++){
                int av = map.get(vertex).get(i);
                if(!visit[av]){
                    q.add(av);
                    visit[av]=true;
                }
            }
        }
    }
    public void dfs(int st){
        Stack<Integer> stack = new Stack<>();
        boolean[] visit = new boolean[map.size()+1];
        stack.push(st);
        visit[st]=true;
        while(stack.size() != 0){
            int vertex = stack.pop();
            System.out.print(vertex+" ");
            for(int i=0;i<map.get(vertex).size();i++){
                int av = map.get(vertex).get(i);
                if(!visit[av]){
                    stack.push(av);
                    visit[av]=true;
                }
            }
        }
    }
    public void display(){
        System.out.print(map+" ");
    }
    public static void main(String[] args){
        GraphList gl = new GraphList();
        gl.addVertex(1);
        gl.addVertex(2);
        gl.addVertex(3);
        gl.addVertex(4);
        gl.addVertex(5);
        gl.addEdge(1,2);
        gl.addEdge(1,3);
        gl.addEdge(3,4);
        gl.addEdge(2,4);
        gl.addEdge(2,5);
        gl.addEdge(4,5);
        gl.bfs(1);
        System.out.println();
        gl.dfs(1);
        gl.display();

    }
}
