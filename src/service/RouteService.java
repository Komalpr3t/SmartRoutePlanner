package service;

import algorithms.Dijkstra;
import graph.Graph;

import java.util.List;

public class RouteService {

    private Graph graph;

    public RouteService(Graph graph) {
        this.graph = graph;
    }

    // Shortest distance route
    public void findShortestRoute(String source, String destination) {

        if (!graph.getCities().contains(source) ||
            !graph.getCities().contains(destination)) {
            System.out.println("Invalid city name.");
            return;
        }

        List<String> path = Dijkstra.shortestPath(graph, source, destination);

        if (path.isEmpty()) {
            System.out.println("No route available.");
            return;
        }

        int distance = Dijkstra.shortestDistance(graph, source, destination);

        System.out.println("Shortest Route:");
        System.out.println(String.join(" -> ", path));
        System.out.println("Total Distance: " + distance + " km");
    }
}
