package graph;

public class Node implements Comparable<Node> {
    public String city;
    public int distance;

    public Node(String city, int distance) {
        this.city = city;
        this.distance = distance;
    }

    @Override
    public int compareTo(Node other) {
        return Integer.compare(this.distance, other.distance);
    }
}
