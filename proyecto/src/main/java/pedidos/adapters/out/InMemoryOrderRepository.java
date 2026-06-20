package pedidos.adapters.out;

import pedidos.domain.Order;
import pedidos.ports.out.OrderRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryOrderRepository implements OrderRepository {

    // lista donde se guardarán los pedidos
    private List<Order> orders = new ArrayList<>();


    @Override
    public void save(Order order) {
        if (order == null) {
            throw new IllegalArgumentException("el pedido no puede ser null");
        }
        orders.add(order);
    }


    @Override
    public Order findOrderById(int id) {

        for (Order order : orders) {

            if (order.getId() == id) {
                return order;
            }
        }

        return null;
    }
}