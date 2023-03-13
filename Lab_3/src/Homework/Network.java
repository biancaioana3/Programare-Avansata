package Homework;

import java.util.ArrayList;
import java.util.List;

public class Network {
    private List<Object> nodes;

    public Network(){
        this.nodes = new ArrayList<>();
    }

    public void addNode(Object node){
        nodes.add(node);
    }
    public int getImportance(Object node){
        if (node instanceof Person) {
            return ((Person) node).getNumberOfConnections();
        } else if (node instanceof Company) {
            return ((Company) node).getNumberOfEmployees();
        } else {
            throw new IllegalArgumentException("Node necunoscut");
        }
    }
    public List<Object> getNodesOrderedByImportance() {
        List<Object> sortedNodes = new ArrayList<>(nodes);
        sortedNodes.sort((node1, node2) -> Integer.compare(getImportance(node2), getImportance(node1)));
        return sortedNodes;
    }
}
