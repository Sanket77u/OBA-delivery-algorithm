package simulation;

import model.Order;
import model.Courier;
import clustering.OrderClusterer;
import assignment.CourierMatcher;

import java.util.*;

public class Simulation {
    private List<Order> orders = new ArrayList<>();
    private List<Courier> couriers = new ArrayList<>();

    public void run() {
        generateOrders(10);
        generateCouriers(5);

        Map<Integer, List<Order>> clusters = OrderClusterer.clusterOrders(orders, 3);
        Map<Integer, List<Order>> assignments = CourierMatcher.matchCouriersToMultipleOrders(couriers, clusters);

        System.out.println("\nAssignments:");
        for (Map.Entry<Integer, List<Order>> entry : assignments.entrySet()) {
            System.out.print("Courier " + entry.getKey() + " assigned to orders: ");
            for (Order order : entry.getValue()) {
                System.out.print(order.id + " ");
            }
            System.out.println();
        }

        System.out.println("\nPending Orders:");
        for (List<Order> clusterOrders : clusters.values()) {
            for (Order order : clusterOrders) {
                System.out.println("Order " + order.id + " is still pending.");
            }
        }

        System.out.println("\nCourier Status:");
        for (Courier courier : couriers) {
            System.out.println("Courier " + courier.id + " is " + (courier.available ? "available" : "busy"));
        }
    }

    private void generateOrders(int n) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            orders.add(new Order(i, new double[]{rand.nextDouble() * 10, rand.nextDouble() * 10},
                                    new double[]{rand.nextDouble() * 10, rand.nextDouble() * 10},
                                    rand.nextInt(5) + 1, rand.nextInt(10) + 5));
        }
    }

    private void generateCouriers(int n) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            couriers.add(new Courier(i, new double[]{rand.nextDouble() * 10, rand.nextDouble() * 10}));
        }
    }
}