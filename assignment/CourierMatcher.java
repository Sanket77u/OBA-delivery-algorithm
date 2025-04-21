package assignment;

import java.util.*;
import model.Courier;
import model.Order;

public class CourierMatcher {
    public static Map<Integer, List<Order>> matchCouriersToMultipleOrders(List<Courier> couriers, Map<Integer, List<Order>> clusters) {
        Map<Integer, List<Order>> result = new HashMap<>();
        int courierIndex = 0;

        for (Map.Entry<Integer, List<Order>> entry : clusters.entrySet()) {
            List<Order> clusterOrders = entry.getValue();
            while (!clusterOrders.isEmpty() && courierIndex < couriers.size()) {
                Courier courier = couriers.get(courierIndex);
                if (courier.available) {
                    List<Order> assigned = new ArrayList<>();
                    int count = Math.min(2, clusterOrders.size()); // Assign 2 orders per courier max
                    for (int i = 0; i < count; i++) {
                        assigned.add(clusterOrders.remove(0));
                    }
                    result.put(courier.id, assigned);
                    courier.available = false;
                }
                courierIndex++;
            }
        }

        return result;
    }
}