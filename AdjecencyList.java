import java.util.*;
import java.util.LinkedList;

public class AdjecencyList {
    private Map<Integer,List<Integer>> map ;

    AdjecencyList(){
        this.map = new HashMap<>();
    }
    public void addVertex(int vertex){
        map.put(vertex,new LinkedList<>());
    }
    public void addEdge(int source ,int destination){
        map.get(source).add(destination);
        map.get(destination).add(source);
    }
    public void removeEdge(int source , int destination){
        map.get(source).add(destination);
        map.get(destination).add(source);
    }
    public void display(){
        System.out.println(map);
    }
    public static void main(String[] args){
        AdjecencyList al = new AdjecencyList();
        al.addVertex(1);
        al.addVertex(2);
        al.addVertex(3);
        al.addVertex(4);
        al.addEdge(1,2);
        al.addEdge(2,3);
        al.addEdge(4,3);
        al.addVertex(5);
        al.addEdge(5,1);
        al.addEdge(5,2);
        al.display();
    }
}
