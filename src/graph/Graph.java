package graph;

import java.util.*;

public class Graph {

    private Map<String, List<Edge>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    // Add a city (node)
    public void addCity(String city) {
        adjList.putIfAbsent(city, new ArrayList<>());
    }

    // Add a road (edge) - bidirectional
    public void addRoad(String from, String to, int distance) {
        addCity(from);
        addCity(to);

        adjList.get(from).add(new Edge(to, distance));
        adjList.get(to).add(new Edge(from, distance));
    }

    // Get neighbors
    public List<Edge> getNeighbors(String city) {
        return adjList.getOrDefault(city, new ArrayList<>());
    }

    // Get all cities
    public Set<String> getCities() {
        return adjList.keySet();
    }

    // Print graph (for debugging)
    public void printGraph() {
        for (String city : adjList.keySet()) {
            System.out.print(city + " -> ");
            for (Edge edge : adjList.get(city)) {
                System.out.print(edge.getTo() + "(" + edge.getWeight() + ") ");
            }
            System.out.println();
        }
    }
}
