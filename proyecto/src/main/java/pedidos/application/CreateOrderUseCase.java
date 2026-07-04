package pedidos.application;

import pedidos.domain.Order;
import pedidos.domain.OrderItem;
import pedidos.domain.Product;
import pedidos.ports.out.OrderRepository;

import java.util.ArrayList;

public class CreateOrderUseCase {
    private OrderRepository repository;

    // inyección de dependencia
    public CreateOrderUseCase(OrderRepository repository) {
        this.repository = repository;
    }

    public void createOrder(int id, int cantidad) {
        OrderItem item = new OrderItem(getById(id), cantidad);
        ArrayList<OrderItem> list = new ArrayList();
        list.add(item);
        repository.save(new Order(list));

    }


}
