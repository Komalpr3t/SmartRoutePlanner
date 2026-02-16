import graph.Graph;
import service.CityService;
import service.RouteService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph();
        CityService cityService = new CityService(graph);
        RouteService routeService = new RouteService(graph);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== SMART ROUTE PLANNER ===");
            System.out.println("1. Add City");
            System.out.println("2. Add Road");
            System.out.println("3. Find Shortest Route");
            System.out.println("4. Print Map");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter city name: ");
                    cityService.addCity(sc.nextLine());
                    break;

                case 2:
                    System.out.print("From city: ");
                    String from = sc.nextLine();
                    System.out.print("To city: ");
                    String to = sc.nextLine();
                    System.out.print("Distance: ");
                    int dist = sc.nextInt();
                    sc.nextLine();
                    cityService.addRoad(from, to, dist);
                    break;

                case 3:
                    System.out.print("Source city: ");
                    String src = sc.nextLine();
                    System.out.print("Destination city: ");
                    String dest = sc.nextLine();
                    routeService.findShortestRoute(src, dest);
                    break;

                case 4:
                    cityService.printMap();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        
    }
}
