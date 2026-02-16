package service;

import graph.Graph;

public class CityService {

    private Graph graph;

    public CityService(Graph graph) {
        this.graph = graph;
    }

    public void addCity(String city) {
        graph.addCity(city);
        System.out.println("City added: " + city);
    }

    public void addRoad(String from, String to, int distance) {
        graph.addRoad(from, to, distance);
        System.out.println("Road added between " + from + " and " + to);
    }

    public void printMap() {
        graph.printGraph();
    }
}
