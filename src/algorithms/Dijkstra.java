package algorithms;

import graph.Edge;
import graph.Graph;
import graph.Node;

import java.util.*;

public class Dijkstra {

    public static List<String> shortestPath(Graph graph, String source, String destination) {

        // Distance from source to each city
        Map<String, Integer> distance = new HashMap<>();

        // To reconstruct path
        Map<String, String> parent = new HashMap<>();

        // Min-heap based on distance
        PriorityQueue<Node> pq = new PriorityQueue<>();

        // Initialize distances
        for (String city : graph.getCities()) {
            distance.put(city, Integer.MAX_VALUE);
        }

        distance.put(source, 0);
        pq.add(new Node(source, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            String currCity = current.city;

            // Early exit (optimization)
            if (currCity.equals(destination)) {
                break;
            }

            for (Edge edge : graph.getNeighbors(currCity)) {
                String neighbor = edge.getTo();
                int newDist = distance.get(currCity) + edge.getWeight();

                if (newDist < distance.get(neighbor)) {
                    distance.put(neighbor, newDist);
                    parent.put(neighbor, currCity);
                    pq.add(new Node(neighbor, newDist));
                }
            }
        }

        // If destination unreachable
        if (!distance.containsKey(destination) ||
            distance.get(destination) == Integer.MAX_VALUE) {
            return Collections.emptyList();
        }

        // Reconstruct path
        List<String> path = new ArrayList<>();
        String curr = destination;

        while (curr != null) {
            path.add(curr);
            curr = parent.get(curr);
        }

        Collections.reverse(path);
        return path;
    }

    // Optional: get only distance
    public static int shortestDistance(Graph graph, String source, String destination) {
        List<String> path = shortestPath(graph, source, destination);
        if (path.isEmpty()) return -1;

        int dist = 0;
        for (int i = 0; i < path.size() - 1; i++) {
            for (Edge e : graph.getNeighbors(path.get(i))) {
                if (e.getTo().equals(path.get(i + 1))) {
                    dist += e.getWeight();
                    break;
                }
            }
        }
        return dist;
    }
}
