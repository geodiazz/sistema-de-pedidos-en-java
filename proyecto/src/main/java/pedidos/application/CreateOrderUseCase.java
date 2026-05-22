package pedidos.application;

import pedidos.domain.Order;
import pedidos.ports.out.OrderRepository;

public class CreateOrderUseCase {
    private OrderRepository repository;

    // inyección de dependencia
    public CreateOrderUseCase(OrderRepository repository) {
        this.repository = repository;
    }

    public void createOrder(Order order) {

        if (order == null) {
            throw new IllegalArgumentException("el pedido no puede ser null");
        }

        repository.save(order);
    }


}
