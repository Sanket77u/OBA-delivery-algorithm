package clustering;

import java.util.*;
import model.Order;

public class OrderClusterer {
    public static Map<Integer, List<Order>> clusterOrders(List<Order> orders, int maxClusters) {
        Map<Integer, List<Order>> clusters = new HashMap<>();
        int clusterCount = Math.min(maxClusters, orders.size());
        for (int i = 0; i < orders.size(); i++) {
            int clusterId = i % clusterCount;
            clusters.computeIfAbsent(clusterId, k -> new ArrayList<>()).add(orders.get(i));
        }
        return clusters;
    }
}