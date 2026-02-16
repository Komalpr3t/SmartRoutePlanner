# Smart Route Planner (Java)

This project is a Java-based route planning system that finds the shortest
path between cities using graph algorithms. It was built to understand how
real-world navigation systems work at a basic level using core data
structures and algorithms.

The focus of this project is **algorithmic logic and clean structure**, not UI.

---

## What the project does
- Lets the user add cities and roads
- Stores the map as a weighted graph
- Finds the shortest route between two cities
- Prints the actual path along with total distance
- Works through a simple menu-driven console interface

---

## Concepts used
- Graphs (Adjacency List)
- Dijkstra’s Algorithm
- Priority Queue
- HashMap and ArrayList
- Basic OOP and modular design

---

## Project structure
SmartRoutePlanner/
├── graph/
│ ├── Graph.java
│ ├── Edge.java
│ └── Node.java
│
├── algorithms/
│ └── Dijkstra.java
│
├── service/
│ ├── CityService.java
│ └── RouteService.java
│
└── Main.java

---

## How it works (brief)
Cities are treated as nodes in a graph and roads are treated as weighted
edges. Dijkstra’s Algorithm is used to calculate the minimum distance from
a source city to all other cities. A parent map is maintained to reconstruct
the final route.

---

## Time and space complexity
- Graph storage: O(V + E)
- Dijkstra’s Algorithm: O(E log V)
- Path reconstruction: O(V)

Where V is the number of cities and E is the number of roads.

---

## Example
Input:
A B 5
B C 3
A C 10

Output:
A -> B -> C
Total distance: 8

---

## Why I built this
I built this project to strengthen my understanding of graphs and shortest
path algorithms and to apply them in a realistic problem instead of isolated
coding questions.

---

## Possible improvements
- Add a GUI using JavaFX
- Load city and road data from a file
- Support multiple route options
- Convert this into a backend service

---

## Author
Komalpreet Kaur Grewal
B.Tech CSE
