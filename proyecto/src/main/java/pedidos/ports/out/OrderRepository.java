package pedidos.ports.out;

import pedidos.domain.Order;

import java.util.List;

public interface OrderRepository {
    void save(Order order);
    Order findOrderById(int id);
    List<Order> findAll();
    void prosesar(int id);
    void enviar(int id);
    void marcarComoPagado(int id);
}
