package pedidos.ports.out;

import pedidos.domain.Order;

public interface OrderRepository {
    void save(Order order);
    Order findOrderById(int id);

}
